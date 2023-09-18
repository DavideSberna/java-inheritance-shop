package org.java.shop;

public class Televisore extends Prodotto {
	private int width;
	private int height;
	private boolean smart;

	public Televisore(String codice, String nome, String marca, int prezzo, int width, int height, boolean smart) {
		super(codice, nome, marca, prezzo);
		setWidth(width);
		setHeight(height);
		setSmart(smart);
		
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean getSmart() {
		return smart;
	}
	
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	public String dimensioni() {
		return (getWidth() * getHeight()) + " pollici" ;
	}
	
	@Override
	public String toString() {

		return getCodice() + " | " + getMarca() + " | " + getNome() + " | " + prezzoFormattato() + " | " + dimensioni() +  " | " + (getSmart() ? "Smart TV" : "No Smart TV");
	}

}
