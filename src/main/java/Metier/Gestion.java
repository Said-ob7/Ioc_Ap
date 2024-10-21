package Metier;

import Dao.ICalcul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gestion")
public class Gestion implements IGestion{
    @Autowired
    @Qualifier("d")
    private ICalcul cal;
    @Override
    public double calcul() {
        double d=cal.getValue() ;
        double resultat=d*10;
        return resultat;
    }
    public void setCal(ICalcul c) {
        this.cal = c;
    }
    public Gestion() {
    }

}
