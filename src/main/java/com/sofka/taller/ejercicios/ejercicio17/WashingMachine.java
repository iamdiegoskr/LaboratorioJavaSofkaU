package com.sofka.taller.ejercicios.ejercicio17;

public class WashingMachine extends HomeAppliances{

    private double load = Constant.LOAD;

    public WashingMachine() {
        super();
    }

    public WashingMachine(double basePrice, double weight) {
        super(basePrice, weight);
    }

    public WashingMachine(double basePrice, String color, char energyConsumption, double weight, double load) {
        super(basePrice, color, energyConsumption, weight);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    @Override
    public double getPriceFinal() {

        double priceFinalWashingMachine = super.getPriceFinal();

        if(this.load>30){
            priceFinalWashingMachine+=50;
        }

        return priceFinalWashingMachine;
    }
}
