package com.xworkz.projectJPAJan.repository;

import com.xworkz.projectJPAJan.entity.DiseaseEntity;

import javax.persistence.*;

public class DiseaseRepositoryImpl implements DiseaseRepository{

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(DiseaseEntity entity) {

        EntityManager em= emf.createEntityManager();
       EntityTransaction et= em.getTransaction();

        try{
            System.out.println("starting et"+et);
            et.begin();
            System.out.println("starting persist");
            em.persist(entity);
            System.out.println("persist success");
            et.commit();
            return entity.getId();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in save method of disease"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("closing the entitymanager");
            em.close();
        }

        return null;
    }
}
