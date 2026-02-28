package com.mycompany.factory_method;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Interfaces.Documento;

/**
 *
 * @author LEAND
 */
public class DocumentoExcel implements Documento {

   @Override
    public void abrir() {
        System.out.println("Abrindo planilha Excel...");
    }

    @Override
    public void escrever(String conteudo) {
        System.out.println("Inserindo dados na célula A1: '" + conteudo + "'");
    }

    @Override
    public void salvar() {
        System.out.println("Salvando planilha Excel. Operação concluída.");
    }
    
}
