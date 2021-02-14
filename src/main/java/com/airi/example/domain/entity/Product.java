package com.airi.example.domain.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Product{
    @Id
    private int id;
    private String name;
    @Column(name = "description")
    private String desc;
    private Double price;

}
