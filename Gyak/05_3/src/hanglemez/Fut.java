package hanglemez;


import java.util.Scanner;

public class Fut {

	public static void main(String[] args) {
		Hanglemez[] h = new Hanglemez[3];
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < h.length; i++) {
			System.out.println("K�rem az " + i+1 + ". " + "hanglemez el�ad�j�t: ");
			String eloado = sc.next();
			System.out.println("K�rem az " + i+1 + ". " + "hanglemez c�m�t: ");
			String cim = sc.next();
			System.out.println("K�rem az " + i+1 + ". " + "hanglemez hossz�t: ");
			int hossz = sc.nextInt();
			
			h[i]= new Hanglemez(eloado,cim,hossz);
		}
			sc.close();

			for(Hanglemez hanglemez : h) {
				System.out.println(hanglemez.toString());
			}
				
				
				
		

	}

}
