/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1.modelo;

/**
 *
 * @author Córdova
 */
public class Usuario {
    private String name = "";
    private int id = 0;

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
    
    public Usuario(int id, String name){
        this.name = name;
        this.id = id;
    }
}
