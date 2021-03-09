package nevek;

import java.util.Scanner;


public class Nevek {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int meret;

		do {
			System.out.println("Adj meg sz�mot 1 �s 9 k�z�tt!");
			while (!input.hasNextInt()) {
				System.out.println("Ez nem egy 1 �s 10 k�ze es� eg�sz sz�m!");
				input.next();
			}
			meret = input.nextInt();
		} while (meret < 1 || meret > 10);

		String[] nevek = new String[meret];
		for (int i = 0; i < nevek.length; i++) {
			nevek[i] = input.next();
		}
		input.close();

		for (int i = 0; i < nevek.length; i++) {
			System.out.println(nevek[i]);

		}
		// Azonos nevek
		int db = 0;
		for (int i = 0; i < nevek.length; i++) {
			for (int j = i + 1; j < nevek.length; j++) {
				if (nevek[i].equals(nevek[j])) {
					System.out.println("Azonosak: " + nevek[i] + " " + nevek[j]);
					db++;
				}
			}
		}
		System.out.println(db + " darab azonos nev� van.");
		
		
		// Azonos kezdobetusek
				int db2 = 0;
				for (int i = 0; i < nevek.length; i++) {
					for (int j = i + 1; j < nevek.length; j++) {
						if (nevek[i].charAt(0) == nevek[j].charAt(0)){
							System.out.println("Azonos kezd�bet�sek: " + nevek[i] + " " + nevek[j]);
							db2++;
						}
					}
				}
				System.out.println(db + " darab azonos kezd�bet�s van.");
	}
}
