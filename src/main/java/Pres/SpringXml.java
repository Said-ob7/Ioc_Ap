package Pres;

import Dao.ICalcul;
import Metier.IGestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXml {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
        ICalcul cal=context.getBean(ICalcul.class);
        System.out.println(cal.getValue());
        IGestion gestion=context.getBean(IGestion.class);
        System.out.println(gestion.calcul());
    }
}
