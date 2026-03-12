/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.conversorromanos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author LEAND
 */
public class ConversorRomanosTest {
    

@ParameterizedTest
@CsvSource({
    "1, I",
    "4, IV",
    "9, IX",
    "14, XIV",
    "44, XLIV",
    "99, XCIX",
    "2024, MMXXIV",
    "3999, MMMCMXCIX"
})
void testeConversaoComplexa(int entrada, String esperado) {
    ConversorRomanos conv = new ConversorRomanos();
    assertEquals(esperado, conv.converter(entrada));
}
}
