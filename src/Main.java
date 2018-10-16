
import com.gdah.entities.* ;
import com.gdah.entities.TypeAvion ;


import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Date d1 = new Date(1990 , 10 , 02) ;
        Date d2 = new Date(1980 , 10 , 01) ;
        Avion A1 = new Avion(TypeAvion.reaction , 100 , "Airbus" , d1 ,1000.0 ) ;
        Avion A2 = new Avion(TypeAvion.helice , 200 , "Airbus" , d2 , 2000.0) ;
        Voiture V1 = new Voiture(3 , 5 , 100 , 1000.0 , "Renault" , d2 , 10000.0) ;
        Voiture V2 = new Voiture(4 , 7 , 300 , 20000.0 , "Porch" ,d1 ,5000.0 ) ;
        A1.toString() ;
        A2.toString() ;
        V1.toString() ;
        V2.toString() ;
        Date d3 = new Date(1992 , 10 , 02) ;
        Date d4 = new Date(1993 , 12 , 31) ;
        A1.calculerprix(d3);
        A2.calculerprix(d4);
        V1.calculerprix(d3);
        V2.calculerprix(d4);


    }
}
