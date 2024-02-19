package com.xworkz.katera.boot;

import com.xworkz.katera.entity.KateraEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPARunner1 {

    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        Query query=em.createNamedQuery("findByRealName");

        query.setParameter("rn","Darshan");

        Object object= query.getSingleResult();
        KateraEntity entity=(KateraEntity)object;
        System.out.println("Entity from DB"+entity);

        em.close();
        emf.close();



    }

}
