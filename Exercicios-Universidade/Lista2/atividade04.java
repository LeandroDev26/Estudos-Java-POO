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
public class atividade04 {
     public static void main(String[] args) {
         try (Scanner ler = new Scanner(System.in)) {
             System.out.println(" Digite um numero inteiro :");
              int num = ler.nextInt();
               if(num % 2 == 0){
                   System.out.println("Esse numero eh par!!");
               }else {
                   System.out.println("Esse numero eh impar!!");
               }
             
                     
         }
     }
}
