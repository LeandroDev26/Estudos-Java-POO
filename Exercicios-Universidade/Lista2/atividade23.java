/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.continuacaolista2;
import java.util.Scanner;
/**
 *
 * @author LEAND
 */
public class atividade23 {
    public static void main(String[] args) {
        int n = 10; // Número de termos que você deseja calcular
        int a = 0, b = 1;

        System.out.print("Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b += temp ;
        }
    }
}

