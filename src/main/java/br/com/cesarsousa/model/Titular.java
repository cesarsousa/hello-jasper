package br.com.cesarsousa.model;

public class Titular {
	
	private String nome;
	private String endereco;
	private String enderecoCorrespondecia;
	private String telefone;
	private String fax;
	private String email;
	private boolean preferenciaIdiomaIngles;
	private boolean preferenciaIdiomaFrances;
	private boolean preferenciaIdiomaEspanhol;
	/**
	 * Campo (2) (f) (i)
	 */
	private String nacionalidade;
	/**
	 * Campo (2) (f) (ii) texto 1
	 */
	private String naturezaPessoaJuridica;
	/**
	 * Campo (2) (f) (ii) texto 2
	 */
	private String nacionalidadePessoaJuridica;
	
	public Titular() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEnderecoCorrespondecia() {
		return enderecoCorrespondecia;
	}
	public void setEnderecoCorrespondecia(String enderecoCorrespondecia) {
		this.enderecoCorrespondecia = enderecoCorrespondecia;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isPreferenciaIdiomaIngles() {
		return preferenciaIdiomaIngles;
	}
	public void setPreferenciaIdiomaIngles(boolean preferenciaIdiomaIngles) {
		this.preferenciaIdiomaIngles = preferenciaIdiomaIngles;
	}
	public boolean isPreferenciaIdiomaFrances() {
		return preferenciaIdiomaFrances;
	}
	public void setPreferenciaIdiomaFrances(boolean preferenciaIdiomaFrances) {
		this.preferenciaIdiomaFrances = preferenciaIdiomaFrances;
	}
	public boolean isPreferenciaIdiomaEspanhol() {
		return preferenciaIdiomaEspanhol;
	}
	public void setPreferenciaIdiomaEspanhol(boolean preferenciaIdiomaEspanhol) {
		this.preferenciaIdiomaEspanhol = preferenciaIdiomaEspanhol;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getNaturezaPessoaJuridica() {
		return naturezaPessoaJuridica;
	}
	public void setNaturezaPessoaJuridica(String naturezaPessoaJuridica) {
		this.naturezaPessoaJuridica = naturezaPessoaJuridica;
	}
	public String getNacionalidadePessoaJuridica() {
		return nacionalidadePessoaJuridica;
	}
	public void setNacionalidadePessoaJuridica(String nacionalidadePessoaJuridica) {
		this.nacionalidadePessoaJuridica = nacionalidadePessoaJuridica;
	}

}
