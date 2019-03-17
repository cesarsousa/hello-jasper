package br.com.cesarsousa.model;

import java.io.Serializable;

public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String imagemB64;
	private String nome;
    private String endereco;
    private String uf;
    
    public String getImagemB64() {
		return imagemB64;
	}
    
    public void setImagemB64(String imagemB64) {
		this.imagemB64 = imagemB64;
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
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	

	
	
	
}
