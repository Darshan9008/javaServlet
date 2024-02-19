package com.xworkz.taskJPA31Jan.repository;

import com.xworkz.taskJPA31Jan.entity.HouseEntity;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface HouseRepository {

Integer save(HouseEntity houseEntity);

default void deleteByName(String name){

}

    default void updateNameByAddress(String name,String address){

    }

    default HouseEntity findById(int id){
    return null;
    }

    default List<String> findAllByAddress(String address){
       return Collections.emptyList();
    }

    default HouseEntity findByName(String name){
    return null;
    }


    List<String> findAllByAddress();
}
