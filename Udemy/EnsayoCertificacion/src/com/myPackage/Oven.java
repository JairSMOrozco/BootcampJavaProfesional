package com.myPackage;

class Oven {
    private double[] temperature;
    final double[] maxTemperature = {35.6};

    private void setTemperature(double[] temperature){
        this.temperature = temperature;
    }
}
