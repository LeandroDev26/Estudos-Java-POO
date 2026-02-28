/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_method;

/**
 *
 * @author LEAND
 */
public class Aplicacao {
    private Botao botao;
    private Checkbox checkbox;

    public Aplicacao(GUIfactory factory) {

        botao = factory.criarbotao();
        checkbox = factory.criarCheckbox();
    }

    public void renderizarUI() {
        botao.renderizar();
        checkbox.renderizar();
    }
}

