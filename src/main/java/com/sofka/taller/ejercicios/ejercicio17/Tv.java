package com.sofka.taller.ejercicios.ejercicio17;

public class Tv extends HomeAppliances{

    private int resolution = Constant.RESOLUTION_TV;
    private boolean isTdt = false;

    public Tv() {
        super();
    }

    public Tv(double basePrice, double weight) {
        super(basePrice, weight);
    }

    public Tv(double basePrice, String color, char energyConsumption, double weight, int resolution, boolean isTdt) {
        super(basePrice, color, energyConsumption, weight);
        this.resolution = resolution;
        this.isTdt = isTdt;
    }

    public int getResolution() {
        return resolution;
    }

    public boolean isTdt() {
        return isTdt;
    }

    @Override
    public double getPriceFinal() {

        double priceFinalTv = super.getPriceFinal();

        if(this.resolution>40){
            priceFinalTv += priceFinalTv*0.3;
        }

        if(this.isTdt){
            priceFinalTv += 50;
        }

        return priceFinalTv;
    }
}
