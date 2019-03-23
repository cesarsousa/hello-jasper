package br.com.cesarsousa.model;

public class DireitoAoArquivo {
	
	/**
	 * Campo (a) (i)
	 */
	private boolean contratanteEstado;
	/**
	 * Campo (a) (ii)
	 */
	private boolean contratanteOrganizacao;
	/**
	 * Campo (a) (ii) texto
	 */
	private String definicaoContratanteOrganizacao;
	/**
	 * Campo (a) (iii)
	 */
	private boolean contratanteDomiciliado;
	/**
	 * Campo (a) (iv)
	 */
	private boolean contratanteComercial;
	/**
	 * Campo (b) (ii)
	 */
	private String enderecoContratanteComercial;
	
	public DireitoAoArquivo() {
		super();
	}

	public boolean isContratanteEstado() {
		return contratanteEstado;
	}

	public void setContratanteEstado(boolean contratanteEstado) {
		this.contratanteEstado = contratanteEstado;
	}

	public boolean isContratanteOrganizacao() {
		return contratanteOrganizacao;
	}

	public void setContratanteOrganizacao(boolean contratanteOrganizacao) {
		this.contratanteOrganizacao = contratanteOrganizacao;
	}

	public String getDefinicaoContratanteOrganizacao() {
		return definicaoContratanteOrganizacao;
	}

	public void setDefinicaoContratanteOrganizacao(String definicaoContratanteOrganizacao) {
		this.definicaoContratanteOrganizacao = definicaoContratanteOrganizacao;
	}

	public boolean isContratanteDomiciliado() {
		return contratanteDomiciliado;
	}

	public void setContratanteDomiciliado(boolean contratanteDomiciliado) {
		this.contratanteDomiciliado = contratanteDomiciliado;
	}

	public boolean isContratanteComercial() {
		return contratanteComercial;
	}

	public void setContratanteComercial(boolean contratanteComercial) {
		this.contratanteComercial = contratanteComercial;
	}

	public String getEnderecoContratanteComercial() {
		return enderecoContratanteComercial;
	}

	public void setEnderecoContratanteComercial(String enderecoContratanteComercial) {
		this.enderecoContratanteComercial = enderecoContratanteComercial;
	}

}
