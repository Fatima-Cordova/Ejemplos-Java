/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

import com.mycompany.proyecto1.modelo.Usuario;
import java.io.File;

/**
 *
 * @author Córdova
 */
public class Proyecto1 {
    
    public void crearDirectorio(){
        File f = new File("CarpetaDesdeJava");
        try{
            if(f.exists()){
                System.out.println("El archivo "+f.getName()+" ya existe");
            }
            else{
                if (f.mkdir()){
                    System.out.println("La carpeta "+f.getName()+" ha sido creada");
                }
                else {
                    System.out.println("No se pudo crear la carpeta");
                }
            }
        }
        
        catch (Exception ex){
            
            System.out.println("Ha ocurrido un error");
        }
    }
    
    public static void main(String [] arg){
        Usuario user = new Usuario(1, "HOLA WAPO");
        System.out.println(user.getName());
        
        Proyecto1 project = new Proyecto1();
        project.crearDirectorio();
    }
    
}
