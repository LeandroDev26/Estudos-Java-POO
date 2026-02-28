/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.command;

/**
 *
 * @author LEAND
 */
public class TrocarCanalCommand implements Command {
    
    private Tv tv;
    private int canalAnterior;
    private int novoCanal;

    public TrocarCanalCommand(Tv tv, int novoCanal) {
        this.tv = tv;
        this.novoCanal = novoCanal;
    }

    @Override
    public void execute() {
        this.canalAnterior = tv.getCanal(); 
        tv.mudarCanal(novoCanal);
    }

    @Override
    public void undo() {
        tv.mudarCanal(canalAnterior);
    }
}