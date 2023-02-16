package com.co.globant.poo.models;

public class Helicoptero {

    private int pesoBase;
    private int ancho;
    private int largo;
    private int cantidadPasajeros;

    public Helicoptero() {}

    public Helicoptero(int cantidad) {
        this.cantidadPasajeros=cantidad;
    }

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

    public int getcantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setcantidadPasajeros(int cantidad) {
        this.cantidadPasajeros = cantidad;
    }

    public void despegar(){
        System.out.println("El helicoptero esta despegando");
    }

    public void aterrizar(){
        System.out.println("El elicoptero esta aterrizando");
    }
}
//helicoptero grua
//helicoptero militar
//helicopteros civiles