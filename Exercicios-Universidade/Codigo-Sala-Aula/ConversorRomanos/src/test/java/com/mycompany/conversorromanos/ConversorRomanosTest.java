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
    
}
