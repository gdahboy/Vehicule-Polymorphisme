package com.gdah.entities;

import java.util.Date;

public class Avion extends Vehicule {
    private TypeAvion type ;
    private int nbrdeheuredevol ;
    public  Avion(TypeAvion type , int nbrdeheuredevol , String marque , Date datedeachat , Double prixdeachat){
        super(marque ,datedeachat , prixdeachat ) ;
        this.type = type ;
        this.nbrdeheuredevol = nbrdeheuredevol ; 
    }
}
