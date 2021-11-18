package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	int id;
	String bruker;
	String dato;
	int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker;
	}

	public String getDato() {
		
		return dato;
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	}

	public int getId() {
		
		return id;

	}

	public int getLikes() {
		
		return likes;

	}
	
	public void doLike () {
		
		likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		int ID = innlegg.getId();
		if (id == ID){
		return true;
		}
		else {
			return false;
		}

	}
	
	@Override
	public String toString() {
		
		String str;
		str = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		return str;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		return "<h2>" + bruker + "@" + dato + "</h2>";
				
	}
}
