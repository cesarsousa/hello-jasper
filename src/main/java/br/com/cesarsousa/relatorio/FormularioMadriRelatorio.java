package br.com.cesarsousa.relatorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.cesarsousa.model.AplicacaoRegistro;
import br.com.cesarsousa.model.BemEServico;
import br.com.cesarsousa.model.ContratanteEServico;
import br.com.cesarsousa.model.DireitoAoArquivo;
import br.com.cesarsousa.model.FolhaRosto;
import br.com.cesarsousa.model.IndicacoesDiversas;
import br.com.cesarsousa.model.OutraDesignacao;
import br.com.cesarsousa.model.Pais;
import br.com.cesarsousa.model.ProtocoloMadri;
import br.com.cesarsousa.model.Representante;
import br.com.cesarsousa.model.TipoAplicacaoRegistroEnum;
import br.com.cesarsousa.model.TipoFolhaRosto;
import br.com.cesarsousa.model.Titular;

public class FormularioMadriRelatorio extends AbstractRelatorio {

	public void relatorio() throws Exception {
		List listagemRelatorio = new ArrayList<>();

		HashMap<String, Object> paramRelatorio = new HashMap<String, Object>();
		
		FolhaRosto folhaRosto = obterFolhaRosto();
		
		paramRelatorio.put("folhaRosto", folhaRosto);

		String nomeRelatorio = folhaRosto.getTipoFolhaRosto().name();

		gerarRelatorio(nomeRelatorio, paramRelatorio, listagemRelatorio);
	}

	private FolhaRosto obterFolhaRosto() {
		FolhaRosto folhaRosto = new FolhaRosto();
		//folhaRosto.setTipoFolhaRosto(TipoFolhaRosto.FORMULARIOPROTOCOLOMADRIMM2US);
		folhaRosto.setTipoFolhaRosto(TipoFolhaRosto.FORMULARIOPROTOCOLOMADRIMM5US);
		folhaRosto.setProtocoloMadri(obterProtocoloMadri());
		//folhaRosto.setProtocoloMadri(new ProtocoloMadri());
		return folhaRosto;
	}

