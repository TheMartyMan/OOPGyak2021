package kalkulator;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char valasz = ' ';

		do {
//			int a = readInt();
//			System.out.println("Kerem a muveleti jelet: ");
//			char op = input.next().charAt(0);
//			int b = readInt();
			
			
			System.out.println("Kerem a muveletet:");
			String in = input.nextLine();
			String[] tomb = in.split(" ");
			
			int a = Integer.parseInt(tomb[0]);
			char op = tomb[1].charAt(0);
			int b = Integer.parseInt(tomb[2]);
			
			
			
			
			
			double c = 0.0;
			boolean ok = true;

			switch (op) {
			case '+':
				c = a + b;
				break;
				
			case '-':
				c = a - b;
				break;
			case '*':
				c = a * b;
				break;
				
			case '/':
				if (b != 0) {
					c = (double) a / b;
					break;
					
				} else {
					System.out.println("0-val nem lehet osztani!");
					ok = false;
					break;
					
				}

			}

			if (ok)
				System.out.println("Eredmeny: " + a + " " + op + " " + b + "=" + c);

			System.out.println("Akarod folytatni?");
			valasz = input.next().charAt(0);

		} while (valasz == 'y' || valasz == 'Y' || valasz == 'i' || valasz == 'I');

	}

	public static int readInt() {
		Scanner input = new Scanner(System.in);
		int szam;

		do {
			System.out.println("Adj meg szamot!");
			while (!input.hasNextInt()) {
				System.out.println("Ez nem egy szam!");
				input.next();
			}
			szam = input.nextInt();
			
		}
	}
}