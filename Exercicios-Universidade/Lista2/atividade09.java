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
public class atividade09 {
    public static void main(String[] args) {
         try (Scanner ler = new Scanner(System.in)) {
             System.out.println("Digite o primeiro valor de segmento de reta :");
              double lado1 = ler.nextDouble();
             
                System.out.println("Digite o segundo valor de segmento de reta :");
                 double lado2 = ler.nextDouble();
                 
                   System.out.println("Digite o terceiro valor de segmento de reta :");
                    double lado3 = ler.nextDouble();
                    
                     if ((lado1 <(lado2 + lado3)) && (lado2 <(lado1 + lado3)) && (lado3 <(lado1 + lado2))){
                         
                          if(lado1 == lado2 && lado2 == lado3){
                         System.out.println("Eh um triangulo EQUILATERO!!");
                     }
                     if((lado1 == lado2 && lado3 != lado2) || (lado1 == lado3 && lado2 != lado3) || (lado3 == lado2 && lado1 != lado2)){
                          System.out.println("Eh um triangulo ISOSCELES !!");
                     }
                     
                     if((lado1 != lado2 && lado1 != lado3) && (lado1 != lado2 && lado2 != lado3) && lado1 != lado3 && lado2 != lado3 ){
                         System.out.println("Eh um triangulo ESCALENO !!");
                     }
                          
                     }else{
                         System.out.println("Nao e um triangulo!!");
                     }
                     
         }
         
    }
}
