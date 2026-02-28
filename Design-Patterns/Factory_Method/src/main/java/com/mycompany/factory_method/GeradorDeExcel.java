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
// CriadorConcreto 2
// Especializado em criar DocumentoExcel.
public class GeradorDeExcel extends GeradorDeDocumento {

    @Override
    public Documento criarDocumento() {
        System.out.println("Fábrica de Excel: Criando um novo DocumentoExcel.");
        return new DocumentoExcel();
    }
}