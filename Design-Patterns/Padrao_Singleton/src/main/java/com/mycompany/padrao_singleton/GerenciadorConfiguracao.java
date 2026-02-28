/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padrao_singleton;

/**
 *
 * @author LEAND
 */

public class GerenciadorConfiguracao {
    // Atributo estático privado que guardará a única instância
    private static GerenciadorConfiguracao instancia;
    
    // Atributos de exemplo (como se fossem configurações do seu sistema)
    private String nomeSistema;
    private String versao;

    // CONSTRUTOR PRIVADO: Impede que outras classes deem "new GerenciadorConfiguracao()"
    private GerenciadorConfiguracao() {
        this.nomeSistema = "Sistema de Gestão Escolar";
        this.versao = "1.0.2";
        System.out.println("Instância do Gerenciador criada pela primeira vez.");
    }

    //  MÉTODO ESTÁTICO GLOBAL: O único caminho para obter a instância
    public static synchronized GerenciadorConfiguracao getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorConfiguracao();
        }
        return instancia;
    }

    // Métodos de acesso comuns
    public void exibirConfiguracoes() {
        System.out.println("Sistema: " + nomeSistema + " | Versão: " + versao);
    }
}