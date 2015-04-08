/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daa.ejb;

import com.daa.model.BestellWrapper;
import com.daa.model.Gericht;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author teilnehmer
 */
@Remote
public interface TransmitSaveBestellungSessionBeanRemote {
    public boolean storeEjb(BestellWrapper wrapperBestellung);
    public List<Gericht> initializeMenu();
}
