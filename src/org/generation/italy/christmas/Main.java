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
		String continuare = "";
		
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
		
		Collections.sort(desideri);
		Iterator<String> iterator = desideri.iterator();
		
		System.out.println("\n\nEcco la lista dei tuoi desideri completa: \n");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		scan.close();

	}

}
