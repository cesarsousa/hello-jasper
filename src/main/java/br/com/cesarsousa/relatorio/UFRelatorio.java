package br.com.cesarsousa.relatorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.cesarsousa.model.UF;

public class UFRelatorio extends AbstractRelatorio {

	public void relatorio() throws Exception {
		
		List<UF> listagemUfs = obterUf();
		HashMap paramRelatorio = new HashMap();
		String nomeRelatorio = "relUF";
		
		gerarRelatorio(nomeRelatorio, paramRelatorio, listagemUfs);
		
	}

	private List<UF> obterUf() {
		List<UF> listagem = new ArrayList<UF>();
		listagem.add(new UF(1, "Parana", "PR"));
		listagem.add(new UF(2, "Sao Paulo", "SP"));
		listagem.add(new UF(3, "Rio de Janeiro", "RJ"));
		listagem.add(new UF(4, "Amazonas", "AM"));
		return listagem;
	}
}
