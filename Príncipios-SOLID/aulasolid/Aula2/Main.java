/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulasolid.Aula2;

/**
 *
 * @author LEAND
 */
public class Main {
    
 public static void main(String[] args) {
      
         Relatorio r1 = new Relatorio();
         r1.setConteudo("Domingo do Bairro");
         r1.gerarRelatorio();
         System.out.println(r1.toString());
        
         SaveArquivo ar1 = new SaveArquivo();
         ar1.SalvarNoArquivo("Domingo no Bairro");
         System.out.println(ar1.toString());
         
         EncaminharArquivo ea = new EncaminharArquivo();
         ea.enviarPorEmail("Matheus");
         System.out.println(ea.toString());
    }
}
