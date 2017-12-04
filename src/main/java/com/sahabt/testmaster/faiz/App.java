package com.sahabt.testmaster.faiz;

import java.util.Scanner;

//Sinan Arkan tarafından 04/11/2017 tarihinde yazılmıştır.

//Kullanılan faiz verileri https://www.fibabanka.com.tr/bireysel/faiz-ucret-ve-komisyonlar/faiz-oranlari/mevduat-faiz-oranlari.aspx
//sitesinden alınmıştır.

//Uygulamada 1 yıl altı tüm işlemler basit faiz, 1 yıl üzeri tüm işlemler bileşik faiz kullanılarak hesaplanmıştır.

public class App 
{
    public static void main(String[] args)
    {
        System.out.println("Faiz hesaplama programına hoş geldiniz!");
        program();
        
    }    
   
    public static void program()
   
    {
    	System.out.println(" Mevduat Faiz işlemleri için: \"1\"\n Bireysel Kredi Faiz işlemleri için: \"2\"\n programdan çıkmak için \"cikis\" yazabilirsiniz!");
    	Scanner titleInput = new Scanner (System.in);
	String title = titleInput.nextLine();
	
	if (new String(title).equals("1")) {
		System.out.println("Mevduat Faiz işlemleri'ni seçtiniz!");
		System.out.println(" Türk Lirası ile işlem yapmak için: \"1\"\n Dolar ile işlem yapmak için: \"2\"\n Euro ile işlem yapmak için: \"3\" yazabilirsiniz!");
		String pr = titleInput.nextLine();
		
		if (new String(pr).equals("1")) {
			System.out.println("Türk Lirası'nı seçtiniz!");
			TL();
			}
		
		else if (new String(pr).equals("2")) {
			System.out.println("Dolar'ı seçtiniz!");
			Dollar ();
			}
		
		else if (new String(pr).equals("3")) {
			System.out.println("Euro'yu seçtiniz!");
			Euro();
		}
		
		else {
			System.out.println("Hatalı bir giriş yaptınız!");
			program();
			
		}
		
	}
		
	else if (new String(title).equals("2")) {
		System.out.println("Bireysel Kredi Faiz işlemleri'ni seçtiniz!");
		System.out.println(" İhtiyaç Kredisi için: \"1\"\n Taşıt kredisi için: \"2\"\n Konut Kredisi için: \"3\" yazabilirsiniz!");
String pr = titleInput.nextLine();
		
		if (new String(pr).equals("1")) {
			System.out.println("İhtiyaç Kredisi'ni seçtiniz!");
			İhtiyac();
			}
		
		else if (new String(pr).equals("2")) {
			System.out.println("Taşıt kredisi'ni seçtiniz!");
			Tasit();
			}
		
		else if (new String(pr).equals("3")) {
			System.out.println("Konut Kredisi'ni seçtiniz!");
			Konut();
		}
		
		else {
			System.out.println("Hatalı bir giriş yaptınız!");
			program();
			
		}
    
	}
	else if (new String(title).equals("cikis")) {
		return;
		
    }
	
	else {
		System.out.println("Hatalı bir giriş yaptınız!");
		program();
		
	}
	
    }
    	
