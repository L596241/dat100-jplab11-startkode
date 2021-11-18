package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Bilde;

public class Blogg {

	private Innlegg[] innleggstabell;
	private int nesteledig;

	public Blogg() {
		innleggstabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		for (int i=0; i < nesteledig; i++) {
			if (innleggstabell[i].erLik(innlegg)) {
				return i;
			}
		}
		
		return -1;
		
	}

	public boolean finnes(Innlegg innlegg) {
		if(finnInnlegg(innlegg) >= 0) {
			return true;
		}
		
		return false;
	}

	public boolean ledigPlass() {
		
		for(int i=0; i < innleggstabell.length; i++) {
			if (innleggstabell[i] == null) {
				return true;
			}
		}
		return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		if (ledigPlass() && !finnes(innlegg)) {
			innleggstabell[nesteledig] = innlegg;
			nesteledig ++;
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		/*
		svar = getAntall() + "\n" + innleggstabell[0].toString() + innleggstabell[1].toString();
	   */
		String svar= "" + getAntall() + "\n";
		
		for (int i=0; i < nesteledig; i++) {
			svar += innleggstabell[i].toString();
			
		}
		
		
	    return svar;
	    
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg [] innleggstabell1 = new Innlegg [innleggstabell.length*2];
		
		for (int i=0; i < innleggstabell.length; i++) {
			innleggstabell1[i] = innleggstabell[i];
		}
		
		innleggstabell = innleggstabell1;
		
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
			if(!ledigPlass()) {
				utvid();
			} 
			
			if(!finnes(innlegg)) {
				innleggstabell[nesteledig] = innlegg; //ellers bruke leggTil();
				nesteledig ++;
				return true;
			}
			
		return false;
	}
	
	public boolean slett(Innlegg innlegg) {
		int pos = finnInnlegg(innlegg);
		if (pos >= 0) {
			nesteledig --;
			innleggstabell[pos] = innleggstabell[nesteledig];
			innleggstabell[nesteledig] = null;
			return true;
		}
		return false;
	}
	
	public int[] search(String keyword) {
		
		int[] idTab = new int [innleggstabell.length];
		
		for(int i=0; i < innleggstabell.length; i++) {
			if (innleggstabell[i].toString().contains(keyword)) {
				idTab[i] = innleggstabell[i].getId();
				
			}
			
		}
		return idTab;
	}
}