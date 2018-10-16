package com.gdah.entities;

import java.util.Date;
 enum TypeAvion {
      helice ,
      reaction
 }

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
    public String  toString(){
        return "1-"+this.marque+"\n2-"+this.prixdeachat+"\n3-"+this.prixcourant+"\n4-"+this.datedeachat ;
    }

}
