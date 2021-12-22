package com.condominios;

public class Blocos {

    private double area;
    private double gastosTotais;

    public Blocos() {
    }

    public Blocos(double area, double gastosTotais) {
        this.area = area;
        this.gastosTotais = gastosTotais;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGastosTotais() {
        return gastosTotais;
    }

    public void setGastosTotais(double gastosTotais) {
        this.gastosTotais = gastosTotais;
    }

}
