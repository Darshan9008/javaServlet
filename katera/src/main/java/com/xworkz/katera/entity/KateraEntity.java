package com.xworkz.katera.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Entity
@Data
@Table(name="super_hero")
@NamedQuery(name="findByRealName",query="select ke from KateraEntity ke where ke.realName=:rn")
@NamedQuery(name="findFictionalNameByRealName",query = "select ke.fictionalName from KateraEntity ke where ke.realName=:fn")
@NamedQuery(name="findCountryNameById", query="select ke.country from KateraEntity ke where ke.id=:cn")
@NamedQuery(name="findPowerById" ,query="select ke.power from KateraEntity ke where ke.id=:pn")
@NamedQuery(name="findWeaknessByPower" ,query="select ke.weakness from KateraEntity ke where ke.power=:wn")
@NamedQuery(name="findRealNameAndFictionalNameById",query="select ke.realName,ke.fictionalName from KateraEntity ke where ke.id=:fr")
@NamedQuery(name="findAll",query="select ke from KateraEntity ke")                                                                                             //here KateraEntity is a class name
public class KateraEntity {                                                                   //realName is a property name

    @Id
    @Column(name="id")
    private int id;

    @Column(name="s_realName")
    private String realName;

    @Column(name="s_fictionalName")
    private String fictionalName;

    @Column(name="s_country")
    private String country;

    public KateraEntity(int id, String realName, String fictionalName, String country, String power, String weakness) {
        this.id = id;
        this.realName = realName;
        this.fictionalName = fictionalName;
        this.country = country;
        this.power = power;
        this.weakness = weakness;
    }

    @Column(name="s_power")
    private String power;

    @Column(name="s_weakness")
    private String weakness;

    public KateraEntity(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setFictionalName(String fictionalName) {
        this.fictionalName = fictionalName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }
}




