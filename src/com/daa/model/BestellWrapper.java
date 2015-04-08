/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daa.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author dboehm
 */
public class BestellWrapper implements Serializable {
    private static final long serialVersionUID = 1L;
    private Kunde kunde;
    private Bestellung bestellung;
    private List<Gericht> gerichte;

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Bestellung getBestellung() {
        return bestellung;
    }

    public void setBestellung(Bestellung bestellung) {
        this.bestellung = bestellung;
    }

    public List<Gericht> getGerichte() {
        return gerichte;
    }

    public void setGerichte(List<Gericht> gerichte) {
        this.gerichte = gerichte;
    }
    
}
