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
public class atividade8 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Qual a distancia (km) que voce deseja percorrer :");
             double distancia = ler.nextDouble();
              if (distancia <= 200){
                   distancia *= 0.50;
                    System.out.println("A sua passagem vai custar R$ " + distancia );
              }else {
                 
                  distancia *= 0.45;
                   System.out.println("A sua passagem vai custar R$ " + distancia );
              }
        }
    }
}
