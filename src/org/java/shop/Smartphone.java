package org.java.shop;

public class Smartphone extends Prodotto  {

	private String codImei;
	private int memoria;
	
	public Smartphone(String codice, String nome, String marca, int prezzo, String codImei, int memoria) {
		super(codice, nome, marca, prezzo);
		setCodImei(codImei);
		setMemoria(memoria);
	}
	
	public String getCodImei() {
		return codImei;
	}
	
	public void setCodImei(String codImei) {
		this.codImei = codImei;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {

		return getCodice() + " | " + getMarca() + " | " + getNome() + " | " + prezzoFormattato() + " | " + getCodImei() +  " | " + getMemoria()  + " gb";
	}

}
