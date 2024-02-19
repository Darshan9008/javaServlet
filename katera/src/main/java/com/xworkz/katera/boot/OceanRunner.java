package com.xworkz.katera.boot;

import com.xworkz.katera.entity.OceanEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OceanRunner {


    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("emf is created.." + emf);
        EntityManager em = emf.createEntityManager();
        System.out.println("em is created..." + em);
        EntityTransaction et = em.getTransaction();
        et.begin();
        System.out.println("entity transection is begains..");
        OceanEntity oceanEntity1 = new OceanEntity(2, "bay of bengal", 20000, 36, "east india");
        OceanEntity oceanEntity2 = new OceanEntity(3, "indina ocean", 30000, 36, "east india");
        OceanEntity oceanEntity3 = new OceanEntity(4, "karavali", 40000, 26, "west india");
        OceanEntity oceanEntity4 = new OceanEntity(5, "kanakumary", 10000, 46, "south india");

        em.persist(oceanEntity1);
        em.persist(oceanEntity2);
        em.persist(oceanEntity3);
        em.persist(oceanEntity4);

        et.commit();
        System.out.println("commit tyhe entity tranaction..");
        System.out.println("closing the em and amf....");

        em.close();
        emf.close();

    }
}