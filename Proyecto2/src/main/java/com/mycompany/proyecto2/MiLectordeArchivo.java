/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Córdova
 */
public class MiLectordeArchivo {
    
    public void leer(){
        try{
            File myObj = new File("miarchivo.json");
            Scanner myReader = new Scanner(myObj);
            if(myObj.exists()){
                System.out.println("El archivo "+myObj.getName()+" ya existe");
                while (myReader.hasNextLine()) 
                {
                    String data = myReader.nextLine();
                    System.out.println(data); 
                }
                myReader.close();
            }
            else{
                System.out.println("No existe");
            } 
        }
        catch(Exception ex){
            System.out.println("Ha ocurrido un error"); 
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        MiLectordeArchivo lector = new MiLectordeArchivo();
        lector.leer();
    }
    
}
