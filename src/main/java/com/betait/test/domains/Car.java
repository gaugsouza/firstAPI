package com.betait.test.domains;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;


@Data
@Entity
public class Car extends Object implements Serializable{
    private static final long serialVersionUID = 2434905241959344588L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long chassi;

    private String marca;

    private String modelo;

}