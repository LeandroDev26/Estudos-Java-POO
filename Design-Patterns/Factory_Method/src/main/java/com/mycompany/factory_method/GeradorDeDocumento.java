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
// Criador (Creator) Abstrato
// Define o processo geral e o "Factory Method" abstrato.
public abstract class GeradorDeDocumento {

    // Este é o Factory Method (Método de Fábrica)
    // Ele é abstrato, forçando as subclasses a implementá-lo.
    public abstract Documento criarDocumento();

    // Este é o processo geral, que é o mesmo para todos.
    // Ele usa o factory method sem saber qual produto real será criado.
    public void gerarDocumentoProcessado() {
        // 1. Pega o documento (sem saber qual é)
        Documento doc = criarDocumento(); 

        // 2. Usa o documento
        doc.abrir();
        doc.escrever("Este é o conteúdo padrão.");
        doc.salvar();
    }
}