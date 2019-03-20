package br.com.cesarsousa.relatorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FormularioMadriRelatorio extends AbstractRelatorio {
	
	public void relatorio() throws Exception {
		List listagemRelatorio = new ArrayList<>();
		HashMap paramRelatorio = new HashMap();
		String nomeRelatorio = "formularioProtocoloMadri";
		
		gerarRelatorio(nomeRelatorio, paramRelatorio, listagemRelatorio);
	}

}
