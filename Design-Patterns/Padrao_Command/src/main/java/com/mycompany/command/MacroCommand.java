/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.command;

/**
 *
 * @author LEAND
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MacroCommand implements Command {
    private List<Command> comandos;

    public MacroCommand(List<Command> comandos) {
        this.comandos = comandos;
    }

    @Override
    public void execute() {
        comandos.forEach(Command::execute);
    }

   @Override
public void undo() {
    // Criamos uma nova ArrayList baseada na lista original
    List<Command> reverso = new ArrayList<>(comandos);
    
    // Agora o Collections.reverse vai funcionar sem erro
    Collections.reverse(reverso);
    
    // Executa o undo de cada comando na ordem inversa
    reverso.forEach(Command::undo);
}
    
}    

