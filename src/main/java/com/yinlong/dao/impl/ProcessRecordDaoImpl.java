package com.yinlong.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yinlong.dao.IProcessRecordDao;
import com.yinlong.entity.Feedback;
import com.yinlong.entity.ProcessRecord;

@Repository("processRecordDao")
public class ProcessRecordDaoImpl extends BaseDao implements IProcessRecordDao {

	/**
	 * 添加ProcessRecor
	 * @param processRecord
	 * @return
	 */
	@Override
	public boolean addProcessRecord(ProcessRecord processRecord) {
		try {
			getSession().saveOrUpdate(processRecord);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * 根据映射的Feedback的ID查询所有相关的ProcessRecord
	 * @param feedback
	 * @return
	 */
	@Override
	public List<ProcessRecord> findProcessRecordListByFeedbackId(String hql) {
		try {
			return getSession().createQuery(hql).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
