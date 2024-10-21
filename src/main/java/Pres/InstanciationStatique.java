package Pres;

import Dao.CalculV2;
import Metier.Gestion;

public class InstanciationStatique {
    public static void main(String[] args) {
        Gestion gestion=new Gestion();
        CalculV2 cal=new CalculV2();
        gestion.setCal(cal);
        System.out.println(gestion.calcul());
    }
}
