package com.mbarra.exercises.exercisetwo;

public class Position {
    private int dateAndTime;
    private String registration;
    private float latitude;
    private float longitude;

    ///GET Y SET

    public int getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(int dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    /////
    //constructors


    public Position(int dateAndTime, String registration, float latitude, float longitude) {
        this.dateAndTime = dateAndTime;
        this.registration = registration;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    //to string
///everything is inherited from object, he is the father of all objects
    @Override
    public String toString() {
        return this.dateAndTime + "," + this.registration + "," + this.latitude + "," + this.longitude;
    }

}