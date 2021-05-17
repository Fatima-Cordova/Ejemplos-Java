/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto4.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.proyecto4.model.Usuario;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Córdova
 */
public class ManejoDeArchivo {
    
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
                    GsonBuilder builder = new GsonBuilder();
                    Gson g = builder.setPrettyPrinting().create();
                    ArrayList<Usuario> lista = obtenerListaUsuarios();
                 
                    String gg = g.toJson(lista);
                    int ii=0;
                    bw.write(gg);
                  
                    bw.flush();
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
   
   private ArrayList<Usuario> obtenerListaUsuarios(){
       ArrayList<Usuario> listaDeUsuario = new ArrayList<Usuario>();
       for(int i = 1; i <= 100; i++){
           Usuario user = new Usuario("Usuario "+ i, i);
           
           listaDeUsuario.add(user);     
       }
       return listaDeUsuario;
   }
}
