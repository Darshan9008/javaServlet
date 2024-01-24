package com.xworkz.projectJPAJan.boot;

import com.xworkz.projectJPAJan.entity.DiseaseEntity;
import com.xworkz.projectJPAJan.repository.DiseaseRepository;
import com.xworkz.projectJPAJan.repository.DiseaseRepositoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class JPARunner {


    public static void main(String[] args) {

        DiseaseEntity entity= new DiseaseEntity(2,"fever","virus","NH","vinay");

        DiseaseRepository repo=new DiseaseRepositoryImpl();
        repo.save(entity);





    }


}
