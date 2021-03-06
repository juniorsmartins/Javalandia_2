package com.java.redesRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Aula01_CadastroImpl extends UnicastRemoteObject implements Aula01_ICadastro
{
	private static final long serialVersionUID = 1L;

	protected Aula01_CadastroImpl() throws RemoteException 
	{super();}
	
	@Override
    public Aula01_Pessoa cadastrarPessoa(Aula01_Pessoa pessoa)
    {
        // Abre classe de acesso ao console
        Scanner scan = new Scanner(System.in);

        // Solicita informaçAo para o usuário
        System.out.println("Digite nome: ");
        String nome = scan.nextLine();

        // Cadastra a informação da pessoa    
        pessoa.setNome(nome);

        // Solicita nova informação ao usuário
        System.out.println("Digite idade: ");
        int idade = Integer.parseInt(scan.nextLine());

        // Cadastra a informação da pessoa
        pessoa.setIdade(idade);

        // Retorna a pessoa cadastrada
        return pessoa;
    }
}