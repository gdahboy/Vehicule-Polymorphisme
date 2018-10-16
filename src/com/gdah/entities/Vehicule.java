package com.gdah.entities;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Vehicule {
    protected String marque ;
    protected Date datedeachat ;
    protected double prixdeachat ;
    protected double prixcourant ;

    public  Vehicule(String marque , Date datedachat , double prixdaeachat){
        this.marque = marque ;
        this.datedeachat = datedachat ;
        this.prixdeachat= prixdaeachat ;
    }

    public Vehicule() {


    }

    public String  toString(){
        return "1-"+this.marque+"\n2-"+this.prixdeachat+"\n3-"+this.prixcourant+"\n4-"+this.datedeachat ;
    }
    public void calculerprix(Date anneActuelle){
        double prixdeamortissement = prixdeachat * 0.01 ;
        prixcourant =  prixdeamortissement * (anneActuelle.getYear() - datedeachat.getYear() ) ;
    }

    public double getPrixcourant() {
        return prixcourant;
    }
}
