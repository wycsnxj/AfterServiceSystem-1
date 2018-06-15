package com.yinlong.service;

import com.yinlong.entity.Feedback;

public interface IFeedbackService {

	/**
	 * 添加反馈单
	 * @param feedback
	 * @return
	 */
	public boolean addOrUpdateFeedback(Feedback feedback);
	
	/**
	 * 根据id查询反馈单
	 * @param feedback
	 * @return
	 */
	public Feedback findFeedbackById(Feedback feedback);
}
