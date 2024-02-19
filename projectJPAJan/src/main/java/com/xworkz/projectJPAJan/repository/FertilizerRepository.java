package com.xworkz.projectJPAJan.repository;

import com.xworkz.projectJPAJan.entity.FertilizerEntity;

import java.util.Collections;
import java.util.List;

public interface FertilizerRepository {

    Integer save(FertilizerEntity entity);

    void saveAll(List<FertilizerEntity> list);

    default List<FertilizerEntity> findAllByCost(int cost){
        return Collections.emptyList();
    }

}
