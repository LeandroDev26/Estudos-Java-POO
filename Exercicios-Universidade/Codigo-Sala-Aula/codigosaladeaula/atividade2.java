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
public class atividade2 {
     
public static void main(String[] args) {
    try (Scanner ler = new Scanner(System.in)) {
        System.out.println("Digite a nota alcancada na prova:");
        double nota = ler.nextDouble();
        int notafin = (int)Math.floor(nota);
        System.out.println("A nota arredondada para baixo eh:" + notafin );
    }
}

}
