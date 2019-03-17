package br.com.cesarsousa.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.cesarsousa.model.Cliente;
import br.com.cesarsousa.relatorio.ClienteREL;



public class RelatorioTeste 
{
	public static void main(String[] args)
	{
		try{
			List<Cliente> clientes = new ArrayList<Cliente>();
			
			Cliente cliente1 = new Cliente();
			cliente1.setNome("RD Tecnologia");
			
			Cliente cliente2 = new Cliente();
			cliente2.setNome("Romero Gonçalves Dias");
			
			Cliente cliente3 = new Cliente();
			cliente3.setNome("FLC Tecnologia");
			
			clientes.add(cliente1);
			clientes.add(cliente2);
			clientes.add(cliente3);
			
			ClienteREL relatorio = new ClienteREL();
			relatorio.imprimir(clientes);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}