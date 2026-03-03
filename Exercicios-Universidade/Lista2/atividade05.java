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
public class atividade5 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite um ano :");
            int ano = ler.nextInt();
             if (ano % 4 == 0){
                 System.out.println("Esse ano eh bissexto!!");
             }else{
                 System.out.println("Esse ano nao eh bissexto!!");
             }
        }
    }
}
