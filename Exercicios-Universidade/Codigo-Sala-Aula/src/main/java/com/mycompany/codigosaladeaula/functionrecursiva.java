/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codigosaladeaula;

/**
 *
 * @author LEAND
 */
public class functionrecursiva {
    
    
        
         public static void main(String[] args) {
             for (int i = 0; i <= 10;i++){
                 int x = fatorial(i);
                 System.out.println(i + " ! = " + x);
             }
         }
    
         public static int fatorial (int num ){
             if (num ==  0){
                 return 1;
                 
             }else {
                 return num * fatorial (num - 1);
             }
         }
    }

