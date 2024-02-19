package com.xworkz.katera.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="toy")
@Entity
@Data
public class ToyEntity {

    @Id
    @Column(name="t_id")
    private int id;

    @Column(name="t_name")
    private String name;

    @Column(name="t_color")
    private String color;

    @Column(name="t_cost")
    private String cost;

    @Column(name="t_material")
    private String material;


    public ToyEntity(int id, String name, String color, String cost, String material) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.cost = cost;
        this.material = material;
    }
}
