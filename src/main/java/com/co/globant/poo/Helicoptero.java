package com.co.globant.poo;

public class Helicoptero {

    private int pesoBase;
    private int ancho;
    private int largo;
    private int cupoPasajeros;

    public Helicoptero() {}

    public int getPesoBase() {
        return pesoBase;
    }

    public void setPesoBase(int pesoBase) {
        this.pesoBase = pesoBase;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getCupoPasajeros() {
        return cupoPasajeros;
    }

    public void setCupoPasajeros(int cupoPasajeros) {
        this.cupoPasajeros = cupoPasajeros;
    }

    public void despegar(){
        System.out.println("El helicoptero esta despegando");
    }

    public void aterrizar(){
        System.out.println("El elicoptero esta aterrizando");
    }
}
