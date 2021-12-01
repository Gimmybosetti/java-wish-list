package org.generation.italy.christmas;

import java.util.Iterator;
import java.util.List;

public class LetteraBabboNatale {
	
	//attributi
	private String nome;
	private String indirizzo;
	private List<String> listaDesideri;
	
	public LetteraBabboNatale (String nome, String indirizzo, List<String> listaDesideri) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.listaDesideri = listaDesideri;
	}
	
	//getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public List<String> getListaDesideri() {
		return listaDesideri;
	}

	public void setListaDesideri(List<String> listaDesideri) {
		this.listaDesideri = listaDesideri;
	}

	//metodi
	public String invia(String nome, String indirizzo, List<String> listaDesideri) throws Exception {
		String inviata = "Ben fatto! Eccoti un recap:\nNome: " + nome + "\nIndirizzo: " + indirizzo + "\nDesideri:\n" + listaFormattata(listaDesideri);
		if (listaDesideri.size() > 5) {
			throw new Exception("Mi spiace, ma le liste con oltre 5 desideri non vanno bene!");
		}else {
			return inviata;
		}
	}
	
	public String listaFormattata (List<String> listaDesideri) {
		String listaFormattata = "";
		Iterator<String> iterator = listaDesideri.iterator();
		while(iterator.hasNext()) {
			listaFormattata += iterator.next() + "\n";
		}
		return listaFormattata;
	}
}