    public static void TL ()
    {
    		System.out.println(" Lütfen yatırmak istediğiniz tutarı giriniz: ");
    		
    		try {
       	Scanner titleInput = new Scanner (System.in);
		String ap1 = titleInput.nextLine();
		float anaPara = Float.parseFloat(ap1);
	
		
		if (anaPara < 1) {
			System.out.println("En az 1TL girmelisiniz! ");
    			TL();
		}
		
		else if (anaPara >= 1){
			
			System.out.println(" Lütfen vade süresini gün cinsinden giriniz: ");
			String vs = titleInput.nextLine();
			int vadeSuresi = Integer.parseInt(vs);
			double faiz;
			
			if (vadeSuresi < 1) {
				System.out.println("En az 1 gün girmelisiniz! ");
	    			TL();
			}
			else if (vadeSuresi >= 1 && vadeSuresi <= 7) {
				faiz= anaPara*(1+(vadeSuresi*0));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "TL'niz size " + vadeSuresi + " günde " + faiz + "TL şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi >= 8 && vadeSuresi <= 21) {
				faiz= anaPara*(1+(vadeSuresi*0.00375));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "TL'niz size " + vadeSuresi + " günde " + faiz + "TL şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi >= 22 && vadeSuresi <= 27) {
				faiz= anaPara*(1+(vadeSuresi*0.005));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "TL'niz size " + vadeSuresi + " günde " + faiz + "TL şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi >= 28 && vadeSuresi <= 31) {
				faiz= anaPara*(1+(vadeSuresi*0.00525));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "TL'niz size " + vadeSuresi + " günde " + faiz + "TL şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi >= 32 && vadeSuresi <= 365) {
				faiz= anaPara*(1+(vadeSuresi*0.006));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "TL'niz size " + vadeSuresi + " günde " + faiz + "TL şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi > 365) {
				//bileşik faiz uygulaması
				double a = (1 + 0.006);
				double bf = Math.pow(a, vadeSuresi);
				faiz= anaPara*bf;
				System.out.println("--Yatıracak olduğunuz " + anaPara + "TL'niz size " + vadeSuresi + " günde " + faiz + "TL şeklinde dönecektir.--\n");
				program();
			} 	
			
		}
	 	
   } 
    		catch (NumberFormatException e)
    		{    System.out.println("Hatalı bir giriş yaptınız!");
    			TL();
	}
    		
   
    }	
    
    public static void Dollar ()
    {
    		System.out.println(" Lütfen yatırmak istediğiniz tutarı giriniz: ");
    		
    		try {
       	Scanner titleInput = new Scanner (System.in);
		String ap1 = titleInput.nextLine();
		float anaPara = Float.parseFloat(ap1);
	
		
		if (anaPara < 1) {
			System.out.println("En az 1 $ girmelisiniz! ");
			Dollar();
		}
		
		else if (anaPara >= 1){
			
			System.out.println(" Lütfen vade süresini gün cinsinden giriniz: ");
			String vs = titleInput.nextLine();
			int vadeSuresi = Integer.parseInt(vs);
			double faiz;
			
			if (vadeSuresi < 1) {
				System.out.println("En az 1 gün girmelisiniz! ");
				Dollar();
			}
			else if (vadeSuresi >= 1 && vadeSuresi <= 7) {
				faiz= anaPara*(1+(vadeSuresi*0));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "$'ınız size " + vadeSuresi + " günde " + faiz + "$ şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi >= 8 && vadeSuresi <= 21) {
				faiz= anaPara*(1+(vadeSuresi*0.00005));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "$'ınız size " + vadeSuresi + " günde " + faiz + "$ şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi >= 22 && vadeSuresi <= 27) {
				faiz= anaPara*(1+(vadeSuresi*0.0002));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "$'ınız size " + vadeSuresi + " günde " + faiz + "$ şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi >= 28 && vadeSuresi <= 31) {
				faiz= anaPara*(1+(vadeSuresi*0.0004));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "$'ınız size " + vadeSuresi + " günde " + faiz + "$ şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi >= 32 && vadeSuresi <= 365) {
				faiz= anaPara*(1+(vadeSuresi*0.001));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "$'ınız size " + vadeSuresi + " günde " + faiz + "$ şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi > 365) {
				//bileşik faiz uygulaması
				double a = (1 + 0.001);
				double bf = Math.pow(a, vadeSuresi);
				faiz= anaPara*bf;
				System.out.println("--Yatıracak olduğunuz " + anaPara + "$'ınız size " + vadeSuresi + " günde " + faiz + "$ şeklinde dönecektir.-- \n");
				program();
			} 	
			
		}
	 	
   } 
    		catch (NumberFormatException e)
    		{    System.out.println("Hatalı bir giriş yaptınız!");
    			Dollar();
	}
    		
   
    }	

