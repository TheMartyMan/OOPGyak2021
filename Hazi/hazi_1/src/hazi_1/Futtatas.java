package hazi_1;

import java.util.Scanner;

public class Futtatas {

	public static void main(String[] args) {
	
		TTI Nber = new TTI();

        Scanner input = new Scanner(System.in);

        System.out.println("Adja meg a személy nevét, súlyát és a magasságát!");
        String inString = input.nextLine();
        String[] strArray = inString.split(" ");
        
        Nber.setNev(strArray[0]);
        Nber.setSuly(Integer.parseInt(strArray[1]));
        Nber.setMagassag(Double.parseDouble(strArray[2]));

        input.close();

        System.out.println(Nber.Adatok());

	}

}
