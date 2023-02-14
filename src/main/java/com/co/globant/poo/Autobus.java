package com.co.globant.poo;

import com.co.globant.poo.models.Coche;

public class Autobus extends Coche {

    public void transportarPasajeros(){

        setPesoTotal(5000);
        setNumeroPasajeros(15);
        System.out.println("Transportatando pasajeros desde Autobus");
    }
}
