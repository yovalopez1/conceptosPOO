package com.co.globant.poo;

import com.co.globant.poo.models.Coche;
import com.co.globant.poo.models.Helicoptero;
import com.co.globant.poo.models.Yate;

public class ProcesosTransportes {

    public void iniciar(){

        Coche audi = new Coche();
        audi.setAncho(150);
        audi.setLargo(250);
        audi.setColor("Rojo");
        audi.setPesoTotal(2000);
        audi.setMotor(2000);
        audi.setRuedas(4);
        audi.setTipo("Auto deportivo");
        System.out.println("Especificaciones del auto: \n" + audi.getAncho() + " centimetros\n" + audi.getLargo()
                + " centimetros");
        System.out.println(audi.getMotor() + " centimetros cubicos\n" + audi.getRuedas() + " llantas\n"
                + audi.getPesoTotal() + " kilogramos");
        System.out.println(audi.getTipo() + "\n" + audi.getColor() + "\n");

        Automovil ferrari = new Automovil();
        ferrari.competir();
        ferrari.acelerar();
        System.out.println("desde " + ferrari.getTipo() + " color " + ferrari.getColor() + "\n");
        ferrari.frenar();

        Autobus colectivo = new Autobus();
        colectivo.transportarPasajeros();
        System.out.println("El numero de pasajeros es " + colectivo.getNumeroPasajeros() +
                "\n y el peso del colectivo es " + colectivo.getPesoTotal());
        colectivo.acelerar();
        colectivo.frenar();

        Helicoptero helicopteroCivil = new Helicoptero();
        helicopteroCivil.setcantidadPasajeros(3);
        helicopteroCivil.despegar();
        System.out.println("El helicoptero esta transportando los " +helicopteroCivil.getcantidadPasajeros()+ " pasajeros");
        helicopteroCivil.aterrizar();

        Yate yateComercial = new Yate();
        yateComercial.getCantidadPasajeros();
        yateComercial.arrancar();
        System.out.println("El yate esta transportando los pasajeros a una isla");
        yateComercial.Anclar();

    }
}
