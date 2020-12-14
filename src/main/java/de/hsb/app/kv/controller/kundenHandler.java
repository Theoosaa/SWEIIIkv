package de.hsb.app.kv.controller;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import de.hsb.app.kv.model.Kunde;

import javax.annotation.PostConstruct;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

public class kundenHandler  {

    private DataModel<Kunde> kunden;
    private Kunde merkeKunde= new Kunde();
    private List<Kunde> storedKunden;

    public DataModel<Kunde> getKunden() {
        return kunden;
    }

    public void setKunden(DataModel<Kunde> kunden) {
        this.kunden = kunden;
    }

    public Kunde getMerkeKunde() {
        return merkeKunde;
    }

    public void setMerkeKunde(Kunde merkeKunde) {
        this.merkeKunde = merkeKunde;
    }

    public List<Kunde> getStoredKunden() {
        return storedKunden;
    }

    public void setStoredKunden(List<Kunde> storedKunden) {
        this.storedKunden = storedKunden;
    }

    @PostConstruct
    public void init() {
        storedKunden = new LinkedList<Kunde>(Arrays.asList(new Kunde[]{new Kunde("Hugo", "Herrmann", new GregorianCalendar(1999, 03, 03).getTime())
        }));
        kunden = new ListDataModel<>();
        kunden.setWrappedData(storedKunden);
    }

    public String neu(){
        System.out.println("Ich bin die Methode neu() und wurde gerade aufgerufen");
        merkeKunde = new Kunde();
        return "neuerKunde";
    }

    public String speichern(){
        System.out.println("Ich speichere");
        getStoredKunden().add(merkeKunde);
        return "alleKunden";
    }

}
