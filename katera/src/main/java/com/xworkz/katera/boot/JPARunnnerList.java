package com.xworkz.katera.boot;

import com.xworkz.katera.entity.KateraEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class JPARunnnerList {

    public static void main(String[] args) {

      EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");

     EntityManager em= emf.createEntityManager();

     Query query= em.createNamedQuery("findAll");

     List<KateraEntity>  list=query.getResultList();
     list.forEach(e->System.out.println(e));
     em.close();
     emf.close();


    }


}
