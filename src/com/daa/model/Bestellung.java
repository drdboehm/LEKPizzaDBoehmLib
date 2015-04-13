package com.daa.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "bestellung", catalog = "dbpizza", schema = "")
public class Bestellung implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrder", nullable = false)
    private Integer idOrder;

    @Column(name = "ipAddress")
    private String ipAddress;

    @Column(name = "orderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    
    @Column(name = "sessionId")
    private String sessionId;
    
    @Column(name = "isOrdered")
    private boolean isOrdered;
    
    @Column(name = "totalPay", precision = 8, scale = 2 )
    private BigDecimal totalPay;
    
    @Column(name = "isPayed")
    private boolean isPayed;
    
    @OneToMany (mappedBy = "keyOrder")
    private Collection<Orderposition> orderpositionCollection;
    
    @JoinColumn(name="keyKunde", referencedColumnName = "idKunde")   
    @ManyToOne
    private Kunde keyKunde;

    public Bestellung() {
    }

   

    public Bestellung(Integer idOrder, String ipAddress, Date orderDate, String sessionId, boolean isOrdered, BigDecimal totalPay, boolean isPayed) {
        this.idOrder = idOrder;
        this.ipAddress = ipAddress;
        this.orderDate = orderDate;
        this.sessionId = sessionId;
        this.isOrdered = isOrdered;
        this.totalPay = totalPay;
        this.isPayed = isPayed;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public boolean isIsOrdered() {
        return isOrdered;
    }

    public void setIsOrdered(boolean isOrdered) {
        this.isOrdered = isOrdered;
    }

    public BigDecimal getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(BigDecimal totalPay) {
        this.totalPay = totalPay;
    }

    public boolean isIsPayed() {
        return isPayed;
    }

    public void setIsPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }

    public Kunde getKeyKunde() {
        return keyKunde;
    }

    public void setKeyKunde(Kunde keyKunde) {
        this.keyKunde = keyKunde;
    }

     public Collection<Orderposition> getOrderpositionCollection() {
        return orderpositionCollection;
    }

    public void setOrderpositionCollection(Collection<Orderposition> orderpositionCollection) {
        this.orderpositionCollection = orderpositionCollection;
    }

    public Bestellung(Integer idOrder) {
        this.idOrder = idOrder;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrder != null ? idOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bestellung)) {
            return false;
        }
        Bestellung other = (Bestellung) object;
        if ((this.idOrder == null && other.idOrder != null) || (this.idOrder != null && !this.idOrder.equals(other.idOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "daten.Bestellung[ idOrder=" + idOrder + " ]";
    }
}
