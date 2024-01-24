package com.xworkz.projectJPAJan.boot;

import com.xworkz.projectJPAJan.entity.FertilizerEntity;
import com.xworkz.projectJPAJan.repository.FertilizerRepository;
import com.xworkz.projectJPAJan.repository.FertilizerRepositoryImpl;

import java.time.LocalDate;

public class FertilzerRunner {

    public static void main(String[] args) {

        FertilizerEntity entity=new FertilizerEntity(10,"potassium","plants",1200, LocalDate.of(2016,4,5));
        FertilizerRepository repo=new FertilizerRepositoryImpl();
        repo.save(entity);


    }
}
