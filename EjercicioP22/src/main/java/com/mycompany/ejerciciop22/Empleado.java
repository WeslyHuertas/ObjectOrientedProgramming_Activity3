/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciop22;

/**
 *
 * @author Wesly
 */
public class Empleado {
    private String nombre;
    private double salarioHora;
    private int horasTrabajadas;

    public Empleado(String nombre, double salarioHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioHora = salarioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioMensual() {
        return salarioHora * horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }
}
