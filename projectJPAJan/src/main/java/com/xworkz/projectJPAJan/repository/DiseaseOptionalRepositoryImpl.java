package com.xworkz.projectJPAJan.repository;

import com.xworkz.projectJPAJan.entity.DiseaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Objects;
import java.util.Optional;

public class DiseaseOptionalRepositoryImpl implements DiseaseOptionalRepository{

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
    private EntityManager em;

    @Override
    public Optional<DiseaseEntity> create(DiseaseEntity diseaseEntity) {

        Objects.requireNonNull(diseaseEntity, "Person must not be null");
        em.getTransaction().begin();
        em.persist(diseaseEntity);
        em.getTransaction().commit();
        return Optional.of(diseaseEntity);
    }

    @Override
    public Optional<DiseaseEntity> read(Long id) {
        em.getTransaction().begin();
        DiseaseEntity diseaseEntity = em.find(DiseaseEntity.class, id);
        em.getTransaction().commit();
        return Optional.ofNullable(diseaseEntity);    }

    @Override
    public Optional<DiseaseEntity> update(DiseaseEntity diseaseEntity) {

        Objects.requireNonNull(diseaseEntity, "diseaseEntity must not be null");
        em.getTransaction().begin();
        diseaseEntity = em.merge(diseaseEntity);
        em.getTransaction().commit();
        return Optional.of(diseaseEntity);

    }

    @Override
    public void delete(DiseaseEntity diseaseEntity) {
        em.getTransaction().begin();
        em.remove(diseaseEntity);
        em.getTransaction().commit();

    }

    @Override
    public void close() {
        emf.close();

    }
}
