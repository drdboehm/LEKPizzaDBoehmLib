/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daa.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "kunde", catalog = "dbpizza", schema = "")
public class Kunde implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idKunde")
    private Integer idKunde;

    @Column(name = "username")
    private String username;

    @Column(name = "vorname")
    private String vorname;

    @Column(name = "nachname")
    private String nachname;

    @Column(name = "strasse")
    private String strasse;

    @Column(name = "hausnr")
    private String hausnr;

    @Column(name = "plz")
    private String plz;

    @Column(name = "ort")
    private String ort;

    @Column(name = "firstEntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstEntryDate;

    @Column(name = "lastEntryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastEntryDate;

    @OneToMany(mappedBy = "keyKunde")
    private Collection<Bestellung> bestellungCollection;

    /**
     * The constructor initializes a minimal OrderAddress object sufficient for
     * delivery of an order
     *
     * @param vorname
     * @param nachname
     * @param strasseNumber
     * @param plzOrt
     *
     */
    public Kunde() {
        username = "";
        vorname = "";
        nachname = "";
        strasse = "";
        hausnr = "";
        plz = "";
        ort = "";
    }

    public Collection<Bestellung> getBestellungCollection() {
        return bestellungCollection;
    }

    public void setBestellungCollection(Collection<Bestellung> bestellungCollection) {
        this.bestellungCollection = bestellungCollection;
    }

    public Date getFirstEntryDate() {
        return firstEntryDate;
    }

    public void setFirstEntryDate(Date firstEntryDate) {
        this.firstEntryDate = firstEntryDate;
    }

    public Date getLastEntryDate() {
        return lastEntryDate;
    }

    public void setLastEntryDate(Date lastEntryDate) {
        this.lastEntryDate = lastEntryDate;
    }

    public Integer getIdKunde() {
        return idKunde;
    }

    public void setIdKunde(Integer idKunde) {
        this.idKunde = idKunde;
    }

    public Kunde(String username, String vorname, String nachname, String strasse, String hausnr, String plz, String ort) {
        this.username = username;
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.hausnr = hausnr;
        this.plz = plz;
        this.ort = ort;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getHausnr() {
        return hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
//        String out = String.format("Kunde: Vorname=%s%nName: ", vorname);
        String out = "Kunde:" + "\nVorname=" + vorname + ", nachname=" + nachname + ", strasse=" + strasse + ", hausNr" + hausnr + ", plz=" + plz + ", Ort: " + ort;
        return out;
    }

}
