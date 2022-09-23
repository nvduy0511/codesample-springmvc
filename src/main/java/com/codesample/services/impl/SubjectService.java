package com.codesample.services.impl;

import com.codesample.entities.Subject;
import com.codesample.entities.User;
import com.codesample.repositories.SubjectRepository;
import com.codesample.services.ISubjectService;
import com.codesample.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService implements ISubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }
}
