package com.xworkz.katera.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPARunnerToFetchWeaknessFromPower {

    public static void main(String[] args) {

       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println("emf created"+emf);

       EntityManager em= emf.createEntityManager();
        System.out.println("em created"+em);
       Query query4= em.createNamedQuery("findWeaknessByPower");

        System.out.println("created query");
       query4.setParameter("wn","catcher");
       Object object4=query4.getSingleResult();
       String str4=(String)object4;
        System.out.println("weakness fetched :"+str4);
        em.close();
        emf.close();


    }

}
