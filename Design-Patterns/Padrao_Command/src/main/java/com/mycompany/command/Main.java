/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.command;

/**
 *
 * @author LEAND
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tv tvDaSala = new Tv();
        ControleRemoto controle = new ControleRemoto();

        // --- Teste 1: Comandos Simples e Undo ---
        Command ligar = new LigarTvCommand(tvDaSala);
        Command canal5 = new TrocarCanalCommand(tvDaSala, 5);
        Command aumentarVol = new AumentarVolumeCommand(tvDaSala);

        System.out.println("=== TESTE INDIVIDUAL ===");
        controle.executarComando(ligar);       // Liga
        controle.executarComando(canal5);      // Vai pro 5 (salva o 1)
        controle.executarComando(aumentarVol); // Vol 11

        System.out.println("\n=== TESTE UNDO ===");
        controle.desfazerUltimoComando(); // Desfaz volume (Volta pra 10)
        controle.desfazerUltimoComando(); // Desfaz canal (Volta pro 1)
        
        // --- Teste 2: Fila de Comandos (Macro) ---
        
        System.out.println("\n=== TESTE FILA (MACRO) ===");
        Command canalFilmes = new TrocarCanalCommand(tvDaSala, 42);
        Command aumentarVol1 = new AumentarVolumeCommand(tvDaSala);
        Command aumentarVol2 = new AumentarVolumeCommand(tvDaSala);

        // Cria a fila
        MacroCommand rotinaNoturna = new MacroCommand(Arrays.asList(canalFilmes, aumentarVol1, aumentarVol2));

        // Executa a fila inteira de uma vez
        controle.executarComando(rotinaNoturna);

        // Desfaz a fila inteira de uma vez
        System.out.println("\nDesfazendo a rotina inteira:");
        controle.desfazerUltimoComando();
    }
}