	private ProtocoloMadri obterProtocoloMadri() {
		
		ProtocoloMadri protocoloMadri = new ProtocoloMadri();

		protocoloMadri.setTaxaContinuacao("taxa de continuacao");
		protocoloMadri.setFormularioMm17("formulario mm17");
		protocoloMadri.setReferenciaEscritorio("referencia de escritorio");
		protocoloMadri.setEscritorioOrigemContratante("escritorio de origem da contratante");

		Titular titular = new Titular();
		titular.setNome("nome do titular");
		titular.setEndereco("endereco do titular");
		titular.setEnderecoCorrespondecia("endereço correspondência do titular");
		titular.setTelefone("telefone do titular");
		titular.setFax("fax do titular");
		titular.setEmail("email do titular");
		titular.setPreferenciaIdiomaEspanhol(true);
		titular.setPreferenciaIdiomaFrances(true);
		titular.setPreferenciaIdiomaIngles(true);
		titular.setNacionalidade("nacionalidade do titular");
		titular.setNaturezaPessoaJuridica("natureza pessoa jurídica do titular");
		titular.setNacionalidadePessoaJuridica("nacionalidade pessoa jurídica do titular");
		protocoloMadri.setTitular(titular);

		DireitoAoArquivo direitoAoArquivo = new DireitoAoArquivo();
		direitoAoArquivo.setContratanteEstado(true);
		direitoAoArquivo.setContratanteOrganizacao(true);
		direitoAoArquivo.setDefinicaoContratanteOrganizacao("definição contratante organização");
		direitoAoArquivo.setContratanteDomiciliado(true);
		direitoAoArquivo.setContratanteComercial(true);
		direitoAoArquivo.setEnderecoContratanteComercial("endereço contratante comercial");
		protocoloMadri.setDireitoAoArquivo(direitoAoArquivo);

		Representante representante = new Representante();
		representante.setNome("nome do representante");
		representante.setEndereco("endereco do representante");
		representante.setTelefone("telefone do representante");
		representante.setFax("fax do representante");
		representante.setEmail("email do representante");
		protocoloMadri.setRepresentante(representante);

		List<AplicacaoRegistro> listaAplicacoes = new ArrayList<AplicacaoRegistro>();
		AplicacaoRegistro aplicacao = new AplicacaoRegistro();
		aplicacao.setTipoAplicacaoregistro(TipoAplicacaoRegistroEnum.APLICACAO);
		aplicacao.setNumero("AP455-B001");
		aplicacao.setData("01/01/2015");
		AplicacaoRegistro registro = new AplicacaoRegistro();
		registro.setTipoAplicacaoregistro(TipoAplicacaoRegistroEnum.REGISTRO);
		registro.setNumero("RE455-B001");
		registro.setData("01/02/2016");
		listaAplicacoes.add(aplicacao);
		listaAplicacoes.add(registro);
		protocoloMadri.setAplicacoesRegistros(listaAplicacoes);

		protocoloMadri.setPrioridadeReivindicada(true);
		protocoloMadri.setEscritorioPrioridade("definição do escritório");
		protocoloMadri.setNumeroPrioridade("número da prioridade");
		protocoloMadri.setDataPrioridade("01/01/2015");
		protocoloMadri.setDefinicaoPrioridadesReivindicadas("produtos e serviços");
		protocoloMadri.setMultiplasPrioridades(true);

		protocoloMadri.setMarcaImagem1(
				"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");
		protocoloMadri.setMarcaImagem2(
				"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");
		protocoloMadri.setMarcaPadrao(true);
		protocoloMadri.setMarcaEmCores(true);

		protocoloMadri.setMarcaDistintiva(true);
		protocoloMadri.setCoresReivindicadas("cores da marcas");
		protocoloMadri.setIndicacaoCoresReivindicadas("locais das cores na marca");

		IndicacoesDiversas indicacoesDiversas = new IndicacoesDiversas();
		indicacoesDiversas.setTransliteracaoDaMarca("transiletração da marca");
		indicacoesDiversas.setTransliteracaoParaIngles("transliteração inglês");
		indicacoesDiversas.setTransliteracaoParaFrances("transliteração francês");
		indicacoesDiversas.setTransliteracaoParaEspanhol("transliteração espanhol");
		indicacoesDiversas.setMarcaNaoTransliterada(true);
		indicacoesDiversas.setMarca3D(true);
		indicacoesDiversas.setMarcaSonora(true);
		indicacoesDiversas.setMarcaColetiva(true);
		indicacoesDiversas.setDescricaoMarca("descrição da marca");
		indicacoesDiversas.setDescricaoVoluntariaMarca("descrição voluntária da marca");
		indicacoesDiversas.setElementosVerbais("elementos verbais");
		indicacoesDiversas.setRenunciaDeProtecao("renuncia de proteção");
		protocoloMadri.setIndicacoesDiversas(indicacoesDiversas);

		List<BemEServico> bensEServicos = new ArrayList<BemEServico>();
		BemEServico bemEServico1 = new BemEServico();
		bemEServico1.setClasse("classe a");
		bemEServico1.setServico("bens e serviços diversos a");
		BemEServico bemEServico2 = new BemEServico();
		bemEServico2.setClasse("classe b");
		bemEServico2.setServico("bens e serviços diversos b");
		bensEServicos.add(bemEServico1);
		bensEServicos.add(bemEServico2);
		protocoloMadri.setBensEServicos(bensEServicos);

		protocoloMadri.setLimitarBensEServicos(true);

		List<ContratanteEServico> contratantesEServicos = new ArrayList<ContratanteEServico>();
		ContratanteEServico contratanteEServico1 = new ContratanteEServico();
		contratanteEServico1.setParteContratante("parte contratante 1");
		contratanteEServico1.setDefinicaoClassesServicos("lista de classes, bem 1 e serviços.");
		ContratanteEServico contratanteEServico2 = new ContratanteEServico();
		contratanteEServico2.setParteContratante("parte contratante 2");
		contratanteEServico2.setDefinicaoClassesServicos("lista de classes, bem 2 e serviços.");
		contratantesEServicos.add(contratanteEServico1);
		contratantesEServicos.add(contratanteEServico2);
		protocoloMadri.setContratantesEservicos(contratantesEServicos);

		List<Pais> designacoes = new ArrayList<Pais>();
		Pais paisbr = new Pais();
		paisbr.setSigla("BR");
		paisbr.setNome("Brasil");
		Pais paisfr = new Pais();
		paisfr.setSigla("FR");
		paisfr.setNome("França");
		Pais paisus = new Pais();
		paisus.setSigla("US");
		paisus.setNome("Estados Unidos da América");
		Pais paises = new Pais();
		paises.setSigla("ES");
		paises.setNome("Espanha");

		designacoes.add(paisbr);
		designacoes.add(paisfr);
		designacoes.add(paisus);
		designacoes.add(paises);
		protocoloMadri.setDesignacoes(designacoes);
		
		protocoloMadri.setDesignacaoAlemanha(true);
		protocoloMadri.setDesignacaoEspanha(true);
		protocoloMadri.setDesignacaoFranca(true);
		protocoloMadri.setDesignacaoItalia(true);
		
		List<OutraDesignacao> outrasDesignacoes = new ArrayList<>();
		OutraDesignacao outra1 = new OutraDesignacao();
		outra1.setSiglaNome("GR grafe");		
		outrasDesignacoes.add(outra1);
		OutraDesignacao outra2 = new OutraDesignacao();
		outra2.setSiglaNome("BO Bolenfro");		
		outrasDesignacoes.add(outra2);
		OutraDesignacao outra3 = new OutraDesignacao();
		outra3.setSiglaNome("HY Hyuinh");		
		outrasDesignacoes.add(outra3);
		protocoloMadri.setOutrasDesignacoes(outrasDesignacoes);
		
		

		protocoloMadri.setDataEnvio("01/01/2015");
		protocoloMadri.setEscritorioOrigem("escritório de origem");
		protocoloMadri.setNomeResponsavel("nome");
		protocoloMadri.setEmailResponsavel("email");
		
		return protocoloMadri;

	}

}
