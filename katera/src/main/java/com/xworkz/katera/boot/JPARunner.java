package com.xworkz.katera.boot;

import com.xworkz.katera.entity.KateraEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner  {

    public static void main(String[] args) {


       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       System.out.println(emf);

       EntityManager em= emf.createEntityManager();
        System.out.println("EM"+em);
        EntityTransaction et=em.getTransaction();
        System.out.println("ET"+et);
        et.begin();

        System.out.println("ET begin");
        System.out.println("starting operation");
        KateraEntity kateraEntity=new KateraEntity(2,"venu","hero","India","catcher","girls");

        em.persist(kateraEntity);
        System.out.println("operation complete");
        et.commit();

        System.out.println("ET commit");
        System.out.println("CLosing EM , EMF");
        em.close();
        emf.close();


    }

}
