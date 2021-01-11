package de.hsb.app.kv.controller;

import de.hsb.app.kv.model.Kunde;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;


import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.*;

@SessionScoped
@Named("kundenHandler")
public class kundenHandler implements Serializable {

    private static final long serialVersionUID = -2270264364807391691L;

    @PersistenceContext(name = "kv-persistence-unit")
    private EntityManager em;
    @Resource
    private UserTransaction utx;

    private DataModel<Kunde> kunden;
    private Kunde merkeKunde = new Kunde();


    public Kunde getMerkeKunde() {
        return merkeKunde;
    }

    public void setMerkeKunde(Kunde merkeKunde) {
        this.merkeKunde = merkeKunde;
    }

    public DataModel<Kunde> getKunden() {
        return kunden;
    }

    public void setKunden(DataModel<Kunde> kunden) {
        this.kunden = kunden;
    }

    @PostConstruct
    public void init() {


        try {
            utx.begin();
            kunden = new ListDataModel<>();
            kunden.setWrappedData(em.createNamedQuery("SelectKunden").getResultList());
            utx.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public String neu() {
        System.out.println("Ich bin die Methode neu() und wurde gerade aufgerufen");
        merkeKunde = new Kunde();
        return "neuerKunde";
    }

    @Transactional
    public String speichern() {
        System.out.println("Ich speichere");
        merkeKunde = em.merge(merkeKunde);
        em.persist(merkeKunde);
        kunden.setWrappedData(em.createNamedQuery("SelectKunden").getResultList());
        return "alleKunden";
    }

}
