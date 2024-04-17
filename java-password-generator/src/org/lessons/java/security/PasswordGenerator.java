package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il tuo nome: ");
		String nome = input.nextLine();
		System.out.print("Inserisci il tuo cognome: ");
		String cognome = input.nextLine();
		System.out.print("Inserisci il tuo colore preferito: ");
		String colore = input.nextLine();
		System.out.println("Inserisci la tua data di nascita");
		System.out.print("Inserisci il giorno in cui sei nato: ");
		int giorno = input.nextInt();
		System.out.print("Inserisci il mese in cui sei nato: ");
		int mese = input.nextInt();
		System.out.println("Inserisci l'anno in cui sei nato: ");
		int anno = input.nextInt();
		int somma = giorno + mese + anno;
		System.out.println("La data di nascita sommata è: " + somma );
		String password = nome + "-" + cognome + "-" + colore + "-" + somma;
		System.out.println("La tua nuova password è: " + password);	
	}

}
