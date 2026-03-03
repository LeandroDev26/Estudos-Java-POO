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
public class atividade11 {
     public static void main(String[] args) {
         try (Scanner ler = new Scanner(System.in)) {
             System.out.println("Digite o nome do funcionario:");
              String nome = ler.next();
                
                System.out.println("Digite o salario do funcionario:");
                 double salario = ler.nextDouble();
                  double aumento = 0;
                 
                  System.out.println("Digite a quantos anos ja trabalha na empresa:");
                   int tempo = ler.nextInt();
                   
                  if(tempo <= 3){
                   aumento = salario * 0.03;
                    salario += aumento;
                     System.out.println("O seu novo salario eh igual a :" + salario);
                   }
                 if(tempo > 3 && tempo <10){
                   aumento = salario * 0.125;
                    salario += aumento;
                     System.out.println("O seu novo salario eh igual a :" + salario);
                   }
                  if(tempo >= 10){
                   aumento = salario * 0.2;
                    salario += aumento;
                     System.out.println("O seu novo salario eh igual a :" + salario);
                   }
         }
     }
}
