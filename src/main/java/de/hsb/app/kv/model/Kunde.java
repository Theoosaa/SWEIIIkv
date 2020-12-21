package de.hsb.app.kv.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@NamedQuery(name="SelectKunden", query="Select k from Kunde k")
@Entity

public class Kunde implements Serializable {

    private static final long serialVersionUID = -8458300548433261434L;

    @Id
    @GeneratedValue
    private UUID id;
    private String vorname;
    private String nachname;
    @Temporal(TemporalType.DATE)
    private Date geburtsdatum;

    public Kunde() { }

    public Kunde(String vorname, String nachname, Date geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
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

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        {
            this.geburtsdatum = geburtsdatum;
        }
    }
}

