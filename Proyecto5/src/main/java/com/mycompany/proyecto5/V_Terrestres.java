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
public class V_Terrestres extends Vehiculos{
    private String tipoCaja= "";

    public String getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }
    
     @Override
     public void apagar(){
        System.out.println("Apagando vehículo");
    } 
} 