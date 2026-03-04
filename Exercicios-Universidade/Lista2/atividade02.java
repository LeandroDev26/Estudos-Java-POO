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
public class atividade02 {
    public static void main(String[] args) {
         try (Scanner ler = new Scanner(System.in)) {
             System.out.println("Digite om ano de seu nascimento :");
             int anodnasc = ler.nextInt();
             int idade = 0; 
             idade = 2025 - anodnasc;
             System.out.println("A sua idade eh : " + idade);
             if (idade >= 16){
                 System.out.println("Voce ja pode votar!!");
             }else{
                  System.out.println("Voce nao pode votar!!");
             }
             
             
             
             
         }
    }
}
