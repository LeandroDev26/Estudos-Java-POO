/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulasolid.Aula2;

/**
 *
 * @author LEAND
 */
public class CalculadoraFrete {

    public double calcular(String tipoTransporte, double peso, double distancia) {
        if ("MOTOBOY".equals(tipoTransporte)) {
            return peso * distancia * 0.5;
        } else if ("CAMINHAO".equals(tipoTransporte)) {
            return peso * distancia * 1.2;
        }
        throw new IllegalArgumentException("Tipo de transporte inválido.");
    }
}
