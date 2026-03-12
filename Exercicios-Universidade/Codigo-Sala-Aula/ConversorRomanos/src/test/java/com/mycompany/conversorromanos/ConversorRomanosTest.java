/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.conversorromanos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author LEAND
 */
public class ConversorRomanosTest {
    
  @Test
  void testeConverter(){
      ConversorRomanos conv = new ConversorRomanos();
      String romano = conv.converter(1);
      assertEquals("I" , romano, "1 em romano é I");
      
  }
  
   void testeConverter2(){
      ConversorRomanos conv = new ConversorRomanos();
      String romano = conv.converter(2);
      assertEquals("II" , romano, "2 em romano é II");
      
  }
  
  void testeConverter3(){
      ConversorRomanos conv = new ConversorRomanos();
      String romano = conv.converter(3);
      assertEquals("III" , romano, "3 em romano é III");
      
  }
  
  void testeConverter4(){
      ConversorRomanos conv = new ConversorRomanos();
      String romano = conv.converter(4);
      assertEquals("IV" , romano, "4 em romano é IV");
      
  }
    
}
