/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto3;

import com.mycompany.proyecto3.util.ManejoDeArchivos;

/**
 *
 * @author Córdova
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ManejoDeArchivos manejo = new ManejoDeArchivos();
        manejo.crearArchivo("MiSegundoArchivo.txt"); 
    }
    
}
