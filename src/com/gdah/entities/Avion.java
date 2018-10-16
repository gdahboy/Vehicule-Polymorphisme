package com.gdah.entities ;
import com.gdah.entities.TypeAvion ;

import java.util.Date;

public class Avion extends Vehicule {
    private TypeAvion type ;
    private int nbrdeheuredevol ;
    public  Avion(TypeAvion type , int nbrdeheuredevol , String marque , Date datedeachat , Double prixdeachat){
        super(marque ,datedeachat , prixdeachat ) ;
        this.type = type ;
        this.nbrdeheuredevol = nbrdeheuredevol ;
    }

    @Override
    public String toString() {
        return super.toString()+"type de avion "+this.type+"\n nbr de heure de vols \n"+this.nbrdeheuredevol ;
    }

    @Override
    public void calculerprix(Date anneActuelle) {
        super.calculerprix(anneActuelle);
        double prixdamortissmentavion  = 0 ;
        if (type == TypeAvion.reaction) {
            prixdamortissmentavion = (nbrdeheuredevol % 1000 ) *  (prixcourant * 0.1) ;
        }else {
            prixdamortissmentavion = (nbrdeheuredevol % 100 ) *  (prixcourant * 0.1) ;
        }
        if (prixdamortissmentavion > prixdeachat) {
            prixcourant = 0 ;
        }else {
            prixcourant = prixdamortissmentavion ;
        }


    }
}
