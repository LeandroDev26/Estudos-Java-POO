/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_method;

/**
 *
 * @author LEAND
 */
public class WindowsFactory implements GUIfactory {
    
    
    @Override
    public Checkbox criarCheckbox() {
        return new CheckboxWindows();
    }

    @Override
    public Botao criarbotao() {
      return new BotaoWindows();
    }
}
