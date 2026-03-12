/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.codigosaladeaula;
import java.util.Scanner;
/**
 *
 * @author LEAND
 */
public class atividade1 {

    public static void main(String[] args) {
         try (Scanner ler = new Scanner(System.in)) {
             System.out.println("Digite a quantidade de passageiros embarcados:");
             float passageiros =ler.nextFloat();
             int quantonib = (int)Math.ceil(passageiros /50);
             System.out.println("Quantidade de onibus necessaria sera de :" + quantonib);
             
             
         }
    }
}
