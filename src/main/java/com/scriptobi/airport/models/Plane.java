package com.scriptobi.airport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="planes")
public class Plane {
    @Id
    @Column(name="id", nullable = false)
    private int id;
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Column(name="matricule", nullable = false)
    private String Matricule;
    public String getMatricule() { return Matricule; }
    public void setMatricule(String matricule) { Matricule = matricule; }

    @Column(name="manufacturer_id", nullable = false)
    private int manufacturer_id;
    public int getManufacturer_id() { return manufacturer_id; }
    public void setManufacturer_id(int manufacturer_id) { this.manufacturer_id = manufacturer_id; }

    @Column(name="model_id", nullable = false)
    private int model_id;
    public int getModel_id() { return model_id; }
    public void setModel_id(int model_id) { this.model_id = model_id; }

    public Plane() {}
    public Plane(int id, String matricule) {

    }
}
