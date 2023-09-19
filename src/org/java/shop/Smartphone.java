package org.java.shop;

public class Smartphone extends Prodotto  {

	private String codImei;
	private int memoria;
	
	public Smartphone(String codice, String nome, String marca, double prezzo, boolean discount, String codImei, int memoria) {
		super(codice, nome, marca, prezzo, discount);
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
	
	public double finalPrice() {
		if(super.discount()) {			
			if(getMemoria() < 32) {
				double amount = (super.prezzoFormattato() * 5) / 100;
				return super.prezzoFormattato() - amount;
			}
			return (super.prezzoFormattato() * 98 / 100);
		}
		return super.prezzoFormattato();
	}
	
	
	
	
	@Override
	public String toString() {
		return super.toString() + " | " + getCodImei() +  " | " + getMemoria()  + " gb" + " | "  + finalPrice() + " euro";
	}

}
