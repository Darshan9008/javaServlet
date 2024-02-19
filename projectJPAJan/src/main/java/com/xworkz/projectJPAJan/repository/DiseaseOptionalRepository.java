package com.xworkz.projectJPAJan.repository;

import com.xworkz.projectJPAJan.entity.DiseaseEntity;

import java.util.Optional;

public interface DiseaseOptionalRepository {

    public Optional<DiseaseEntity> create(DiseaseEntity diseaseEntity);

    public Optional<DiseaseEntity> read(Long id);

    public Optional<DiseaseEntity> update(DiseaseEntity diseaseEntity);

    public void delete(DiseaseEntity diseaseEntity);

    public void close();







}
