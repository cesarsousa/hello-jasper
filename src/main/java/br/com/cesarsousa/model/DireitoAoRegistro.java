package br.com.cesarsousa.model;

/**
 * Esta classe representa a área 4 do formulário MM5 do protocolo de Madri.
 * 
 * @author Calma Informática
 *
 */
public class DireitoAoRegistro {
	
	/**
	 * Campo (a) (i)
	 */
	private String nomeContratante;
	
	/**
	 * Campo (a) (ii)
	 */
	private String nomeEstado;
	
	/**
	 * Campo (a) (iii)
	 */
	private String nomeCessionarioDomiciliado;
	
	/**
	 * Campo (a) (iv)
	 */
	private String nomeEstabelecimentoComercial;
	
	/**
	 * Campo (b) (ii)
	 */
	private String enderecoEstabelecimentoComercial;

	public DireitoAoRegistro() {
		super();
	}

	public String getNomeContratante() {
		return nomeContratante;
	}

	public void setNomeContratante(String nomeContratante) {
		this.nomeContratante = nomeContratante;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public String getNomeCessionarioDomiciliado() {
		return nomeCessionarioDomiciliado;
	}

	public void setNomeCessionarioDomiciliado(String nomeCessionarioDomiciliado) {
		this.nomeCessionarioDomiciliado = nomeCessionarioDomiciliado;
	}

	public String getNomeEstabelecimentoComercial() {
		return nomeEstabelecimentoComercial;
	}

	public void setNomeEstabelecimentoComercial(String nomeEstabelecimentoComercial) {
		this.nomeEstabelecimentoComercial = nomeEstabelecimentoComercial;
	}

	public String getEnderecoEstabelecimentoComercial() {
		return enderecoEstabelecimentoComercial;
	}

	public void setEnderecoEstabelecimentoComercial(String enderecoEstabelecimentoComercial) {
		this.enderecoEstabelecimentoComercial = enderecoEstabelecimentoComercial;
	}

}
