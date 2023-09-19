package org.java.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        boolean haCartaFedelta = false;

        System.out.print("Cosa desideri inserire (Smartphone/Televisore/Cuffie)? ");
        String sceltaProdotto = sc.nextLine();

        Prodotto prodotto = null;

        if (sceltaProdotto.equalsIgnoreCase("Smartphone")) {
        	 System.out.print("Inserisci il codice: ");
             String codice = sc.nextLine();
             System.out.print("Inserisci il modello: ");
             String modello = sc.nextLine();
             System.out.print("Inserisci la marca: ");
             String marca = sc.nextLine();
             System.out.print("Inserisci il prezzo: ");
             double prezzo = sc.nextDouble();
             sc.nextLine();
             System.out.print("Hai una carta fedeltà (sì/no)? ");
             String cartaFedelta = sc.nextLine();
             haCartaFedelta = cartaFedelta.equalsIgnoreCase("sì") ? true : false;
             
             
             System.out.print("Inserisci il cdice IMEI: ");
             String codImei = sc.nextLine();
             System.out.print("Inserisci i gb di memoria: ");
             int memoria = sc.nextInt();
             
             prodotto = new Smartphone(codice, modello, marca, prezzo, haCartaFedelta, codImei, memoria);
        } else if (sceltaProdotto.equalsIgnoreCase("Televisore")) {
             
           
            prodotto = new Televisore("CDF64367", "Galaxy", "samsung", 299,true, 20, 20, true);
        } else if (sceltaProdotto.equalsIgnoreCase("Cuffie")) {
            
          
            prodotto = new Cuffie("L67417YT", "Iphone 1", "Apple", 39, true, "Rosso", true);
        } else {
            System.out.println("Scelta non valida.");
        }
        
        
        
        System.out.println(prodotto);

        
		
		 
		
		
		
		
		
		//Televisore televisore1 = new Televisore("CDF64367", "Galaxy", "samsung", 299,true, 20, 20, true);
		//Smartphone smartphone1 = new Smartphone("GHJ48167", "Mate", "Huawei", 699,false, "cod imei: 23423 DD FGH", 32);
		//Cuffie cuffia1 = new Cuffie("L67417YT", "Iphone 1", "Apple", 39, true, "Rosso", true);
		
		
		
		 
		
		
		

	}

}
