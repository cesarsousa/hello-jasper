package br.com.cesarsousa.model;

import java.util.List;


public class ContratanteEServico {
	
	private String parteContratante;
	private List<BemEServico> bensEservicos;
	
	public ContratanteEServico() {
		super();
	}
		
	public String getParteContratante() {
		return parteContratante;
	}
	
	public void setParteContratante(String parteContratante) {
		this.parteContratante = parteContratante;
	}
	
	public List<BemEServico> getBensEservicos() {
		return bensEservicos;
	}
	
	public void setBensEservicos(List<BemEServico> bensEservicos) {
		this.bensEservicos = bensEservicos;
	}

}
