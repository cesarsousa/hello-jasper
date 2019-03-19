package br.com.cesarsousa.model;

public class Municipio {
	
	private Integer id;
	private String nome;
	private UF uf;	
	private Long populacao;
	
	public Municipio() {
		super();
	}
	
	public Municipio(Integer id, String nome, UF uf, Long populacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
		this.populacao = populacao;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public UF getUf() {
		return uf;
	}
	public void setUf(UF uf) {
		this.uf = uf;
	}
	public Long getPopulacao() {
		return populacao;
	}
	public void setPopulacao(Long populacao) {
		this.populacao = populacao;
	}
}
