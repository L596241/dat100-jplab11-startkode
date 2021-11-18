package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id, bruker, dato);
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes);
		this.tekst = tekst;
	}
	
	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		String s;
		
		
		s = "TEKST\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n";
		
		return s;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		String s;
		s = 
		"\t\t<h2>" + getBruker() + "@" + getDato() + " [" + getLikes() + "]" + "<h2>\n" +
		"\t\t<p>" + tekst + "<p>\n" +
		"\t\t<hr>\n";
		
		return s;				
	}
}