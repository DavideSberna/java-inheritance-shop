package org.java.shop;

public class Cuffie extends Prodotto {

	private String colore;
	private boolean wireless;
	public Cuffie(String codice, String nome, String marca, int prezzo, boolean discount, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, discount);
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
	
	public double finalPrice() {
		if(super.discount()) {
			if(!getWireless()) {
				double amount = (super.prezzoFormattato() * 7) / 100;
				return super.prezzoFormattato() - amount;
			}
			return (super.prezzoFormattato() * 98 / 100);
		}
		return super.prezzoFormattato();
	}
	
	@Override
	public String toString() {

		return super.toString() + " | " + getColore() +  " | " + (getWireless() ? "Wireless" : "No wireless") + " | "  + finalPrice() + " euro";
	}


}
