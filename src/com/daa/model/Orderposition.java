/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daa.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author teilnehmer
 */
@Entity
@Table(name = "orderposition", catalog = "dbpizza", schema = "")
public class Orderposition implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrderPosition", nullable = false)
    private Integer idOrderPosition;

    @Column(name = "amountPosition")
    private Integer amountPosition;

    @JoinColumn(name="keyOrder", referencedColumnName = "idOrder")
    @ManyToOne
    private Bestellung keyOrder;
    
    @JoinColumn(name = "keyGericht", referencedColumnName = "idGericht")
    @ManyToOne
    private Gericht keyGericht;

    public Orderposition() {
    }

    public Orderposition(Integer idOrderPosition) {
        this.idOrderPosition = idOrderPosition;
    }

    public Integer getIdOrderPosition() {
        return idOrderPosition;
    }

    public void setIdOrderPosition(Integer idOrderPosition) {
        this.idOrderPosition = idOrderPosition;
    }

    public Integer getAmountPosition() {
        return amountPosition;
    }

    public void setAmountPosition(Integer amountPosition) {
        this.amountPosition = amountPosition;
    }

    public Bestellung getKeyOrder() {
        return keyOrder;
    }

    public void setKeyOrder(Bestellung keyOrder) {
        this.keyOrder = keyOrder;
    }

    public Gericht getKeyGericht() {
        return keyGericht;
    }

    public void setKeyGericht(Gericht keyGericht) {
        this.keyGericht = keyGericht;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrderPosition != null ? idOrderPosition.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderposition)) {
            return false;
        }
        Orderposition other = (Orderposition) object;
        if ((this.idOrderPosition == null && other.idOrderPosition != null) || (this.idOrderPosition != null && !this.idOrderPosition.equals(other.idOrderPosition))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "daten.Orderposition[ idOrderPosition=" + idOrderPosition + " ]";
    }

}
