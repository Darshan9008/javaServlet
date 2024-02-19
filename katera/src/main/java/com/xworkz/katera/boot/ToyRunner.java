package com.xworkz.katera.boot;

import com.xworkz.katera.entity.ToyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ToyRunner {

    public static void main(String[] args) {

      EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);

        EntityManager em=emf.createEntityManager();
        System.out.println("EM"+em);
        EntityTransaction  et= em.getTransaction();
        System.out.println("ET"+et);
        et.begin();

        System.out.println("ET begin");
        System.out.println("starting operation");

        ToyEntity toyEntity=new ToyEntity(1,"spiderman","red","1200","synthetic");
        ToyEntity toyEntity1=new ToyEntity(2,"barbie","white","2000","cotton");


        em.persist(toyEntity);
        em.persist(toyEntity1);
        System.out.println("operation complete");
        et.commit();

        System.out.println("ET commit");
        System.out.println("CLosing EM , EMF");
        em.close();
        emf.close();





    }


}
