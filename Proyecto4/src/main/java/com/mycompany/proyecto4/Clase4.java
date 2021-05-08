/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto4;

import com.mycompany.proyecto4.util.ManejoDeArchivo;

/**
 *
 * @author Córdova
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManejoDeArchivo manejo = new ManejoDeArchivo();
        manejo.crearArchivo("Salida.json");
    }
}
