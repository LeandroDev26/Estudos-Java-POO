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
public class atividade5 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            String frase =ler.next();
              frase = frase.trim();
               String novafrase = frase.replace( "", "");
                 frase = frase.replace("a", "u");
                System.out.println(""+ frase);
               
        }
    }
}
