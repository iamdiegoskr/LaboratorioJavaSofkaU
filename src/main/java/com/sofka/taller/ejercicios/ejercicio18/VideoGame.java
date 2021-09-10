package com.sofka.taller.ejercicios.ejercicio18;

public class VideoGame implements Deliverable{

    static final int DEFAULT_ESTIMATED_HOURS=10;
    static final boolean  DEFAULT_DELIVERED = false;

    private String title = "";
    private int estimatedHours = DEFAULT_ESTIMATED_HOURS;
    private boolean isDelivered = DEFAULT_DELIVERED;
    private String gender = "";
    private String company = "";

    public VideoGame() {
    }

    public VideoGame(String title, int estimatedHours) {
        this.title = title;
        this.estimatedHours = estimatedHours;
    }

    public VideoGame(String title, int estimatedHours, String gender, String company) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.gender = gender;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    @Override
    public String toString() {
        return  "Titulo => " + title + '\n' +
                "Horas estimadas => " + estimatedHours + '\n' +
                "Esta entregado => " + isDelivered + '\n' +
                "Genero => '" + gender + '\n' +
                "Compañia => " + company + '\n';
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

        boolean returnValue = this.estimatedHours > ((VideoGame) a).estimatedHours;
        return returnValue;
    }
}
