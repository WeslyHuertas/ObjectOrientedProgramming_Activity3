/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicior7;

/**
 *
 * @author Wesly
 */
public class Comparador {
    private double a;
    private double b;
    
    public Comparador(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public String comparar(){
        if (a > b){
            return "A es mayor que B";
        } else if (a == b){
            return "A es igual a B";
        } else{
            return "B es mayor que A";
        }
    }
}
