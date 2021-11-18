package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		int id, likes;
		String bruker, dato, tekst, url, type;
		
		try {
		FileReader file = new FileReader(mappe + filnavn);
		BufferedReader reader = new BufferedReader(file);
		
		int antallinn = Integer.parseInt(reader.readLine());
		
		Blogg blogg = new Blogg (antallinn);
		
		for (int i=0; i < antallinn; i++) {
			
				type = reader.readLine();
				id = Integer.parseInt(reader.readLine());
				bruker = reader.readLine();
				dato = reader.readLine();
				likes = Integer.parseInt(reader.readLine());
				tekst = reader.readLine();
				
				if (type.equals(BILDE)) {
					url = reader.readLine();
					Bilde a = new Bilde (id, bruker, dato, likes, tekst, url);
					blogg.leggTil(a);
				}
				else {
					Tekst b = new Tekst (id, bruker, dato, likes, tekst);
					blogg.leggTil(b);
				}
			
		}
		reader.close();
		return blogg;
		
		
		}
		catch (FileNotFoundException e){
		}
		catch (IOException e){
		}
		
		return null;
		
	}
}