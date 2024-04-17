package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci il tuo nome");
		String nome = input.nextLine();
		System.out.println("inserisci il tuo cognome");
		String cognome = input.nextLine();
		System.out.println("inserisci il tuo colore preferito");
		String colore = input.nextLine();
		System.out.println("inserisci la tua data di nascita");
		System.out.println("inserisci il giorno in cui sei nato");
		int giorno = input.nextInt();
		System.out.println("inserisci il mese in cui sei nato");
		int mese = input.nextInt();
		System.out.println("inserisci l'anno in cui sei nato");
		int anno = input.nextInt();
		int somma = giorno + mese + anno;
		System.out.println("la data di nascita sommata è: " + somma );
		String password = nome + "-" + cognome + "-" + colore + "-" + somma;
		System.out.println("la tua nuova password è: " + password);
		
		
				
		
	}

}
