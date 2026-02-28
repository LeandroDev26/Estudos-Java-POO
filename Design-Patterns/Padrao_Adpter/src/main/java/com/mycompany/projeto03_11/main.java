 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto03_11;

/**
 *
 * @author LEAND
 */
public class main {

    public static void main(String[] args) {


        // 1. Crie a instância do novo sistema de pagamento (o "Adapter")
        PagamentoNovo sistemaNovo = new PagamentoNovo();

        // 2. Crie o Adaptador, "embrulhando" o novo sistema
        // O adaptador implementa a interface ANTIGA (PagamentoAntigo),
        // mas internamente ele usa o sistema NOVO (PagamentoNovo).
        PagamentoAntigo adaptador = new PagamentoAdpter(sistemaNovo);


        // 3. Agora, o seu código "legado" (o main, neste caso)
        // pode continuar chamando o método antigo que ele já conhecia.
        System.out.println("Cliente: Vou fazer um pagamento usando a interface antiga...");

        String cartaoDoCliente = "9876-5432-1098-7654";
        
        // O cliente chama pagarComCartao(), que é da interface PagamentoAntigo
        adaptador.pagarComCartao(cartaoDoCliente);
        
        // 4. A mágica acontece: O adaptador traduziu a chamada e invocou
        // o 'processarPagamento()' do PagamentoNovo.
        
        System.out.println("Cliente: Pagamento concluído!");

    }
}