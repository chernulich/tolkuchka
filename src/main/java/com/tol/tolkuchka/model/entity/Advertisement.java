package com.tol.tolkuchka.model.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "ADVERTISEMENT")
@DynamicInsert
public class Advertisement extends BaseDate {

    private String content;

    @ManyToOne
    private User owner;

    @ManyToOne
    private User admin;

    @OneToOne
    private CategoryAdvertisement category;

    private Integer numberOfOutputs;

    private Boolean frame;

    private Boolean services;

    private Boolean font;

}
