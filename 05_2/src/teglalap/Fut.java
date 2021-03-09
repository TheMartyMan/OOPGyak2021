package teglalap;

import java.util.Scanner;

public class Fut {

	public static void main(String[] args) {
		Teglalap teglalapTomb[] = new Teglalap[10];

		feltolt(teglalapTomb);
		kiir(teglalapTomb);
		System.out.println("A legkisebb ter�let� t�glalap adatai " + legkisebbTerulet(teglalapTomb));

		Teglalap uj;
		Scanner sc = new Scanner(System.in);

		System.out.println("�j t�glalap!");
		System.out.println("K�rem az a oldalt: ");
		int a = sc.nextInt();
		System.out.println("K�rem a b oldalt: ");
		int b = sc.nextInt();
		uj = new Teglalap(a, b);
		System.out.println(uj);

		sc.close();
		System.out.println(
				"A " + uj.getTerulet() + " nagyobb ter�let� t�glalapok sz�ma: " + getTeruletNagyobb(uj, teglalapTomb));

		getVanEgyezoSzoveg(teglalapTomb, uj);

		System.out.println(getVanEgyezoSzoveg(teglalapTomb, uj));

	}

	private static String getVanEgyezoSzoveg(Teglalap[] teglalapTomb, Teglalap uj) {
		if (keresEgyezoAdatok(teglalapTomb, uj) != -1) {
			return "Az egyez� adatokkal rendelkez� t�glalap indexe: " + keresEgyezoAdatok(teglalapTomb, uj);
		} else {
			return "Nincs egyez�!";

		}
	}

	public static void feltolt(Teglalap[] teglalapTomb) {
		for (int i = 0; i < teglalapTomb.length; i++) {
			teglalapTomb[i] = new Teglalap((int) (Math.random() * 8 + 2), (int) (Math.random() * 8 + 2));
		}
	}

	public static void kiir(Teglalap[] teglalapTomb) {
		for (int i = 0; i < teglalapTomb.length; i++) {
			System.out.println(teglalapTomb[i]);
		}
	}

	private static Teglalap legkisebbTerulet(Teglalap[] teglalapTomb) {
		Teglalap min = teglalapTomb[0];

		for (Teglalap teglalap : teglalapTomb) {
			if (teglalap.getTerulet() < min.getTerulet()) {
				min = teglalap;
			}
		}

		return min;
	}

	public static int getTeruletNagyobb(Teglalap t, Teglalap[] tomb) {
		int db = 0;

		for (Teglalap teglalap : tomb) {
			if (teglalap.getTerulet() > t.getTerulet())
				db++;
		}

		return db;

	}

	public static int keresEgyezoAdatok(Teglalap[] tomb, Teglalap t) {
		int index = -1;

		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i].getOldalakEgyeznek(t)) {
				index = i;
			}
		}

		return index;

	}

}