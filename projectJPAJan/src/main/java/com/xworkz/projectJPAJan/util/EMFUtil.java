package com.xworkz.projectJPAJan.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {

    private static EntityManagerFactory entityManagerFactory;

    public static EntityManagerFactory GetEntityManagerFactory() {
        return entityManagerFactory;
    }

    static{
        System.out.println("created EMF util");
        entityManagerFactory= Persistence.createEntityManagerFactory("x-workz");

    }
}
