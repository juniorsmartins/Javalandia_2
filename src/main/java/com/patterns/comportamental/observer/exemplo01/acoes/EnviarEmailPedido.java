package com.patterns.comportamental.observer.exemplo01.acoes;

import com.patterns.comportamental.observer.exemplo01.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido
{
    public void executarAcao(Pedido pedido)
    {
        System.out.println("Enviando e-mail com dados do pedido");
    }



}










