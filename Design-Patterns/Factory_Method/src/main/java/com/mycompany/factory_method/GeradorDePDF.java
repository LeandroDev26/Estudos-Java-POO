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
// CriadorConcreto 1
// Especializado em criar DocumentoPDF.
public class GeradorDePDF extends GeradorDeDocumento {

    // Aqui nós implementamos o Factory Method
    @Override
    public Documento criarDocumento() {
        System.out.println("Fábrica de PDF: Criando um novo DocumentoPDF.");
        return new DocumentoPdf();
    }
}
