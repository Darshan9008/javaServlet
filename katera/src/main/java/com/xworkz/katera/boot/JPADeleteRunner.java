package com.xworkz.katera.boot;

import com.xworkz.katera.entity.KateraEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPADeleteRunner {
    public static void main(String[] args) {

      EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
      EntityManager em= emf.createEntityManager();
        System.out.println("Em"+em);
       EntityTransaction et= em.getTransaction();
       et.begin();

     KateraEntity kateraEntity=  em.find(KateraEntity.class,2);
     if(kateraEntity!=null){
         em.remove(kateraEntity);
         System.out.println("data deleted successfully");

     }
     else{
         System.out.println("data is not found");
     }

     et.commit();

     em.close();
     emf.close();



    }

}
