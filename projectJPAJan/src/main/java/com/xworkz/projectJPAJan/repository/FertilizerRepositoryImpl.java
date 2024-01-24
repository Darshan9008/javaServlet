package com.xworkz.projectJPAJan.repository;

import com.xworkz.projectJPAJan.entity.FertilizerEntity;

import javax.persistence.*;

public class FertilizerRepositoryImpl implements FertilizerRepository{

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(FertilizerEntity entity) {
        EntityManager em=emf.createEntityManager();
       EntityTransaction et= em.getTransaction();
       try{
           System.out.println("et beign"+et);
           et.begin();
           System.out.println("entity persist");
           em.persist(entity);
           System.out.println("commit the entity");
           et.commit();
           return entity.getId();
       }
       catch(PersistenceException pe){

           System.err.println("PersistenceException in a save method"+pe.getMessage());
           et.rollback();
        }
       finally {
           System.out.println("closing the entity manager");
           em.close();
       }
        return null;
    }
}
