package relprim;

import java.util.*;

public class Prim {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int szam;

		do {
			System.out.println("Adj meg a szamot 1 es 10 kozott!");
			while (!input.hasNextInt()) {
				System.out.println("Ez nem egy 1 es 10 koze eso egesz szam!");
				input.next();
			}
			szam = input.nextInt();
		} while (szam < 1 || szam > 10);
		input.close();

		// System.out.println("A szam = " + szam);

		int db = 0;
		for (int i = 10, j = i + 1; db < szam; i++, j++) {
			if (rel_prim(i, j)) {
				db++;
				System.out.println("Relativ primek " + i + " " + j);
			}

		}

		System.out.println(db + " darab relativ prim van.");

	}

	public static boolean rel_prim(int a, int b) {
		if (lnko(a, b) == 1)
			return true;
		return false;
	}

	public static int lnko(int a, int b) {

		while (b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
}