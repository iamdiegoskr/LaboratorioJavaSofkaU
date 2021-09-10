package com.sofka.taller.ejercicios.ejercicio18;

public class Serie implements Deliverable{

    private String title = "";
    private int numberSeasons = 3;
    private boolean isDelivered = false;
    private String gender = "";
    private String creator = "";

    public Serie() {
    }

    public Serie(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    public Serie(String title, int numberSeasons, String gender, String creator) {
        this.title = title;
        this.numberSeasons = numberSeasons;
        this.gender = gender;
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberSeasons() {
        return numberSeasons;
    }

    public String getGender() {
        return gender;
    }

    public String getCreator() {
        return creator;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberSeasons(int numberSeasons) {
        this.numberSeasons = numberSeasons;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


    @Override
    public void deliver() {
        this.isDelivered = true;
    }

    @Override
    public void toReturn() {
        this.isDelivered = false;
    }

    @Override
    public boolean isDelivered() {
        return this.isDelivered;
    }

    @Override
    public boolean compareTo(Object a) {
        boolean valueToReturn = this.getNumberSeasons() > ((Serie) a).getNumberSeasons();
        return valueToReturn;
    }

    @Override
    public String toString() {
        return  "Tiulo => " + title + "\n" +
                "Numero de temporadas => " + numberSeasons + "\n" +
                "Esta entregado => " + isDelivered + "\n" +
                "Genero => " + gender + "\n" +
                "Creador => " + creator + "\n";
    }
}
