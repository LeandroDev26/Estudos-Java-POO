/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.conversorromanos;

/**
 *
 * @author LEAND
 */

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ConversorRomanos {
    // Usamos TreeMap para garantir que as chaves sejam percorridas do maior para o menor
    private static final TreeMap<Integer, String> MAPA_ROMANO = new TreeMap<>(Collections.reverseOrder());

    static {
        MAPA_ROMANO.put(1000, "M");
        MAPA_ROMANO.put(900, "CM");
        MAPA_ROMANO.put(500, "D");
        MAPA_ROMANO.put(400, "CD");
        MAPA_ROMANO.put(100, "C");
        MAPA_ROMANO.put(90, "XC");
        MAPA_ROMANO.put(50, "L");
        MAPA_ROMANO.put(40, "XL");
        MAPA_ROMANO.put(10, "X");
        MAPA_ROMANO.put(9, "IX");
        MAPA_ROMANO.put(5, "V");
        MAPA_ROMANO.put(4, "IV");
        MAPA_ROMANO.put(1, "I");
    }

    public String converter(int numero) {
        StringBuilder resultado = new StringBuilder();
        
        for (Map.Entry<Integer, String> entrada : MAPA_ROMANO.entrySet()) {
            int valorFixo = entrada.getKey();
            String simbolo = entrada.getValue();

            // Enquanto o número for maior que o valor romano atual, "gastamos" o valor
            while (numero >= valorFixo) {
                resultado.append(simbolo);
                numero -= valorFixo;
            }
        }
        
        return resultado.toString();
    }
}
