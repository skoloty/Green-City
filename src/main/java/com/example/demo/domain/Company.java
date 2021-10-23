package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String companyName;

    @Column
    private String additionalInformation;


}
