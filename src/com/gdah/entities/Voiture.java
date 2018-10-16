package com.gdah.entities;

import java.util.Date;

public class Voiture extends Vehicule {
    private int cylindre ;
    private int nombredeport ;
    private int puissance ;
    private double kilometrage ;
    public Voiture(int cylindre , int nombredeport , int puissance , double kilometrage ,  String marque , Date datedeachat , double prixdeachat ) {
        super(marque , datedeachat,prixdeachat);
        this.cylindre = cylindre ;
        this.puissance = puissance ;
        this.kilometrage = kilometrage ;
        this.nombredeport = nombredeport ;
    }
    public String toString(){
        return super.toString()+"cylinde : "+this.cylindre+"\n nombre de port :"+this.nombredeport+"\n puissance : "+this.puissance+"\nkilometrage : "+this.kilometrage+"\n" ;
    }

    @Override
    public void calculerprix(Date anneActuelle) {
        super.calculerprix(anneActuelle);
        double prixdeamortissement = prixdeachat * 0.02 ;
        prixdeamortissement =  prixdeamortissement * (anneActuelle.getYear() - datedeachat.getYear() ) ;
        prixdeamortissement = prixdeamortissement + ((kilometrage % 10000) * (prixcourant * 0.05)) ;
        if(marque == "Renault" || marque == "Fiat"){
            prixdeamortissement = prixdeamortissement + (prixcourant * 0.2) ;
        }
        if (marque=="Ferrasi" || marque =="Porch"){
            prixdeamortissement = prixdeamortissement + (prixcourant * 0.3) ;
        }
        if (prixdeamortissement > prixdeachat) {
            prixcourant = 0 ;
        }else {
            prixcourant = prixdeamortissement ;
        }


    }
}
