package com.xworkz.katera.boot;

import com.xworkz.katera.entity.KateraEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAUpdateRunner {

    public static void main(String[] args) {

       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");

       EntityManager em= emf.createEntityManager();

      EntityTransaction et= em.getTransaction();

      et.begin();

     KateraEntity kateraEntity= em.find(KateraEntity.class,1);
     if(kateraEntity!=null){
         kateraEntity.setRealName("Darshan");

         em.merge(kateraEntity);
         System.out.println("update successfully");

     }
     else{
         System.out.println("delete update not done successfully");
     }
     et.commit();

     em.close();
     emf.close();

    }


}
