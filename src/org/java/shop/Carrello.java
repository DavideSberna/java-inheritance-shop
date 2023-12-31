package org.java.shop;

import java.util.Scanner;

public class Carrello {
	 static boolean haCartaFedelta = false;
	
	 public static Smartphone creaSmartphone(Scanner sc) {
		 System.out.print("Inserisci il codice: ");
     	String codice = sc.nextLine();
     	System.out.print("Inserisci il modello: ");
     	String modello = sc.nextLine();
     	System.out.print("Inserisci la marca: ");
     	String marca = sc.nextLine();
     	System.out.print("Inserisci il prezzo: ");
     	double prezzo = Double.parseDouble(sc.nextLine());
     	System.out.print("Inserisci il codice IMEI: ");
     	String codImei = sc.nextLine();
     	System.out.print("Inserisci i GB di memoria: ");
     	int memoria = Integer.parseInt(sc.nextLine());
     	System.out.print("Hai una carta fedeltà (sì/no)? ");
     	String cartaFedelta = sc.nextLine();
     	haCartaFedelta = cartaFedelta.equalsIgnoreCase("si");

     	return new Smartphone(codice, modello, marca, prezzo, haCartaFedelta, codImei, memoria);
	    }
	 
	 
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        

        System.out.print("Cosa desideri inserire (Smartphone/Televisore/Cuffie)? ");
        String sceltaProdotto = sc.nextLine();

        Prodotto prodotto = null;

        if (sceltaProdotto.equalsIgnoreCase("Smartphone")) {
        	prodotto = creaSmartphone(sc);
        } else if (sceltaProdotto.equalsIgnoreCase("Televisore")) {
             
           
            prodotto = new Televisore("CDF64367", "Galaxy", "samsung", 299,true, 20, 20, true);
        } else if (sceltaProdotto.equalsIgnoreCase("Cuffie")) {
            
          
            prodotto = new Cuffie("L67417YT", "Iphone 1", "Apple", 39, true, "Rosso", true);
        } else {
            System.out.println("Scelta non valida.");
        }
        
        
        
        System.out.println(prodotto);

 
		 
		
		
		
		
		 
		
		
		 
		
		
		

	}

}
