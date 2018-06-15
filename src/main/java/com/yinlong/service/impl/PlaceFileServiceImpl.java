package com.yinlong.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yinlong.dao.IPlaceFileDao;
import com.yinlong.entity.PlaceFile;
import com.yinlong.service.IPlaceFileService;

@Service("placeFileService")
@Transactional(propagation = Propagation.REQUIRED)
public class PlaceFileServiceImpl implements IPlaceFileService {

	@Resource(name = "placeFileDao")
	private IPlaceFileDao placeFileDao;
	
	public void setPlaceFileDao(IPlaceFileDao placeFileDao) {
		this.placeFileDao = placeFileDao;
	}
	
	/**
	 * 添加归档
	 * @param placeFile
	 * @return
	 */
	@Override
	public boolean addPlaceFile(PlaceFile placeFile) {
		
		return placeFileDao.addPlaceFile(placeFile);
	}

}
