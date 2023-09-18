package org.java.shop;

public class Cuffie extends Prodotto {

	private String colore;
	private boolean wireless;
	public Cuffie(String codice, String nome, String marca, int prezzo, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo);
		setColore(colore);
		setWireless(wireless);
		
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public boolean getWireless() {
		return wireless;
	}
	
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {

		return getCodice() + " | " + getMarca() + " | " + getNome() + " | " + prezzoFormattato() + " | " + getColore() +  " | " + (getWireless() ? "Wireless" : "No wireless");
	}


}
