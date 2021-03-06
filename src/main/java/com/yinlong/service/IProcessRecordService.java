package com.yinlong.service;

import java.util.List;

import com.yinlong.entity.Feedback;
import com.yinlong.entity.ProcessRecord;
import com.yinlong.entity.Reply;

public interface IProcessRecordService {

	/**
	 * 添加ProcessRecord
	 * @param processRecord
	 * @return
	 */
	public boolean addProcessRecord(ProcessRecord processRecord);

	/**
	 * 根据映射的Feedback的ID查询所有相关的ProcessRecord
	 * @param feedback
	 * @return
	 */
	public List<ProcessRecord> findProcessRecordByFeedbackId(Feedback feedback);
	
	/**
	 * 根据映射的Reply的ID查询所有相关的ProcessRecord
	 * @param reply
	 * @return
	 */
	public List<ProcessRecord> findProcessRecordOnReply(Reply reply);
}