    public static void Euro ()
    {
    		System.out.println(" Lütfen yatırmak istediğiniz tutarı giriniz: ");
    		
    		try {
       	Scanner titleInput = new Scanner (System.in);
		String ap1 = titleInput.nextLine();
		float anaPara = Float.parseFloat(ap1);
	
		
		if (anaPara < 1) {
			System.out.println("En az 1 € girmelisiniz! ");
			Euro();
		}
		
		else if (anaPara >= 1){
			
			System.out.println(" Lütfen vade süresini gün cinsinden giriniz: ");
			String vs = titleInput.nextLine();
			int vadeSuresi = Integer.parseInt(vs);
			double faiz;
			
			if (vadeSuresi < 1) {
				System.out.println("En az 1 gün girmelisiniz! ");
				Euro();
			}
			else if (vadeSuresi >= 1 && vadeSuresi <= 7) {
				faiz= anaPara*(1+(vadeSuresi*0.00001));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "€'nuz size " + vadeSuresi + " günde " + faiz + "€ şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi >= 8 && vadeSuresi <= 21) {
				faiz= anaPara*(1+(vadeSuresi*0.00005));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "€'nuz size " + vadeSuresi + " günde " + faiz + "€ şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi >= 22 && vadeSuresi <= 27) {
				faiz= anaPara*(1+(vadeSuresi*0.0001));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "€'nuz size " + vadeSuresi + " günde " + faiz + "€ şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi >= 28 && vadeSuresi <= 31) {
				faiz= anaPara*(1+(vadeSuresi*0.00015));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "€'nuz size " + vadeSuresi + " günde " + faiz + "€ şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi >= 32 && vadeSuresi <= 365) {
				faiz= anaPara*(1+(vadeSuresi*0.0003));
				System.out.println("--Yatıracak olduğunuz " + anaPara + "€'nuz size " + vadeSuresi + " günde " + faiz + "€ şeklinde dönecektir.--\n");
				program();
			}
			else if (vadeSuresi > 365) {
				//bileşik faiz uygulaması
				double a = (1 + 0.0003);
				double bf = Math.pow(a, vadeSuresi);
				faiz= anaPara*bf;
				System.out.println("--Yatıracak olduğunuz " + anaPara + "€'nuz size " + vadeSuresi + " günde " + faiz + "€ şeklinde dönecektir.--\n");
				program();
			} 	
			
		}
	 	
   } 
    		catch (NumberFormatException e)
    		{    System.out.println("Hatalı bir giriş yaptınız!");
    			Euro();
	}
    		
   
    }	
    
    public static void İhtiyac()
    
    {
    System.out.println(" İhtiyaç kredisi 1000TL - 30.000TL aralığını kapsamaktadır!");
    	System.out.println(" Lütfen ihtiyacınız olan tutarı giriniz: ");
		try {
        Scanner titleInput = new Scanner (System.in);
    		String ap1 = titleInput.nextLine();
    		float anaPara = Float.parseFloat(ap1);
    		
    		if (anaPara < 1000){
			System.out.println("En az 1000TL kredi alabilirsiniz! ");
    			İhtiyac();
		}
    		else if (anaPara > 30000) {
    			System.out.println("İhtiyaç kredisinin üst limitini aştınız! ");
    			İhtiyac();
    		}
    		else {
    			System.out.println(" İhtiyaç kredisi 3 - 48 ay arasında ödenmek durumundadır!");
    			System.out.println(" Ödeme yapacağınız süreyi ay cinsinden giriniz:  ");
    			String vs = titleInput.nextLine();
    			int vadeSuresi = Integer.parseInt(vs);
    			double faiz;
    			
    			if (vadeSuresi < 3) {
    				System.out.println("En az 3 ay girmelisiniz! ");
    				İhtiyac();
    			}
    			
    			else if (vadeSuresi > 48) {
    				System.out.println("En fazla 48 ay girebilirsiniz! ");
    				İhtiyac();
    			}
    			else if (anaPara >= 1000 && anaPara <= 9999) {
    				
    				faiz= anaPara*(1+(vadeSuresi*0.00153));
    				System.out.println("--" + anaPara +"TL kredinizi "+vadeSuresi +" ay içinde " + faiz + "TL şeklinde ödemelisiniz.--\n");
    				program();
    			}
    			else {
    				faiz= anaPara*(1+(vadeSuresi*0.00149));
    				System.out.println("--" + anaPara +"TL kredinizi "+vadeSuresi +" ay içinde " + faiz + "TL şeklinde ödemelisiniz.--\n");
    				program();
    				
    				
    			}
    			
    		}
    }
		catch (NumberFormatException e)
		{    System.out.println("Hatalı bir giriş yaptınız!");
			İhtiyac();
}
    }

