package com.xworkz.taskJPA31Jan.repository;

import com.xworkz.taskJPA31Jan.entity.HouseEntity;
import com.xworkz.taskJPA31Jan.util.EMFUtil;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class HouseRepositoryImpl implements HouseRepository{

    private EntityManagerFactory emf= EMFUtil.getManagerFactory();


    @Override
    public Integer save(HouseEntity houseEntity) {

        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            System.out.println("et begin"+et);
            em.persist(houseEntity);
            et.commit();
            System.out.println("house entity saved successfully");

            return houseEntity.getId();

        }
        catch(PersistenceException pe){
            et.rollback();
            System.out.println("PersistenceException in house entity "+pe.getMessage());
        }
        finally{
            em.close();
            System.out.println("all resources are closed");

        }
        return null;
    }

    @Override
    public void deleteByName(String name) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            System.out.println("et begin"+et);
           Query query= em.createNamedQuery("deleteByName");
           query.setParameter("hn",name);
           query.executeUpdate();
           et.commit();
          System.out.println("removes successfully");
            }
            catch(PersistenceException pe){
                System.out.println("PersistenceException in house entity"+pe.getMessage());
                et.rollback();

            }
        finally {
            System.out.println("closing the resource ");
            em.close();
        }
        HouseRepository.super.deleteByName(name);
    }


    @Override
    public void updateNameByAddress(String name, String address) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try{
            et.begin();
            System.out.println("et begin"+et);
            Query query=em.createNamedQuery("updateNameByAddress");
            query.setParameter("ha",address);
            Object obj=query.getSingleResult();
            HouseEntity list=(HouseEntity)obj;
            list.setName(name);
            em.merge(list);

            et.commit();
            System.out.println("updated successfully");
        }
        catch(PersistenceException pe){
            System.out.println("PersistenceException in house entity"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("closing the resources");
            em.close();
        }
        HouseRepository.super.updateNameByAddress(name, address);
    }

    @Override
    public HouseEntity findById(int id) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            System.out.println("et begin"+et);
            Query query=em.createNamedQuery("findById");
            query.setParameter("hi",id);
            Object obj=query.getSingleResult();
            HouseEntity list=(HouseEntity) obj;
            et.commit();
            System.out.println("fetched data by id");
            System.out.println(list);

        }
        catch(PersistenceException pe){
            System.out.println("PersistenceException in house entity"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("resource are closed");
            em.close();
        }
        return HouseRepository.super.findById(id);
    }

    @Override
    public List<String> findAllByAddress() {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            System.out.println("et begin");
            Query query=em.createNamedQuery("findAllByAddress");
            List<String> entity=query.getResultList();
            et.commit();
            return entity;
        }
        catch(PersistenceException pe){
            System.out.println("PersistenceException in house entity"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("resources closed");
            em.close();
        }
        return null;
    }


    @Override
    public HouseEntity findByName(String name) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try{
            CriteriaBuilder criteriaBuilder=em.getCriteriaBuilder();
            CriteriaQuery<HouseEntity> cq=criteriaBuilder.createQuery(HouseEntity.class);

            Root<HouseEntity> root=cq.from(HouseEntity.class);
            cq.where(criteriaBuilder.equal(root.get("name"),name),
                    criteriaBuilder.and(criteriaBuilder.equal(root.get("id"),11))
            ,criteriaBuilder.and(criteriaBuilder.ge(root.get("id"),11)));

            HouseEntity fromDB=em.createQuery(cq).getSingleResult();
            System.out.println("fromDB"+fromDB);
            return fromDB;


        }
        catch(PersistenceException pe){
            System.out.println("PersistenceException in findByName "+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("closing the reosurces");
            em.close();
        }


        return HouseRepository.super.findByName(name);
    }
}
