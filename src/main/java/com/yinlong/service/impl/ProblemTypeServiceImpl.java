package com.yinlong.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yinlong.dao.IProblemTypeDao;
import com.yinlong.entity.ProblemType;
import com.yinlong.service.IProblemTypeService;

@Service("problemTypeService")
@Transactional(propagation = Propagation.REQUIRED)
public class ProblemTypeServiceImpl implements IProblemTypeService {

	@Resource(name = "problemTypeDao")
	private IProblemTypeDao problemTypeDao;

	public void setProblemTypeDao(IProblemTypeDao problemTypeDao) {
		this.problemTypeDao = problemTypeDao;
	}


	/**
	 * 查询所有的ProblemType
	 * @return
	 */
	@Override
	public List<ProblemType> findProblemTypeList() {
		String hql = "select new ProblemType(pbtId, pbtName) from ProblemType";
		return problemTypeDao.findProblemTypeList(hql);
	}

}
