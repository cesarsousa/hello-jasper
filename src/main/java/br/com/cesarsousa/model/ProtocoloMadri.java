package br.com.cesarsousa.model;

import java.util.List;

public class ProtocoloMadri {
	
private String idioma;
	
	/**
	 * Campo de cabeçalho.
	 */
	private String taxaContinuacao;
	/**
	 * Campo de cabeçalho.
	 */
	private String formularioMm17;
	/**
	 * Campo de cabeçalho.
	 */
	private String referenciaEscritorio;
	/**
	 * Campo de cabeçalho.
	 */
	private String escritorioOrigemContratante;
	
	/**
	 * Área 2 'applicant'.
	 */
	private Titular titular;
	
	/**
	 * Área 3 'entitlement to file.
	 */
	private DireitoAoArquivo direitoAoArquivo;
	
	/**
	 * Área 4 'appointment of a representative'.
	 */
	private Representante representante;
	
	private List<AplicacaoRegistro> aplicacoesRegistros;
	
	/**
	 * Área 6 campo check 1.
	 */
	private boolean prioridadeReivindicada;
	private String escritorioPrioridade;
	private String numeroPrioridade;
	private String dataPrioridade;
	private String definicaoPrioridadesReivindicadas;
	/**
	 * Área 6 campo check 2.
	 */
	private boolean multiplasPrioridades;
	
	/**
	 * Área 7 campo (a).
	 */
	private String marcaImagem1;
	/**
	 * Área 7 campo (b).
	 */
	private String marcaImagem2;
	/**
	 * Área 7 campo (c).
	 */
	private boolean marcaPadrao;
	/**
	 * Área 7 campo (d).
	 */
	private boolean marcaEmCores;
	
	/**
	 * Área 8 campo (a).
	 */
	private boolean marcaDistintiva;
	/**
	 * Área 8 campo (a).
	 */
	private String coresReivindicadas;
	/**
	 * Área 8 campo (b).
	 */
	private String indicacaoCoresReivindicadas;
	
	
	/**
	 * Área 9 'miscellaneous indications'.
	 */
	private IndicacoesDiversas indicacoesDiversas;
	
	private List<BemEServico> bensEServicos;	
	private boolean limitarBensEServicos;
	private List<ContratanteEServico> contratantesEServicos;
	
	private List<Pais> designacoes;
	private List<OutraDesignacao> outrasDesignacoes;
	private boolean designacaoFranca;
	private boolean designacaoAlemanha;
	private boolean designacaoItalia;
	private boolean designacaoEspanha;
	
	private String dataEnvio;
	private String escritorioOrigem;
	private String nomeResponsavel;
	private String emailResponsavel;
	
