/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicior10;

/**
 *
 * @author Wesly
 */
public class Matricula {
    private String numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estrato;
    private static final double VALOR_CONSTANTE = 50000;

    public Matricula(String numeroInscripcion, String nombres, double patrimonio, int estrato) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }

    public double calcularPago() {
        double pagoMatricula = VALOR_CONSTANTE;
        if (patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += 0.03 * patrimonio;
        }
        return pagoMatricula;
    }

    public String getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public String getNombres() {
        return nombres;
    }
}
