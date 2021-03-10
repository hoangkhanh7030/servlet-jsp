package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.INewDao;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.INewService;

public class NewService implements INewService{
	@Inject
	private INewDao newDao;
	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		// TODO Auto-generated method stub
		return newDao.findByCategoryId(categoryId);
	}

}
