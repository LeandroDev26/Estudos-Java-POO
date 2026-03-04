/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.continuacaolista2;
import java.util.Scanner;
/**
 *
 * @author LEAND
 */
public class atividade21 {

    public static void main(String[] args) {
          int somatorio = 0;
        try (Scanner ler = new Scanner(System.in)) {
            for (int i = 1 ; i <=7; i++){
            System.out.println("Digite um numero:");
            int num = ler.nextInt();
            somatorio += num;
        }
            System.out.println("O somatorio das notas eh :" + somatorio );
        }
    }
}


    

