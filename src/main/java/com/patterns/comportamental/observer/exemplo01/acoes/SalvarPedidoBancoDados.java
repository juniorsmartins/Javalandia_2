package com.patterns.comportamental.observer.exemplo01.acoes;

import com.patterns.comportamental.observer.exemplo01.Pedido;

public class SalvarPedidoBancoDados implements AcaoAposGerarPedido
{
    public void executarAcao(Pedido pedido)
    {
        System.out.println("Salvar pedido no banco de dados");
    }
}










