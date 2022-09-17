package com.codesample.services.impl;

import com.codesample.entities.NewEntity;
import com.codesample.repositories.NewRepository;
import com.codesample.services.INewService;
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
