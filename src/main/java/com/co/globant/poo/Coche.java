package com.co.globant.poo;

public class Coche {

    private String tipo;
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;

    private int numeroPasajeros;

    private String color;
    private int pesoTotal;

    public Coche(){}

    /*public Coche(int numeroPasajeros){
        this.numeroPasajeros = numeroPasajeros;
    }*/

    public String getColor() {
        return color;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    /*public Coche(int ruedas, int largo, int ancho, int motor, int pesoPlataforma, String color, int pesoTotal) {
        this.largo = largo;
        this.ancho = ancho;
        this.motor = motor;
        this.pesoPlataforma = pesoPlataforma;
        this.color = color;
        this.pesoTotal = pesoTotal;
    }*/

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPeso() {return pesoPlataforma;}

    public void setPeso(int peso) {
        this.pesoPlataforma = peso;
    }

    public void acelerar(){
        System.out.println( tipo + "El Auto esta andando desde coche");
    }

    public void frenar(){
        System.out.println( tipo + "El Auto esta frenando desde coche");
    }
}
