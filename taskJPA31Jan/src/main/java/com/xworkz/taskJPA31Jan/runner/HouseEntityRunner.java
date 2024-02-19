package com.xworkz.taskJPA31Jan.runner;

import com.xworkz.taskJPA31Jan.entity.HouseEntity;
import com.xworkz.taskJPA31Jan.repository.HouseRepository;
import com.xworkz.taskJPA31Jan.repository.HouseRepositoryImpl;

import java.util.Arrays;
import java.util.List;

public class HouseEntityRunner {

    public static void main(String[] args) {

        HouseEntity entity=new HouseEntity(10,"darshan","bengaluru",577301l);
        HouseEntity entity1=new HouseEntity(11,"chandan","shimoga",577222l);
        HouseEntity entity2=new HouseEntity(12,"venu","bhadravathi",577302l);
        HouseEntity entity3=new HouseEntity(13,"jeevan","hosmane",577303l);

        List<HouseEntity> list= Arrays.asList(entity,entity1,entity2,entity3);
        HouseRepository repo=new HouseRepositoryImpl();
        repo.save(entity);
        repo.save(entity1);
        repo.save(entity2);
        repo.save(entity3);
        System.out.println("house details are"+entity);
       // repo.deleteByName("darshan");

        //repo.updateNameByAddress("rakshi","hosmane");

       // repo.findById(11);

       // repo.findAllByAddress().forEach(e-> System.out.println(e));

        repo.findByName("chandan");

















    }
}
