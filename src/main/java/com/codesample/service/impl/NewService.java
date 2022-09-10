package com.codesample.service.impl;

import com.codesample.entity.NewEntity;
import com.codesample.repository.NewRepository;
import com.codesample.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewService implements INewService {
	
	@Autowired
	private NewRepository newRepository;
	
	@Override
	public List<NewEntity> findAll() {
		return newRepository.findAll();
	}
}
