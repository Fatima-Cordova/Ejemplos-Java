/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto4.model;

/**
 *
 * @author Córdova
 */
public class Usuario {
    public String name = "";
    public int id = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario() {
    }
    
    public Usuario(String name, int id){
        this.name = name;
        this.id = id;
    }
}
