package br.com.cesarsousa.model;

public class AplicacaoRegistro {
	
	private TipoAplicacaoRegistroEnum tipoAplicacaoRegistro;
	private String numero;
	private String data;
	
	public AplicacaoRegistro() {
		super();
	}
	
	public TipoAplicacaoRegistroEnum getTipoAplicacaoregistro() {
		return tipoAplicacaoRegistro;
	}
	public void setTipoAplicacaoregistro(TipoAplicacaoRegistroEnum tipoAplicacaoregistro) {
		this.tipoAplicacaoRegistro = tipoAplicacaoregistro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

}
