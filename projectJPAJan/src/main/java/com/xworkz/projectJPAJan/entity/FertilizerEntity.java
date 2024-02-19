package com.xworkz.projectJPAJan.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name="fertilizer")
@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@NamedQuery(name="findAllByCost",query = "select fe from FertilizerEntity fe where fe.cost=:ct")
public class FertilizerEntity {

    @Id
    @Column(name="f_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="f_name")
    @NonNull
    private String name;

    @Column(name="f_type")
    @NonNull
    private String type;

    @Column(name="f_cost")
    @NonNull
    private int cost;

    @Column(name="f_manfDate")
    @NonNull
    private LocalDate manfDate;



}
