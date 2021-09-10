package com.sofka.taller.ejercicios.ejercicio16;

import com.sofka.taller.ejercicios.ejercicio16.utils.Gender;
import com.sofka.taller.ejercicios.ejercicio16.utils.IMC;

import java.util.Arrays;
import java.util.List;

public class Person {

    static final List<String> LETTERS_DNI= Arrays.asList("T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z",
            "S","Q","V","H","L","C","K","E");
    private String name = "";
    private int age = 0;
    private String dni;
    private char gender = Gender.MEN;
    private double weight = 0;
    private double height = 0;

    public Person() {
        generateDNI();
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        verifyGenderIsOk(gender);
        generateDNI();
    }

    public Person(String name, int age, char gender, double weight, double height) {
        this.name = name;
        this.age = age;
        verifyGenderIsOk(gender);
        this.weight = weight;
        this.height = height;
        generateDNI();
    }

    public String getName(){
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setGender(char gender) {
        this.gender = gender;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public int calculateIMC() {

        double Imc = (this.weight / Math.pow(this.height, 2));

        if (Imc < 20) {
            return IMC.IDEAL_WEIGHT;
        } else if (Imc >= 20 && Imc <= 25) {
            return IMC.LOW_IDEAL_WEIGHT;
        } else {
            return IMC.OVERWEIGHT;
        }
    }

    public boolean isAdult(){
        return this.age>=18;
    }

    private void verifyGenderIsOk(char gender){
        if(gender=='H' || gender=='M'){
            this.gender=gender;
        }else{
            this.gender=Gender.MEN;
        }
    }

    private String getGenderPerson(char gender){
        return (gender=='H')? "HOMBRE":"MUJER";
    }

    private void generateDNI() {

        int numberDNI = (int) (100000000 * Math.random());
        int rest = numberDNI%23;

        this.dni =String.valueOf(numberDNI).concat(LETTERS_DNI.get(rest));

    }


    @Override
    public String toString() {
        return
                "Nombre => " + this.name + "\n" +
                "Edad => " + this.age + "\n" +
                "DNI => " + this.dni + "\n" +
                "GENERO => " + this.getGenderPerson(this.gender) + "\n" +
                "PESO => " + this.weight + "\n" +
                "ALTURA => " + this.height + "\n";
    }


}
