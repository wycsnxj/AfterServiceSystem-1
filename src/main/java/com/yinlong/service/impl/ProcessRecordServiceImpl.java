package com.yinlong.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.yinlong.dao.IProcessRecordDao;
import com.yinlong.entity.Feedback;
import com.yinlong.entity.ProcessRecord;
import com.yinlong.entity.Reply;
import com.yinlong.entity.User;
import com.yinlong.service.IProcessRecordService;

@Service("processRecordService")
@Transactional(propagation = Propagation.REQUIRED)
public class ProcessRecordServiceImpl implements IProcessRecordService {

	@Resource(name = "processRecordDao")
	private IProcessRecordDao processRecordDao;
	
	public void setProcessRecordDao(IProcessRecordDao processRecordDao) {
		this.processRecordDao = processRecordDao;
	}

	/**
	 * 添加ProcessRecord
	 * @param processRecord
	 * @return
	 */
	@Override
	public boolean addProcessRecord(ProcessRecord processRecord) {
		return processRecordDao.addProcessRecord(processRecord);
	}

	/**
	 * 根据映射的Feedback的ID查询所有相关的ProcessRecord
	 * @param feedback
	 * @return
	 */
	@Override
	public List<ProcessRecord> findProcessRecordByFeedbackId(Feedback feedback) {
		String hql = "from ProcessRecord where feedback.docId = '" + feedback.getDocId() + "' ";
		return processRecordDao.findProcessRecordListByFeedbackId(hql);
	}

	/**
	 * 根据映射的Reply的ID查询所有相关的ProcessRecord
	 * @param reply
	 * @return
	 */
	@Override
	public List<ProcessRecord> findProcessRecordOnReply(Reply reply) {
		String hql = "";
		return processRecordDao.findProcessRecordListByFeedbackId(hql);
	}

}
