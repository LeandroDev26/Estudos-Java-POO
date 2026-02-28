/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory_method;

import Interfaces.Documento;

/**
 *
 * @author LEAND
 */
public class DocumentoPdf implements Documento {

   @Override
    public void abrir() {
        System.out.println("Abrindo documento PDF...");
    }

    @Override
    public void escrever(String conteudo) {
        System.out.println("Escrevendo no PDF: '" + conteudo + "'");
    }

    @Override
    public void salvar() {
        System.out.println("Salvando PDF. Operação concluída.");
    }
    
}
