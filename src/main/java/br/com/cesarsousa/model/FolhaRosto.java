package br.com.cesarsousa.model;


public class FolhaRosto {
	
	private TipoFolhaRosto tipoFolhaRosto;
	
	private ProtocoloMadri protocoloMadri;

	public FolhaRosto() {
		super();
	}

	public TipoFolhaRosto getTipoFolhaRosto() {
		return tipoFolhaRosto;
	}

	public void setTipoFolhaRosto(TipoFolhaRosto tipoFolhaRosto) {
		this.tipoFolhaRosto = tipoFolhaRosto;
	}

	public ProtocoloMadri getProtocoloMadri() {
		return protocoloMadri;
	}

	public void setProtocoloMadri(ProtocoloMadri protocoloMadri) {
		this.protocoloMadri = protocoloMadri;
	}
	
	

}
