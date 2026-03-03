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


public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();
        
        int vogais = 0, consoantes = 0, espacos = 0;
        StringBuilder posicoesA = new StringBuilder();
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            
            if (c == 'a') {
                posicoesA.append(i).append(" ");
            }
            
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vogais++;
                } else {
                    consoantes++;
                }
            } else if (c == ' ') {
                espacos++;
            }
        }
        
        System.out.println("Número de vogais: " + vogais);
        System.out.println("Número de consoantes: " + consoantes);
        System.out.println("Número de espacos: " + espacos);
        
        if (posicoesA.length() > 0) {
            System.out.println("Posiçoes da letra 'a': " + posicoesA);
        } else {
            System.out.println("A letra 'a' nao aparece na frase.");
        }
        
        scanner.close();
    }
}
