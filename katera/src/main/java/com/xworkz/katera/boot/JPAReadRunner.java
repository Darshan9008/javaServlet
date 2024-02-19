package com.xworkz.katera.boot;

import com.xworkz.katera.entity.KateraEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAReadRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
         EntityManager em =emf.createEntityManager();

        System.out.println("EM"+em);
        EntityTransaction et=em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("ET begin");
        KateraEntity kateraEntity=em.find(KateraEntity.class,1);
        et.commit();
        System.out.println("entity found"+kateraEntity);
        System.out.println("closing em,emf");
        em.close();
        emf.close();
        System.out.println("closed em,emf");



    }



}
