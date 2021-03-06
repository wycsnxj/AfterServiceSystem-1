package com.yinlong.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.yinlong.dao.IReplyDao;
import com.yinlong.dao.IReplyDeadlineDao;
import com.yinlong.entity.Deadline;
import com.yinlong.entity.Notified;
import com.yinlong.entity.Reply;
import com.yinlong.entity.User;
import com.yinlong.service.IDeadlineService;
import com.yinlong.service.IReplyDeadlineService;

@Service("replyDeadlineService")
@Transactional(propagation = Propagation.REQUIRED)
public class ReplyDeadlineServiceImpl implements IReplyDeadlineService {

	@Resource(name = "replyDeadlineDao")
	private IReplyDeadlineDao replyDeadlineDao;
	@Resource(name = "replyDao")
	private IReplyDao replyDao;
	
	public void setReplyDeadlineDao(IReplyDeadlineDao replyDeadlineDao) {
		this.replyDeadlineDao = replyDeadlineDao;
	}

	/**
	 * 添加
	 */
	@Override
	public boolean addReplyDeadline(Reply reply) {
		return replyDeadlineDao.addReplyDeadline(reply);
	}

	/**
	 * 该Deadline的所有Reply是否都答复完毕
	 * @param notified
	 * @return
	 */
	@Override
	public boolean ReplyIsHandleEnd(Deadline deadline) {
		String hql = "select count(*) from Reply where deadline.deaId = " + deadline.getDeaId() + " and repHandleStep != 3";
		if (replyDao.findReplyCount(hql) == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 查询未处理的答复单
	 * @param repHandleStep
	 * @return
	 */
	@Override
	public List<Reply> findReplyOnDeadline(int repHandleStep) {
		User user = (User) ActionContext.getContext().getSession().get("user_login");
		String hql = "from Reply r where r.deadline.placeFile.feedback.process.proId=9 and r.repHandleStep=" + repHandleStep + " "
				+ "and r.department.deptId=" + user.getSection().getDepartment().getDeptId();
		return replyDeadlineDao.findReplyListDeadline(hql);
	}

	/**
	 * 查询所有待确认申请的答复单
	 * @param repHandleStep
	 * @return
	 */
	@Override
	public List<Reply> findReplyOnDelay(int repHandleStep) {
		String hql = "select r from Reply r left join ProcessRecord p on r.deadline.placeFile.feedback.docId = p.feedback.docId "
				+ "where (p.process.proId = 16 or p.process.proId = 17 or p.process.proId = 18) and r.repHandleStep = " + repHandleStep + " "	// 待确认申请
				+ "and r.deadline.placeFile.feedback.process.proId = 9 "								// 当前反馈单节点在答复中9
				+ "and r.department.deptId = p.user.section.department.deptId";																
		return replyDeadlineDao.findReplyListDeadline(hql);
	}

	/**
	 * 根据Deadline查询Reply
	 */
	@Override
	public List<Reply> findReplyByDeadline(Deadline deadline) {
		String hql = "from Reply where deadline.deaId = " + deadline.getDeaId();
		return replyDeadlineDao.findReplyListDeadline(hql);
	}

	/**
	 * 根据ID查询Reply
	 * @param reply
	 * @return
	 */
	@Override
	public Reply findReplyById(Reply reply) {
		return replyDeadlineDao.findReplyByIdDeadline(reply);
	}


}
