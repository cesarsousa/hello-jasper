package br.com.cesarsousa.relatorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.cesarsousa.model.Municipio;
import br.com.cesarsousa.model.UF;

public class MunicioRelatorio extends AbstractRelatorio {
	
	public void relatorio() throws Exception {
		
		List<Municipio> listagemMunicipios = obterMunicipios();
		HashMap paramRelatorio = new HashMap();
		String nomeRelatorio = "relMunicipio";
		
		gerarRelatorio(nomeRelatorio, paramRelatorio, listagemMunicipios);
		
	}

	private List<Municipio> obterMunicipios() {
		
		List<Municipio> municipios = new ArrayList<Municipio>();
		
		UF uf = new UF(1, "Rio de janeiro", "RJ");
		municipios.add(new Municipio(1, "Cachoeira de macacu", uf, 2000L));
		
		UF uf2 = new UF(2, "Parana", "PR");
		municipios.add(new Municipio(2, "Cachoeira de macacu", uf2, 3000L));
		
		return municipios;
	}

}
