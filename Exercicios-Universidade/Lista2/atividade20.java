/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2atv1;

import java.util.Scanner;

/**
 *
 * @author LEAND
 */
public class atividade20 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
                int num = 500, resultado = 0 ;
            for (int i = 0; i < num; i++ ){
                num += -50;
                System.out.println(num);
                resultado += num ;
                
            }
            System.out.println("O resultado da soma eh :" + resultado);
          }
        }
    }

