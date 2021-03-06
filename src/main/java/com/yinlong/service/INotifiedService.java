package com.yinlong.service;

import java.util.List;

import com.yinlong.entity.Notified;
import com.yinlong.entity.Process;

public interface INotifiedService {
	
	/**
	 * 添加Notified
	 * @param notified
	 * @return
	 */
	public boolean addNotified(Notified notified);
	
	/**
	 * 查询所有的Notified
	 * @return
	 */
	public List<Notified> findNotifiedList();

	/**
	 * 根据ID查询Notified
	 * @param notified
	 * @return
	 */
	public Notified findNotifiedById(Notified notified);

	/**
	 * 待考核通报
	 * @return
	 */
	public List<Notified> findNotifiedListOnPending();
	
	/**
	 * 查询所有未处理的Notified
	 * @param proId
	 * @return
	 */
	public List<Notified> findNotifiedListPending(int proId);

	/**
	 * 答复单位须答复的Notified
	 * @param 
	 * @return
	 */
	public List<Notified> findNotifiedListOnReply();
	
	/**
	 * 查询所有还在答复阶段的Notified
	 * @return
	 */
	public List<Notified> findNotifiedListOnConclusion();
}
