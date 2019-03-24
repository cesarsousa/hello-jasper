package br.com.cesarsousa.model;

public enum TipoFolhaRosto {
	
	FORMULARIOPROTOCOLOMADRIMM2US("formularioProtocoloMadriMM2US"),
	FORMULARIOPROTOCOLOMADRIMM2ES("formularioProtocoloMadriMM2ES");
	
	private String tipo;

	private TipoFolhaRosto(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
