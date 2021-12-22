package com.condominios;

public class Apartamentos extends Blocos {

    private double area;

    public Apartamentos(double area) {
        this.area = area;
    }

    public Apartamentos() {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double valorCondominio(Blocos b1) {

        return (b1.getGastosTotais() / b1.getArea()) * this.area;
    }
}
