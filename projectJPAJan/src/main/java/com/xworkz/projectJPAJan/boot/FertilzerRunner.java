package com.xworkz.projectJPAJan.boot;

import com.xworkz.projectJPAJan.entity.FertilizerEntity;
import com.xworkz.projectJPAJan.repository.FertilizerRepository;
import com.xworkz.projectJPAJan.repository.FertilizerRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FertilzerRunner {

    public static void main(String[] args) {

        FertilizerRepository repo=new FertilizerRepositoryImpl();


        FertilizerEntity entity1=new FertilizerEntity("urea","tree",1500, LocalDate.of(2017,4,5));

        FertilizerEntity entity2=new FertilizerEntity("sodium","unwanted plants",1700, LocalDate.of(2018,4,5));

        FertilizerEntity entity3=new FertilizerEntity("calcium","crops",1800, LocalDate.of(2019,4,5));

        FertilizerEntity entity4=new FertilizerEntity("Zinc","Arecanut",1900, LocalDate.of(2020,4,5));

        List<FertilizerEntity> entities= Arrays.asList(entity1,entity2,entity3,entity4);
       // repo.saveAll(entities);

       List<FertilizerEntity> list1= repo.findAllByCost(1200);
       list1.forEach(e-> System.out.println(e));


    }
}
