/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.atividadeusuario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LEAND
 */


public class LoginTest {

    @Test
    public void testLoginCompletoSucesso() {
        Login lg = new Login();
        // Usuário correto + Senha com 8 caracteres, Maiúscula e Número
        assertTrue(lg.validarUsuario("test@unifucamp.edu.br", "Senha123"));
    }

    @Test
    public void testSenhaCurta() {
        Login lg = new Login();
        // Senha tem maiúscula e número, mas tem apenas 5 caracteres
        assertFalse(lg.validarUsuario("test@unifucamp.edu.br", "Ab1"));
    }

    @Test
    public void testSenhaSemMaiuscula() {
        Login lg = new Login();
        assertFalse(lg.validarUsuario("test@unifucamp.edu.br", "senha12345"));
    }

    @Test
    public void testSenhaSemNumero() {
        Login lg = new Login();
        assertFalse(lg.validarUsuario("test@unifucamp.edu.br", "SenhaLonga"));
    }

    @Test
    public void testUsuarioInvalido() {
        Login lg = new Login();
        // Mesmo com senha boa, o usuário está errado
        assertFalse(lg.validarUsuario("errado@gmail.com", "Senha123"));
    }
}
