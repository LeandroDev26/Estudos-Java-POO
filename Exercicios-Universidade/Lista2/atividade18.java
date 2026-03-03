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
public class atividade18 {
    
    public static void main(String[] args) {
         try (Scanner ler = new Scanner(System.in)) {
              int numcont1 = 0 , numfin2 = 0 , numincr = 0 ;
              
               System.out.println(" Digite o primeiro valor:");
                     numcont1=ler.nextInt();
              
                      System.out.println(" Digite o ultimo valor:");
                         numfin2=ler.nextInt();
         
  
              
             while (numcont1 > numfin2){
                 
                   System.out.println("Acao invalida primeiro valor maior que o ultimo!! tente novamente");
                         
                   System.out.println(" Digite o primeiro valor:");
                     numcont1=ler.nextInt();
              
                      System.out.println(" Digite o ultimo valor:");
                         numfin2=ler.nextInt();
                       
                         
              }
                         
                           System.out.println(" Digite o incremento:");
                             numincr=ler.nextInt();
              
              
              for (int i = numcont1; i <= numfin2; i += numincr){
                System.out.println(i);                   
            }
              System.out.println("Acabou!");
         }
     }
}
