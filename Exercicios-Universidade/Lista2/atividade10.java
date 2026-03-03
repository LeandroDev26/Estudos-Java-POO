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
public class atividade10 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Qual e a largura do seu terreno:");
               double larg = ler.nextDouble();
             
             System.out.println("Qual e o comprimento do seu terreno:");
              double comp = ler.nextDouble();
                double area = comp * larg ;
                
                System.out.println("A area do seu terreno eh : " + area + " metros quadrados ");
                
                 if (area < 100){
                     System.out.println("O seu terreno e classificado como TERRENO POPULAR!");
                 }
                 if (area >=100 && area <=500){
                     System.out.println("O seu terreno e classificado como TERRENO MASTER ");
                 }
                if (area > 500){
                     System.out.println("O seu terreno e classificado como TERRENO VIP!");
                 }
        }
    }

}
