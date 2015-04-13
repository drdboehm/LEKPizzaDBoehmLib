/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daa.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "gericht", catalog = "dbpizza", schema = "")
@NamedQueries({
    @NamedQuery(name = "Gericht.findAll", query = "SELECT g FROM Gericht g")
})
public class Gericht implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGericht", nullable = false)
    private Integer gerichtId;
    
    @Column(name = "BEZEICHNUNG", nullable = false, length = 255)
    private String bezeichnung;
    
    @Column(name = "PREIS", precision = 22)
    private Double preis;
    
    @Transient
    private Integer amount = 0;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "keyGericht")
    private Collection<Orderposition> orderpositionCollection;

    @Override
    public String toString() {
        return "Gericht{" + "gerichtId=" + gerichtId + ", bezeichnung=" + bezeichnung + ", preis=" + preis + ", amount=" + amount + '}';
    }

    public Gericht() {
    }

    /**
     *
     * @param gerichtId
     * @param bezeichnung
     * @param preis
     */
    public Gericht(Integer gerichtId, String bezeichnung, Double preis) {
        this.gerichtId = gerichtId;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        amount = 0;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Double getPreis() {
        return preis;
    }

    public void setPreis(Double preis) {
        this.preis = preis;
    }

    public Integer getGerichtId() {
        return gerichtId;
    }

    public void setGerichtId(Integer gerichtId) {
        this.gerichtId = gerichtId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Collection<Orderposition> getOrderpositionCollection() {
        return orderpositionCollection;
    }

    public void setOrderpositionCollection(Collection<Orderposition> orderpositionCollection) {
        this.orderpositionCollection = orderpositionCollection;
    }

}
