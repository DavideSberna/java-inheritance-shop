package org.java.shop;

public class Prodotto {
	
	private String codice;
	private String nome;
	private String marca;
	private int prezzo;
	private int iva;
	
	public Prodotto(String codice, String nome, String marca, int prezzo) {
		this.codice = codice;
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		this.iva = 22;
	}
	
	public String getCodice() {
		
		return codice;
	}
	public int getIva() {
		
		return iva;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getMarca() {
		
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	public String prezzoBase() {
		return this.prezzo + " euro";
	}
	
	public String prezzoFormattato() {
		int ivaTotale = (getPrezzo() * getIva()) / 100;
		int prezzoTotale = getPrezzo() - ivaTotale;
		return prezzoTotale + " euro";
	}
	
	
	@Override
	public String toString() {

		return getCodice() + " | " + getNome() + " | " + getMarca() + " | " + prezzoFormattato();
	}
	
	
	
	
	
	
	
	
	
	

}
