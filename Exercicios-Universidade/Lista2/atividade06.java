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
public class atividade06 {
     public static void main(String[] args) {
         try (Scanner ler = new Scanner(System.in)) {
             System.out.println("Digite o ano de seu nascimento :");
              int ano = ler.nextInt();
               int idade =0;
                idade = 2025 - ano;
                 if (idade < 18){
                     idade = 18 - idade ;
                     System.out.println(" Faltam " + idade + " anos para poder se alistar ");
                     
                 }else{
                     idade -= 18;
                      System.out.println(" Passaram " + idade + " anos do alistamento");
                 }
              
         }
     }
}
