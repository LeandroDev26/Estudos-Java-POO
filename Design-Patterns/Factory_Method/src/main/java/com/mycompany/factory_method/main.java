/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factory_method;

/**
 *
 * @author LEAND
 */
public class main {
    
    public static void main(String[] args) {
        
        // Queremos gerar um PDF.
        // 1. Escolhemos a fábrica de PDF.
        GeradorDeDocumento minhaFabricaDePDF = new GeradorDePDF();
        
        // 2. Mandamos ela executar o processo geral.
        System.out.println("--- Iniciando processo de PDF ---");
        minhaFabricaDePDF.gerarDocumentoProcessado();
        System.out.println("---------------------------------");
        
        System.out.println("\n"); // Apenas para espaçar a saída

        // Agora, queremos gerar um Excel.
        // 1. Escolhemos a fábrica de Excel.
        GeradorDeDocumento minhaFabricaDeExcel = new GeradorDeExcel();

        // 2. Mandamos ela executar o MESMO processo geral.
        System.out.println("--- Iniciando processo de Excel ---");
        minhaFabricaDeExcel.gerarDocumentoProcessado();
        System.out.println("---------------------------------");
    }
}