	public ProtocoloMadri() {
		super();
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getTaxaContinuacao() {
		return taxaContinuacao;
	}

	public void setTaxaContinuacao(String taxaContinuacao) {
		this.taxaContinuacao = taxaContinuacao;
	}

	public String getFormularioMm17() {
		return formularioMm17;
	}

	public void setFormularioMm17(String formularioMm17) {
		this.formularioMm17 = formularioMm17;
	}

	public String getReferenciaEscritorio() {
		return referenciaEscritorio;
	}

	public void setReferenciaEscritorio(String referenciaEscritorio) {
		this.referenciaEscritorio = referenciaEscritorio;
	}

	public String getEscritorioOrigemContratante() {
		return escritorioOrigemContratante;
	}

	public void setEscritorioOrigemContratante(String escritorioOrigemContratante) {
		this.escritorioOrigemContratante = escritorioOrigemContratante;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	
	public DireitoAoArquivo getDireitoAoArquivo() {
		return direitoAoArquivo;
	}
	
	public void setDireitoAoArquivo(DireitoAoArquivo direitoAoArquivo) {
		this.direitoAoArquivo = direitoAoArquivo;
	}

	public Representante getRepresentante() {
		return representante;
	}
	
	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}
	
	public List<AplicacaoRegistro> getAplicacoesRegistros() {
		return aplicacoesRegistros;
	}
	
	public void setAplicacoesRegistros(List<AplicacaoRegistro> aplicacoesRegistros) {
		this.aplicacoesRegistros = aplicacoesRegistros;
	}

	public boolean isPrioridadeReivindicada() {
		return prioridadeReivindicada;
	}

	public void setPrioridadeReivindicada(boolean prioridadeReivindicada) {
		this.prioridadeReivindicada = prioridadeReivindicada;
	}

	public String getEscritorioPrioridade() {
		return escritorioPrioridade;
	}

	public void setEscritorioPrioridade(String escritorioPrioridade) {
		this.escritorioPrioridade = escritorioPrioridade;
	}

	public String getNumeroPrioridade() {
		return numeroPrioridade;
	}

	public void setNumeroPrioridade(String numeroPrioridade) {
		this.numeroPrioridade = numeroPrioridade;
	}

	public String getDataPrioridade() {
		return dataPrioridade;
	}

	public void setDataPrioridade(String dataPrioridade) {
		this.dataPrioridade = dataPrioridade;
	}

	public String getDefinicaoPrioridadesReivindicadas() {
		return definicaoPrioridadesReivindicadas;
	}

	public void setDefinicaoPrioridadesReivindicadas(String definicaoPrioridadesReivindicadas) {
		this.definicaoPrioridadesReivindicadas = definicaoPrioridadesReivindicadas;
	}	

	public String getMarcaImagem1() {
		return marcaImagem1;
	}

	public void setMarcaImagem1(String marcaImagem1) {
		this.marcaImagem1 = marcaImagem1;
	}

	public String getMarcaImagem2() {
		return marcaImagem2;
	}

	public void setMarcaImagem2(String marcaImagem2) {
		this.marcaImagem2 = marcaImagem2;
	}

	public boolean isMarcaPadrao() {
		return marcaPadrao;
	}

	public void setMarcaPadrao(boolean marcaPadrao) {
		this.marcaPadrao = marcaPadrao;
	}

	public boolean isMarcaEmCores() {
		return marcaEmCores;
	}

	public void setMarcaEmCores(boolean marcaEmCores) {
		this.marcaEmCores = marcaEmCores;
	}

	public boolean isMarcaDistintiva() {
		return marcaDistintiva;
	}

	public void setMarcaDistintiva(boolean marcaDistintiva) {
		this.marcaDistintiva = marcaDistintiva;
	}

	public String getCoresReivindicadas() {
		return coresReivindicadas;
	}

	public void setCoresReivindicadas(String coresReivindicadas) {
		this.coresReivindicadas = coresReivindicadas;
	}

	public String getIndicacaoCoresReivindicadas() {
		return indicacaoCoresReivindicadas;
	}

	public void setIndicacaoCoresReivindicadas(String indicacaoCoresReivindicadas) {
		this.indicacaoCoresReivindicadas = indicacaoCoresReivindicadas;
	}
	
	public IndicacoesDiversas getIndicacoesDiversas() {
		return indicacoesDiversas;
	}
	
	public void setIndicacoesDiversas(IndicacoesDiversas indicacoesDiversas) {
		this.indicacoesDiversas = indicacoesDiversas;
	}

	public List<BemEServico> getBensEServicos() {
		return bensEServicos;
	}

	public void setBensEServicos(List<BemEServico> bensEServicos) {
		this.bensEServicos = bensEServicos;
	}

	public boolean isLimitarBensEServicos() {
		return limitarBensEServicos;
	}

	public void setLimitarBensEServicos(boolean limitarBensEServicos) {
		this.limitarBensEServicos = limitarBensEServicos;
	}

	public List<ContratanteEServico> getContratantesEServicos() {
		return contratantesEServicos;
	}

	public void setContratantesEservicos(List<ContratanteEServico> contratantesEServicos) {
		this.contratantesEServicos = contratantesEServicos;
	}
	
	public boolean isMultiplasPrioridades() {
		return multiplasPrioridades;
	}

	public void setMultiplasPrioridades(boolean multiplasPrioridades) {
		this.multiplasPrioridades = multiplasPrioridades;
	}

	public List<Pais> getDesignacoes() {
		return designacoes;
	}
	
	public void setDesignacoes(List<Pais> designacoes) {
		this.designacoes = designacoes;
	}
	
	public List<OutraDesignacao> getOutrasDesignacoes() {
		return outrasDesignacoes;
	}
	
	public void setOutrasDesignacoes(List<OutraDesignacao> outrasDesignacoes) {
		this.outrasDesignacoes = outrasDesignacoes;
	}

	public String getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(String dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public String getEscritorioOrigem() {
		return escritorioOrigem;
	}

	public void setEscritorioOrigem(String escritorioOrigem) {
		this.escritorioOrigem = escritorioOrigem;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}

	public boolean isDesignacaoFranca() {
		return designacaoFranca;
	}

	public void setDesignacaoFranca(boolean designacaoFranca) {
		this.designacaoFranca = designacaoFranca;
	}

	public boolean isDesignacaoAlemanha() {
		return designacaoAlemanha;
	}

	public void setDesignacaoAlemanha(boolean designacaoAlemanha) {
		this.designacaoAlemanha = designacaoAlemanha;
	}

	public boolean isDesignacaoItalia() {
		return designacaoItalia;
	}

	public void setDesignacaoItalia(boolean designacaoItalia) {
		this.designacaoItalia = designacaoItalia;
	}

	public boolean isDesignacaoEspanha() {
		return designacaoEspanha;
	}

	public void setDesignacaoEspanha(boolean designacaoEspanha) {
		this.designacaoEspanha = designacaoEspanha;
	}	
	
}
