package org.java.shop;

public class Carrello {

	public static void main(String[] args) {
		
		
		Televisore televisore1 = new Televisore("CDF64367", "Galaxy", "samsung", 299, 20, 20, true);
		Televisore televisore2 = new Televisore("GHJ48167", "Note", "LG", 499, 10, 20, false);
		
		Smartphone smartphone1 = new Smartphone("GHJ48167", "Mate", "Huawei", 699, "cod imei: 23423 DD FGH", 32);
		Smartphone smartphone2 = new Smartphone("LYT41767", "Iphone 12", "Apple", 999, "cod imei: 94817 CC LOP", 64);
		
		
		Cuffie cuffia1 = new Cuffie("L67417YT", "Iphone 1", "Apple", 39, "cod imei: 17948 CO PCL", true);
		Cuffie cuffia2 = new Cuffie("YTL76741", "Iphone 2", "Apple", 59, "cod imei: 81794 CC PLO", false);
		
		
		
		
		
		
		
		
		
		
		System.out.println("");
		System.out.println("--------------TELEVISORI------------");
		System.out.println(televisore1);
		System.out.println(televisore2);
		System.out.println("");
		System.out.println("--------------SMARTPHONE------------");
		System.out.println(smartphone1);
		System.out.println(smartphone2);
		System.out.println("");
		System.out.println("--------------CUFFIE------------");
		System.out.println(cuffia1);
		System.out.println(cuffia2);
		
		
		
		

	}

}
