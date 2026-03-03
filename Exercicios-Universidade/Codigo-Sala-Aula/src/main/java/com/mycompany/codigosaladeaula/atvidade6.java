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
public class atvidade6 {
    
    public static final int LINHA =2;
    public static final int COLUNA =3;
    public static final int PROFUNDIDADE =2;
    
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int array [][][] = new int [LINHA][COLUNA][PROFUNDIDADE];
            int cont = 1;
            int somaPar= 0, somaImpar = 0;
             for(int i = 0; i < LINHA;i++){
                 
                 for(int j = 0; j   < COLUNA;j++){
                 
                     for(int x = 0; x < PROFUNDIDADE;x++){
                       array[i][j][x]= cont++;
                       if (array[i][j][x] % 2 == 0){
                           somaPar += array[i][j][x] ;
                       }else{
                           somaImpar += array[i][j][x];
                       }
                  
                       System.out.println( array[i][j][x]);
                       
                   }
                     
                }
                 
                 
             }
        System.out.println("Soma dos numeros pares : "+ somaPar);
                     System.out.println("Soma dos numeros impares : "+ somaImpar);
        }
        
    }
}
