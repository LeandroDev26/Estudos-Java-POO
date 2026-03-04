/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2atv1;
import java.util.Scanner;
/**
 *
 * @author LEAND
 */
public class atividade01{

    public static void main(String[] args) {
       try (Scanner ler = new Scanner(System.in)) {
           System.out.println("Qual e a velocidade do carro:");
           int velocidade =ler.nextInt();
           int multa = 0;
           
           if (velocidade > 80){
               
               multa = velocidade - 80;
               multa *= 5;
                System.out.println("Voce foi multado no valor de: " + multa +" R$ ");
           }
           
          
       }
    }
}
