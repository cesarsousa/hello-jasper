package br.com.cesarsousa.model;


public class FolhaRosto {
	
	private TipoFolhaRosto tipoFolhaRosto;
	
	private ProtocoloMadri protocoloMadri;
	
	private ProtocoloMadriMM5 protocoloMadriMM5;

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
	
	public ProtocoloMadriMM5 getProtocoloMadriMM5() {
		return protocoloMadriMM5;
	}
	
	public void setProtocoloMadriMM5(ProtocoloMadriMM5 protocoloMadriMM5) {
		this.protocoloMadriMM5 = protocoloMadriMM5;
	}

}
