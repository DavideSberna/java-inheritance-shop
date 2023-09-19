package org.java.shop;

public class Prodotto {
	
	private String codice;
	private String nome;
	private String marca;
	private double prezzo;
	private int iva;
	private boolean discount;
	
	public Prodotto(String codice, String nome, String marca, double prezzo, boolean discount) {
		this.codice = codice;
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		this.iva = 22;
		this.discount = discount;
	}
	
	public boolean getDiscount() {
		
		return discount;
	}
	public void setDiscount(boolean discount) {
		
		this.discount = discount;
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
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public String prezzoBase() {
		return this.prezzo + " euro";
	}
	
	public double prezzoFormattato() {
		double ivaTotale = (getPrezzo() * getIva()) / 100;
		double prezzoTotale = getPrezzo() + ivaTotale;
		return prezzoTotale;
	}
	
	public boolean discount() {
		if(getDiscount()) {
			return true;
		}
		return false;
		 
	}
	
	
	
	@Override
	public String toString() {

		return getCodice() + " | " + getNome() + " | " + getMarca();
	}
	
	
	
	
	
	
	
	
	
	

}
