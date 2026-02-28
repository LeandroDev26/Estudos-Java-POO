/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.command;

/**
 *
 * @author LEAND
 */

public class LigarTvCommand implements Command {
    
    private Tv tv;

    public LigarTvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.ligar();
    }

    @Override
    public void undo() {
        tv.desligar();
    }
}
