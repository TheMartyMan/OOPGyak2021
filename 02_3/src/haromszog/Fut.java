package haromszog;

import java.util.Scanner;

public class Fut {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int szam;

		do {
			System.out.println("Adj meg a szamot 1 es 9 kozott!");
			while (!input.hasNextInt()) {
				System.out.println("Ez nem egy 1 es 10 koze eso egesz szam!");
				input.next();
			}
			szam = input.nextInt();
		} while (szam < 1 || szam > 9);
		input.close();

		System.out.println("A szam = " + szam);

		cimke: for (int i = 1; i <= szam; i++) {
			for (int j = 1; j <= szam; j++) {
				System.out.print(i);

				if (i == j) {
					System.out.println();
					continue cimke;
				}
			}
		}
	}
}
