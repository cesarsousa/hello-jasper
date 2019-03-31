package br.com.cesarsousa.model;

import java.util.List;

public class ProtocoloMadriMM5 {
	
	/**
	 * Campo de cabeçalho.
	 */
	private String referenciaTitular;
	
	/**
	 * Campo de cabeçalho.
	 */
	private String referenciaEscritorio;
	
	/**
	 * Área 1.
	 */
	private List<String> registrosInternacionais;
	
	/**
	 * Área 2.
	 */
	private String cedente;
	
	/**
	 * Área 3.
	 */
	private Cessionaria cessionaria;
	
	/**
	 * Área 4.
	 */
	private DireitoAoRegistro direitoAoRegistro;

	public ProtocoloMadriMM5() {
		super();
	}
	
	public List<String> getRegistrosInternacionais() {
		return registrosInternacionais;
	}
	
	public void setRegistrosInternacionais(List<String> registrosInternacionais) {
		this.registrosInternacionais = registrosInternacionais;
	}
	
	public String getCedente() {
		return cedente;
	}
	
	public void setCedente(String cedente) {
		this.cedente = cedente;
	}
	
	public Cessionaria getCessionaria() {
		return cessionaria;
	}
	
	public void setCessionaria(Cessionaria cessionaria) {
		this.cessionaria = cessionaria;
	}
	
	public String getReferenciaTitular() {
		return referenciaTitular;
	}
	
	public void setReferenciaTitular(String referenciaTitular) {
		this.referenciaTitular = referenciaTitular;
	}
	
	public String getReferenciaEscritorio() {
		return referenciaEscritorio;
	}
	
	public void setReferenciaEscritorio(String referenciaEscritorio) {
		this.referenciaEscritorio = referenciaEscritorio;
	}
	
	public DireitoAoRegistro getDireitoAoRegistro() {
		return direitoAoRegistro;
	}
	
	public void setDireitoAoRegistro(DireitoAoRegistro direitoAoRegistro) {
		this.direitoAoRegistro = direitoAoRegistro;
	}

}
