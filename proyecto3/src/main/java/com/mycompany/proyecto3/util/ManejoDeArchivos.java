/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto3.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Córdova
 */
public class ManejoDeArchivos {
    
    public void crearArchivo(String name){
        File f = new File(name);
        try{ 
            if(f.exists()){
                System.out.println("El archivo "+f.getName()+" ya existe");
            }
            else{
                if (f.createNewFile()) {
                    System.out.println("El archivo "+f.getName()+" ha sido creado");
                    BufferedWriter bw = new BufferedWriter(new FileWriter(name));
                    for(int i = 0; i < 100; i++){
                        bw.write("Fila numero " + i + "\n");
                    }
                    bw.close();
                }
                else {
                    System.out.println("No se pudo crear el archivo");
                }
            }
        }
        
        catch (Exception ex){
            
            System.out.println("Ha ocurrido un error");
        }
    
    }
}
