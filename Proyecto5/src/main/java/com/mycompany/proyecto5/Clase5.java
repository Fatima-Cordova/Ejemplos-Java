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
public class Clase5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        V_Aereo aereo = new V_Aereo(); 
        aereo.setAltitud(105.9);
        aereo.encender();
        
        V_Terrestres terrestre = new V_Terrestres();
        terrestre.setTipoCaja("Automatico");  
        terrestre.apagar();
        
    }
    
}
