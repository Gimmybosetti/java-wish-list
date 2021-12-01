package org.generation.italy.christmas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> desideri = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		boolean fermarsi = false;
		String continuare = "", nome = "", indirizzo = "";
		
		System.out.println("Come ti chiami?");
		nome = scan.nextLine();
		System.out.println("A che indirizzo dovremo spedire i regali?");
		indirizzo = scan.nextLine();
		
		while(!fermarsi) {
			System.out.println("Inserisci un nuovo desiderio:");
			desideri.add(scan.nextLine());
			if(desideri.size() == 1) {
				System.out.println("Ora la lista contiene " + desideri.size() + " desiderio");
			}else {
				System.out.println("Ora la lista contiene " + desideri.size() + " desideri");
			}
			System.out.println("Vuoi inserire un altro desiderio? (si/no)");
			continuare = scan.nextLine();
			if(continuare.equalsIgnoreCase("no")) {
				fermarsi = true;
			}
		}
		
		LetteraBabboNatale lettera = new LetteraBabboNatale(nome, indirizzo, desideri);
		
		System.out.println("Vuoi inviare la tua lista a Babbo Natale? (si/no)");
		continuare = scan.nextLine();
		
		if(continuare.equalsIgnoreCase("si")) {
			try {
				System.out.print(lettera.invia(nome, indirizzo, desideri));
			}catch(Exception e) {
				System.out.println("Mi spiace, le lettere con più di 5 desideri non vanno bene!");
			}
		}
		
		System.out.print("\n-------------------------------------------------------");  //divisore per stampa lista
		
		
		//consegna iniziale
		Collections.sort(desideri);
		Iterator<String> iterator = desideri.iterator();
		
		System.out.println("\n\nEcco la lista dei tuoi desideri completa: \n");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		scan.close();

	}

}
