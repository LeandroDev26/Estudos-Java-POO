/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.continuacaolista2;
import java.util.Scanner;
/**
 *
 * @author LEAND
 */
public class atividade22 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite o primeiro termo da PA:");
             int p1= ler.nextInt();
             int resultado = 0;
               System.out.println("Digite a razao da PA:");
                int r = ler.nextInt();
                 for (int i = 0; i < 10; i++ ){
                System.out.println(p1);
                p1 += r;
                resultado += p1 ;
                
                 }
                 System.out.println("A soma dos valores acima sao :" + resultado);
                
        }
    }
}
