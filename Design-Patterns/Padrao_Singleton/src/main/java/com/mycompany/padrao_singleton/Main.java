/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padrao_singleton;

/**
 *
 * @author LEAND
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE SINGLETON ===");
        
        // Tenta obter o gerenciador duas vezes
        GerenciadorConfiguracao g1 = GerenciadorConfiguracao.getInstancia();
        GerenciadorConfiguracao g2 = GerenciadorConfiguracao.getInstancia();

        g1.exibirConfiguracoes();

        // Prova que g1 e g2 são exatamente o mesmo objeto na memória
        if (g1 == g2) {
            System.out.println("Sucesso: Ambas as variáveis apontam para a mesma instância!");
        }
    }
}