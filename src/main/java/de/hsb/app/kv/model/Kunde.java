package de.hsb.app.kv.model;

import java.io.Serializable;
import java.util.Date;

public class Kunde implements Serializable {

    private static final long serialVersionUID = -8458300548433261434L;


	public Kunde(){}

    String vorname;
    String nachname;
    String geburtsdatum;
    

    public Kunde(String vorname, String nachname, String geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }

    public Kunde(String hugo, String herrmann, Date time) {
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

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }





}

