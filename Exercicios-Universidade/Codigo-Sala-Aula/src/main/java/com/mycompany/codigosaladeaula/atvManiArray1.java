/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codigosaladeaula;
import java.util.Scanner;
/**
 *
 * @author LEAND
 */
public class atvManiArray1 {
    public static void main(String[] args) {
          try (Scanner ler = new Scanner(System.in)) {
              int numeros[] = new int [10];
              System.out.println("Primeiro problema :");
               for (int i = 0; i <10;i++){
                    System.out.println(" Digite um numero :");
                    numeros[i]= ler.nextInt();
               }
               System.out.println("Maior numero : " + pesquisaValor(numeros) );
          }
        
        
    }
      
    
    
    public static int pesquisaValor (int numeros[]){
        
        int maior = numeros[0];
        for (int i = 0; i <10;i++){
            
            if (maior <= numeros[i]){
                maior = numeros[i];
            }
         
            
            
        }
        
        return maior;
        }  
    

  }

 

