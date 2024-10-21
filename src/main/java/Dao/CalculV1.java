package Dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cal1")
public class CalculV1 implements ICalcul{
    private double d=100;
    @Override
    public double getValue() {
        System.out.println("Version 1");
        d = 100;
        return d;

    }
    public void setD(double d) {
        this.d = d;
    }
}
