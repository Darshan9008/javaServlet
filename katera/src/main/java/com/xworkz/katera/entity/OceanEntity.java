package com.xworkz.katera.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="ocean")
@Entity

public class OceanEntity {

    @Id
    @Column(name="o_id")
    private int id;
    @Column(name="o_name ")
    private String name;
    @Column(name="o_depth ")
    private double depth;
    @Column(name="o_distance")
    private double distance;
    @Column(name="o_location ")
    private String location;


    public OceanEntity(int id, String name, double depth, double distance, String location) {
        this.id = id;
        this.name = name;
        this.depth = depth;
        this.distance = distance;
        this.location = location;
    }
}
