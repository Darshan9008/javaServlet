package com.xworkz.taskJPA31Jan.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="house")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@NamedQuery(name="deleteByName",query="delete  from HouseEntity house where house.name=:hn")
@NamedQuery(name="updateNameByAddress",query ="select house from HouseEntity house where house.address=:ha")
@NamedQuery(name="findById",query="select house from HouseEntity house where house.id=:hi")
@NamedQuery(name="findAllByAddress",query="select house.address from HouseEntity house ")
public class HouseEntity {

    @Column(name="h_id")
    @Id
    private int id;

    @Column(name="h_name")
    private String name;

    @Column(name="h_address")
    private String address;

    @Column(name="h_pincode")
    private long pincode;







}
