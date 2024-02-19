package com.xworkz.projectJPAJan.repository;

import com.xworkz.projectJPAJan.entity.FertilizerEntity;
import com.xworkz.projectJPAJan.util.EMFUtil;

import javax.persistence.*;
import java.util.List;

public class FertilizerRepositoryImpl implements FertilizerRepository{

    EntityManagerFactory emf= EMFUtil.GetEntityManagerFactory();

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

    @Override
    public void saveAll(List<FertilizerEntity> list) {
        EntityManager em=emf.createEntityManager();
       EntityTransaction et= em.getTransaction();

        try{
            System.out.println("et begin"+et);
            et.begin();
            list.forEach(e->em.persist(e));
            et.commit();
            System.out.println("details saved successfully");
            System.out.println(list);

        }
        catch(PersistenceException pe){
            System.err.println("PersistenceException in save method"+pe.getMessage());
            et.rollback();
        }

        finally{

            System.out.println("closing resources");
            em.close();
        }

    }

    @Override
    public List<FertilizerEntity> findAllByCost(int cost) {


        EntityManager em=emf.createEntityManager();
        EntityTransaction et= em.getTransaction();

        try{
            System.out.println("et begin"+et);
            et.begin();
           Query query= em.createNamedQuery("findAllByCost");
           query.setParameter("ct",cost);
          List<FertilizerEntity> list= query.getResultList();

            et.commit();
            System.out.println("details saved successfully");
            return list;

        }
        catch(PersistenceException pe){
            System.err.println("PersistenceException in save method"+pe.getMessage());
            et.rollback();
        }

        finally{

            System.out.println("closing resources");
            em.close();
        }


        return FertilizerRepository.super.findAllByCost(cost);
    }
}
