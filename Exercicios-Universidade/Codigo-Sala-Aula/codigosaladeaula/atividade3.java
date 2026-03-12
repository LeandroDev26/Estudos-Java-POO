/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codigosaladeaula;

/**
 *
 * @author LEAND
 */
public class atividade3 {
     public static void main(String[] args) {
     
         int dado1 , dado2, n = 1;
         do{
           System.out.println("Rodada:" + n++);
           dado1 = (int) ((Math.random() * 6) +1);
             dado2 = (int) ((Math.random() * 6) +1);
             System.out.println("Dado 1 :" +dado1 +"\n Dado 2:" + dado2);
         }while(dado1 != dado2);
         }
     }

