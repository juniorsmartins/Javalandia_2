package com.java.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aula01_Main
{
    public static void main(String[] args)
    {
        List<Aula01_Cliente> listaClientes = new ArrayList<>();
        List<Aula01_Conta> listaContas = new ArrayList<>();

        Aula01_Cliente cliente1 = new Aula01_Cliente("Franz Kafka", "999.888.777-80");
        Aula01_Cliente cliente2 = new Aula01_Cliente("Ludwig Von Mises", "555.666.777-66");
        Aula01_Cliente cliente3 = new Aula01_Cliente("Maria Callas", "111.777.222-72");
        Aula01_Cliente cliente4 = new Aula01_Cliente("Luciano Pavaroti", "100.333.123-57");
        Aula01_Cliente cliente5 = new Aula01_Cliente("Johran Sebastian Bach", "444.452.111-21");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        listaClientes.add(cliente5);

        Aula01_ContaCorrente cc1 = new Aula01_ContaCorrente(12, 222333, cliente1, 0.03);
        Aula01_ContaCorrente cc2 = new Aula01_ContaCorrente(57, 777555, cliente2, 0.025);
        Aula01_ContaCorrente cc3 = new Aula01_ContaCorrente(84, 444111, cliente3, 0.029);
        Aula01_ContaPoupanca pp1 = new Aula01_ContaPoupanca(91, 111999, cliente2, 0.02);
        Aula01_ContaPoupanca pp2 = new Aula01_ContaPoupanca(96, 666999, cliente5, 0.023);
        Aula01_ContaPoupanca pp3 = new Aula01_ContaPoupanca(98, 888999, cliente4, 0.017);

        listaContas.add(cc2);
        listaContas.add(pp3);
        listaContas.add(cc1);
        listaContas.add(cc3);
        listaContas.add(pp2);
        listaContas.add(pp1);

        System.out.println("\n-----------------------\n");

        // Lambda
        listaClientes.sort((Aula01_Cliente o1, Aula01_Cliente o2) -> o1.getNome().compareToIgnoreCase(o2.getNome()));

        // Iterable
        Iterator<Aula01_Cliente> iter = listaClientes.iterator();
        while(iter.hasNext())
        {System.out.println(iter.next());}

        System.out.println("\n-----------------------\n");

        // Lambda
        listaContas.sort((conta1, conta2) -> Integer.compare(conta1.getAgencia(), conta2.getAgencia()));

        listaContas.forEach(conta -> System.out.println(conta));

    }
}
