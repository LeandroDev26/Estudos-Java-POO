/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.conversorromanos;

/**
 *
 * @author LEAND
 */
public class ConversorRomanos {

    String converter(int i) {
        if (i == 3) {
            return "III";
        } else if (i == 2) {
            return "II";
        }else if(i == 4){
           return "IV"; 
        }
            return "I";
    }
}
