package travelAgency.common.solutions.service;

import java.util.List;
import travelAgency.common.buisness.exception.TravelAgencyUncheckedException;

public interface BaseService<TYPE, ID> {

    void insert(TYPE entity);

    void update(TYPE entity);

    TYPE findById(ID id);

    void deleteById(ID id) throws TravelAgencyUncheckedException;

    void delete(TYPE entity);

    void printAll();

    List<TYPE> findAll();

}

