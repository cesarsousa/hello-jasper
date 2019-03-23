package br.com.cesarsousa.model;

public enum TipoFolhaRosto {
	
	FORMULARIOPROTOCOLOMADRIMM2("formularioProtocoloMadriMM2");
	
	private String tipo;

	private TipoFolhaRosto(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
