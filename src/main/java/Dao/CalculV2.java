package Dao;

public class CalculV2 implements ICalcul{
    @Override
    public double getValue() {
        System.out.println("Version 2");
        return 200;
    }
}
