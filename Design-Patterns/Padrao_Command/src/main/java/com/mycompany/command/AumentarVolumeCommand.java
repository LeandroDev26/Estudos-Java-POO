/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.command;

/**
 *
 * @author LEAND
 */

public class AumentarVolumeCommand implements Command {
    private Tv tv;

    public AumentarVolumeCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.aumentarVolume();
    }

    @Override
    public void undo() {
        tv.diminuirVolume();
    }
}