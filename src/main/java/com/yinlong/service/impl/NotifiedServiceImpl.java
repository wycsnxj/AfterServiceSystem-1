package com.yinlong.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.yinlong.dao.INotifiedDao;
import com.yinlong.entity.Notified;
import com.yinlong.entity.Process;
import com.yinlong.entity.User;
import com.yinlong.service.INotifiedService;

@Service("notifiedService")
@Transactional(propagation = Propagation.REQUIRED)
public class NotifiedServiceImpl implements INotifiedService {

	@Resource(name = "notifiedDao")
	private INotifiedDao notifiedDao;
	
	public void setNotifiedDao(INotifiedDao notifiedDao) {
		this.notifiedDao = notifiedDao;
	}

	/**
	 * 查询所有的Notified
	 * @return
	 */
	@Override
	public List<Notified> findNotifiedList() {
		String hql = "from Notified";
		return notifiedDao.findNotifiedList(hql);
	}

	/**
	 * 添加Notified
	 * @param notified
	 * @return
	 */
	@Override
	public boolean addNotified(Notified notified) {
		return notifiedDao.addNotified(notified);
	}

	/**
	 * 根据ID查询Notified
	 * @param notified
	 * @return
	 */
	@Override
	public Notified findNotifiedById(Notified notified) {
		return notifiedDao.findNotifiedById(notified);
	}

	/**
	 * 待考核通报
	 */
	@Override
	public List<Notified> findNotifiedListOnPending() {
		String hql = "from Notified where placeFile.feedback.process.proId = 4";
		return notifiedDao.findNotifiedList(hql);
	}

	/**
	 * 待审核审批
	 * @return
	 */
	@Override
	public List<Notified> findNotifiedListPending(int proId) {
		String hql = "from Notified where placeFile.feedback.process.proId = " + proId;
		return notifiedDao.findNotifiedList(hql);
	}

	/**
	 * 答复单位须答复的Notified
	 * @param 
	 * @return
	 */
	@Override
	public List<Notified> findNotifiedListOnReply() {
		User u = (User) ActionContext.getContext().getSession().get("user_login");
		String hql = "select n from Notified n left join n.placeFile.feedback.appSet s where n.placeFile.feedback.process.proId = 9 and s.department.deptId = " + u.getSection().getDepartment().getDeptId();
		return notifiedDao.findNotifiedList(hql);
	}

	/**
	 * 查询所有答复完成待下结论的Notified
	 * @return
	 */
	@Override
	public List<Notified> findNotifiedListOnConclusion() {
		String hql = "from Notified where placeFile.feedback.process.proId =15";
		return notifiedDao.findNotifiedList(hql);
	}

}
