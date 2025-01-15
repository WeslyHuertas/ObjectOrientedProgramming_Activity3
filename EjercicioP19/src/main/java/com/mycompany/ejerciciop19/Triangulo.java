/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciop19;

/**
 *
 * @author Wesly
 */
public class Triangulo {
    private double lado;
    
    public Triangulo(double lado){
        this.lado = lado;
    }
    
    public double calcularPerimetro(){
        return 3 * lado;
    }
    
    public double calcularAltura() {
        return Math.sqrt(3) / 2 * lado;
    }
    
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }
}
