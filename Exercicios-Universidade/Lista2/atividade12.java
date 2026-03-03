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
public class atividade12 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int num = 6 ;
            for (int i = 0; i < 6; i++){
                System.out.println(num);
                num++;
                if (i==5){
                    System.out.println("Acabou!");
                }
            }
        }
    }
}
