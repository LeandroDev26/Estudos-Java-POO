/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.command;

/**
 *
 * @author LEAND
 */
import java.util.Stack;

class ControleRemoto {
    
    private Stack<Command> historico = new Stack<>();

    public void executarComando(Command comando) {
        comando.execute();
        historico.push(comando); 
    }

    public void desfazerUltimoComando() {
        if (!historico.isEmpty()) {
            Command ultimoComando = historico.pop();
            ultimoComando.undo();
        } else {
            System.out.println("Nada para desfazer.");
        }
    }
}
