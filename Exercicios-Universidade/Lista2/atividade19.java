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
public class atividade19 {
     public static void main(String[] args) {
          try (Scanner ler = new Scanner(System.in)) {
                 int num = 6 , resultado = 0 ;
            for (int i = num; i <= 100; i += 2){
                System.out.println(i);
                resultado += i ;
                
            }
            System.out.println("O resultado da soma eh :" + resultado);
          }
     }
}
