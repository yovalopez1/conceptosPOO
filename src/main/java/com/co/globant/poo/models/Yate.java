package com.co.globant.poo.models;

public class Yate {

    private int largo;
    private int ancho;
    private int pesoBase;
    private String material;
    private int cantidadPasajeros;
    private String tipo;

    public Yate() {}

    public Yate(int cantidad) {
        this.cantidadPasajeros=cantidad;
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

    public int getPesoBase() {
        return pesoBase;
    }

    public void setPesoBase(int pesoBase) {
        this.pesoBase = pesoBase;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void arrancar(){
        System.out.println( tipo + "El barco esta arrancando desde base barco");
    }

    public void Anclar(){
        System.out.println( tipo + "El barco esta anclando desde base barco");
    }

}
