package com.yinlong.dao;

import java.util.List;

import com.yinlong.entity.Notified;

public interface INotifiedDao {

	/**
	 * 添加Notified
	 * @param notified
	 * @return
	 */
	public boolean addNotified(Notified notified);

	/**
	 * 查询所有的Notified
	 * @param hql
	 * @return
	 */
	public List<Notified> findNotifiedList(String hql);
	
	/**
	 * 根据ID查询Notified
	 * @param notified
	 * @return
	 */
	public Notified findNotifiedById(Notified notified);
	
}
