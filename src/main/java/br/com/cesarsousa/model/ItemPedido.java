package br.com.cesarsousa.model;

public class ItemPedido {
	
	private Integer numeroItem;  
    private Produto produto; 
    private Double quantidade;  
    private Double valorTotalItem;
    
	public Integer getNumeroItem() {
		return numeroItem;
	}
	public void setNumeroItem(Integer numeroItem) {
		this.numeroItem = numeroItem;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValorTotalItem() {
		return valorTotalItem;
	}
	public void setValorTotalItem(Double valorTotalItem) {
		this.valorTotalItem = valorTotalItem;
	}
    
}
