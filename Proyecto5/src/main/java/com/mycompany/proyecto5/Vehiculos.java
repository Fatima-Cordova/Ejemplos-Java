/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto5;

import com.mycompany.proyecto5.interfaces.IVehiculo;

/**
 *
 * @author Córdova
 */
public abstract class Vehiculos implements IVehiculo{
    @Override
    public void encender(){
        System.out.println("Encendiendo vehículo");
    } 
    
    @Override
    public void apagar(){
        System.out.println("Apagando vehículo");
    }

    @Override
    public void acelerar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void frenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
