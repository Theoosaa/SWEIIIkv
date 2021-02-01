package de.hsb.app.kv.model;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Kreditkarte {

    @Id
    @GeneratedValue
    private UUID id;

    private Kreditkartentyp typ;

    private String nummer;

    @Temporal(TemporalType.DATE)
    private Date gueltigBis;

    private String inhaber;

    public Kreditkartentyp getTyp() {
        return typ;
    }

    public void setTyp(Kreditkartentyp typ) {
        this.typ = typ;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public Date getGueltigBis() {
        return gueltigBis;
    }

    public void setGueltigBis(Date gueltigBis) {
        this.gueltigBis = gueltigBis;
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }
}
