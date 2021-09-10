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
        checkColor(color);
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

        int count = (int) Constant.COLORS.stream().filter((clr)->clr.equalsIgnoreCase(color)).count();

        if(count>0){
            this.color = color;
        }else{
            this.color = Constant.COLORS.get(0);
        }

    }

    public double getPriceFinal(){

        return this.basePrice +
                getPrinceEnergyConsumption(this.energyConsumption) + getPriceSize(this.weight);

    }

    private double getPrinceEnergyConsumption(char type){

        switch (type){
            case 'A':
                return 100;
            case 'B':
                return 80;
            case 'C':
                return 60;
            case 'D':
                return 50;
            case 'E':
                return 30;
            case 'F':
                return 10;
            default:
                return 0;
        }

    }

    private double getPriceSize(double weight){

        if(weight>0 && weight<20){
            return 10;
        }else if(weight<50){
            return 50;
        }else if(weight<80){
            return 80;
        }else{
            return 100;
        }

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
