package com.gmail.dm0275.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dmancilla on 2/20/2017.
 */
@Entity
@Table(name = "Country")
public class Country implements Serializable {

    private static final long serialVersionUID = -1092949745977380885L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "countryName")
    private String countryName;

    @Column(name = "population")
    private long population;

    public Country() {
        super();
    }

    public Country(int id, String countryName, long population ) {
        super();
        setId(id);
        setCountryName(countryName);
        setPopulation(population);
    }

    public String getCountryName() {
        return countryName;
    }

    public int getId() {
        return id;
    }

    public long getPopulation() {
        return population;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Id :" + this.id + ", Country: " + this.countryName + ", Population: " + this.population;
    }
}

