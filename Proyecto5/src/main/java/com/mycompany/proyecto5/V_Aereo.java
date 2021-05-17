/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto5;

/**
 *
 * @author Córdova
 */
public class V_Aereo extends Vehiculos{
    private double altitud = 0.0;

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
    
    @Override
     public void encender(){
        System.out.println("Encendiendo avión");
    } 
}