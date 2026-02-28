/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstract_method;

/**
 *
 * @author LEAND
 */
public class main {

    private static Aplicacao configurarAplicacao(String os) {
        GUIfactory factory;
        
        if (os.equalsIgnoreCase("windows")) {
            factory = new WindowsFactory();
        } else if (os.equalsIgnoreCase("mac")) {
            factory = new MacFactory();
        } else {

            System.out.println("Sistema Operacional não suportado. Usando padrão (Windows).");
            factory = new WindowsFactory();
        }
        
        return new Aplicacao(factory);
    }

    public static void main(String[] args) {

        System.out.println("Executando a simulação no 'Windows'...");
        Aplicacao appWin = configurarAplicacao("windows");
        appWin.renderizarUI();

        System.out.println("----------------------------------------");

        System.out.println("Executando a simulação no 'macOS'...");
        Aplicacao appMac = configurarAplicacao("mac");
        appMac.renderizarUI();
    }
}
