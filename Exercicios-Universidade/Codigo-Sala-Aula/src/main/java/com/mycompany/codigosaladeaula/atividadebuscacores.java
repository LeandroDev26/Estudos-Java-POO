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
public class atividadebuscacores {
     public static void main(String[] args) {
         try (Scanner ler = new Scanner(System.in)) {
             String cores [] = { "azul", "verde", "vermelho", "branco", "rosa", "marrom"};
             System.out.println("Qual cor voce procura :");
             String cor = ler.next();
             String res = "cor nao encontrada";
             for (String c : cores ){
                 if (c.equalsIgnoreCase(cor)){
                     res = "cor encontrada ";
                     break;
                 }
             }
             System.out.println(res);
         }
     }
}
