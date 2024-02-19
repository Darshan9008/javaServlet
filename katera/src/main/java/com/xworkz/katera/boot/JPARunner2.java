package com.xworkz.katera.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.sql.SQLOutput;

public class JPARunner2 {

    public static void main(String[] args) {

       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em= emf.createEntityManager();

     Query query1= em.createNamedQuery("findFictionalNameByRealName");
      Query query2=em.createNamedQuery("findCountryNameById");
      Query query3= em.createNamedQuery("findPowerById");
     Query query4= em.createNamedQuery("findRealNameAndFictionalNameById");

        query1.setParameter("fn","Darshan");
        query2.setParameter("cn",1);
        query3.setParameter("pn" ,1);
        query4.setParameter("fr",1);


       Object object1=query1.getSingleResult();
        Object object2=query2.getSingleResult();
       Object object3= query3.getSingleResult();
       Object object4=query4.getSingleResult();

        String str=(String)object1;
        String str1=(String)object2;
        String str3=(String)object3;
        Object[] obj4=(Object[])object4;



        System.out.println("fictional name fetched :" +str);
        System.out.println("country name fetched :"+str1);
        System.out.println("power fetched :"+str3);
        System.out.println("real name and  by id :"+obj4[0]);
        System.out.println("ficational name by id :"+obj4[1]);
        em.close();
        emf.close();





    }



}
