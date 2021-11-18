package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		String s;
		
		s = "BILDE\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n"
				+ getUrl() + "\n";
		
		return s;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		String s;
		s = 
		"\t\t<h2>" + getBruker() + "@" + getDato() + " [" + getLikes() + "]" + "<h2>\n" +
		"\t\t<p>" + super.getTekst() + "<p>\n" + 
		"\t\t<iframe src=" + getUrl() + " height=600 width=800></iframe><hr>\n";	
		
		return s;			
	}
}