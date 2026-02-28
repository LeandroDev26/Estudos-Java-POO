/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.command;

/**
 *
 * @author LEAND
 */
public class Tv {
    private boolean ligada = false;
    private int volume = 10;
    private int canal = 1;

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV desligada.");
    }

    public void aumentarVolume() {
        if (ligada) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada) {
            this.canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        }
    }
    
    public int getCanal() {
        return canal;
    }
}
