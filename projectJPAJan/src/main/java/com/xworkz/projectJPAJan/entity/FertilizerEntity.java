package com.xworkz.projectJPAJan.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@Table(name="fertilizer")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FertilizerEntity {

    @Id
    @Column(name="f_id")
    private int id;

    @Column(name="f_name")
    private String name;

    @Column(name="f_type")
    private String type;

    @Column(name="f_cost")
    private int cost;

    @Column(name="f_manfDate")
    private LocalDate manfDate;



}
