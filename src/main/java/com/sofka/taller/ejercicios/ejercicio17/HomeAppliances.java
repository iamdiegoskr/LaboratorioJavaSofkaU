package com.sofka.taller.ejercicios.ejercicio17;


public class HomeAppliances {

    private double basePrice = Constant.PRICE_BASE;
    private String color = Constant.COLORS.get(0);
    private char energyConsumption = Constant.TYPES_CONSUMPTION.get(Constant.TYPES_CONSUMPTION.size()-1);
    private double weight = Constant.WEIGHT_BASE;

    public HomeAppliances() {
    }

    public HomeAppliances(double basePrice, double weight) {
        this.basePrice = basePrice;
        this.weight = weight;
    }

    public HomeAppliances(double basePrice, String color, char energyConsumption, double weight) {
        this.basePrice = basePrice;
        this.color = color;
        checkEnergyConsumption(energyConsumption);
        this.weight = weight;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void checkEnergyConsumption(char letter) {

        int count = (int) Constant.TYPES_CONSUMPTION.stream().filter((l)-> l==letter).count();

        if(count>0){
            this.energyConsumption = letter;
        }else{
            this.energyConsumption = Constant.TYPES_CONSUMPTION.get(Constant.TYPES_CONSUMPTION.size()-1);
        }

    }

    private void checkColor(String color) {

    }

    @Override
    public String toString() {
        return "HomeAppliances{" +
                "basePrice=" + basePrice +
                ", color='" + color + '\'' +
                ", energyConsumption=" + this.energyConsumption +
                ", weight=" + weight +
                '}';
    }
}
