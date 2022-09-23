package com.codesample.services.impl;

import com.codesample.entities.Theory;
import com.codesample.repositories.TheoryRepository;
import com.codesample.services.ITheoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheoryService implements ITheoryService {
    @Autowired
    TheoryRepository theoryRepository;

    @Override
    public List<Theory> findAllByIdSubject(int id) {
        return theoryRepository.findAllBySubject_Id(id);
    }

    @Override
    public Theory findOne(int id) {
        return theoryRepository.findOne(id);
    }

}
