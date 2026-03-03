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
public class atvidade3 {
     public static void main(String[] args) {
         try (Scanner ler = new Scanner(System.in)) {
             System.out.println("Digite a primeira nota:");
              double nota1 = ler.nextDouble();
             
                System.out.println("Digite a segunda nota:");
                 double nota2 = ler.nextDouble();
                  double media = 0;
                   media = (nota1 + nota2)/2;
                    System.out.println("A media das duas notas eh igual : "+ media);
                    
                      if (media > 7){
                          System.out.println("Parabens seu aproveitamento foi acima da media!!");
                      }else {
                          System.out.println(" Seu aproveitamento foi abaixo da media se esforce mais na proxima!!");
                      }
         }
     }
}
