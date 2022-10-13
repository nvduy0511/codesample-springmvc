package com.codesample.services;

import com.codesample.entities.Theory;

import java.util.List;

public interface ITheoryService {
    List<Theory> findAllByIdSubject(int id);
    Theory findOne(int id);
    int getCountTheory();
}
