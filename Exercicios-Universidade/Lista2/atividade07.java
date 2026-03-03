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
public class atividade7 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite o seu nome :");
             String nome = ler.next();
             
              System.out.println("Digite o seu Sexo  M ou F:");
               String sexo = ler.next();
               
                System.out.println("Digite o valor das compras :");
                 double valor = ler.nextDouble();
                double desconto = 0;
                 
                 if( sexo.equalsIgnoreCase("M")){
                     
                     desconto = valor * 0.05;
                     valor -= desconto;
                      System.out.println("Por seu sexo ser masculino voce obeteve cinco porcento de desconto!");
                       System.out.println("O valor das suas compras com desconto eh: "+ valor);
                     
                   }else if (sexo.equalsIgnoreCase("F")) {
                       
                  desconto = valor * 0.13; 
                  valor -= desconto;
                    System.out.println("Por seu sexo ser feminino voce obeteve treze porcento de desconto!");
                       System.out.println("O valor das suas compras com desconto eh: "+ valor);
                   } else {
                      System.out.println("Sexo inválido. Por favor, digite 'M' ou 'F'.");
                  }
           
               
           
        }
    }
}