    public static void Tasit()
    
    {
    	System.out.println(" Lütfen ihtiyacınız olan tutarı giriniz: ");
		try {
        Scanner titleInput = new Scanner (System.in);
    		String ap1 = titleInput.nextLine();
    		float anaPara = Float.parseFloat(ap1);
    		
    		if (anaPara < 1){
			System.out.println("En az 1TL kredi alabilirsiniz! ");
    			Tasit();
		}
    	
    		else {
    			System.out.println(" Taşıt kredisi 3 - 48 ay arasında ödenmek durumundadır!");
    			System.out.println(" Ödeme yapacağınız süreyi ay cinsinden giriniz:  ");
    			String vs = titleInput.nextLine();
    			int vadeSuresi = Integer.parseInt(vs);
    			double faiz;
    			
    			if (vadeSuresi < 3) {
    				System.out.println("En az 3 ay girmelisiniz! ");
    				Tasit();
    			}
    			
    			else if (vadeSuresi > 48) {
    				System.out.println("En fazla 48 ay girebilirsiniz! ");
    				Tasit();
    			}
    			else if (vadeSuresi >= 3 && vadeSuresi <= 36) {
    				
    				faiz= anaPara*(1+(vadeSuresi*0.00133));
    				System.out.println("--" + anaPara +"TL kredinizi "+vadeSuresi +" ay içinde " + faiz + "TL şeklinde ödemelisiniz.--\n");
    				program();
    			}
    			else {
    				faiz= anaPara*(1+(vadeSuresi*0.00143));
    				System.out.println("--" + anaPara +"TL kredinizi "+vadeSuresi +" ay içinde " + faiz + "TL şeklinde ödemelisiniz.--\n");
    				program();
    			}
    			
    		}
    }
		catch (NumberFormatException e)
		{    System.out.println("Hatalı bir giriş yaptınız!");
			Tasit();
}
    }

    public static void Konut()
    
    {
    	System.out.println(" Lütfen ihtiyacınız olan tutarı giriniz: ");
		try {
        Scanner titleInput = new Scanner (System.in);
    		String ap1 = titleInput.nextLine();
    		float anaPara = Float.parseFloat(ap1);
    		
    		if (anaPara < 1){
			System.out.println("En az 1TL kredi alabilirsiniz! ");
    			Konut();
		}
    	
    		else {
    			System.out.println(" Konut kredisi 3 - 120 ay arasında ödenmek durumundadır!");
    			System.out.println(" Ödeme yapacağınız süreyi ay cinsinden giriniz:  ");
    			String vs = titleInput.nextLine();
    			int vadeSuresi = Integer.parseInt(vs);
    			double faiz;
    			
    			if (vadeSuresi < 3) {
    				System.out.println("En az 3 ay girmelisiniz! ");
    				Konut();
    			}
    			
    			else if (vadeSuresi > 120) {
    				System.out.println("En fazla 120 ay girebilirsiniz! ");
    				Konut();
    			}
    			else if (vadeSuresi >= 3 && vadeSuresi <= 60) {
    				
    				faiz= anaPara*(1+(vadeSuresi*0.00125));
    				System.out.println("--" + anaPara +"TL kredinizi "+vadeSuresi +" ay içinde " + faiz + "TL şeklinde ödemelisiniz.--\n");
    				program();
    			}
    			else {
    				faiz= anaPara*(1+(vadeSuresi*0.00131));
    				System.out.println("--" + anaPara +"TL kredinizi "+vadeSuresi +" ay içinde " + faiz + "TL şeklinde ödemelisiniz.--\n");
    				program();
    			}
    			
    		}
    }
		catch (NumberFormatException e)
		{    System.out.println("Hatalı bir giriş yaptınız!");
			Konut();
}
    }
    
}
    

