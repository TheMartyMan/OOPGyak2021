package c;

public class AlkFut {

	public static void main(String[] args) {
		Alkalmazott alk = new Alkalmazott();
		
		alk.setNev("tomi");
		alk.setFizetes(-1);
		
		System.out.println(alk.getAdatok());
		
		alk.fizetesNovel(3401);
		
		System.out.println(alk.getAdatok());
		
		System.out.println(alk.getFizHatarok(1000, 2000));
		System.out.println("Az ado erteke: " + alk.getAdo());
		
		Alkalmazott masik = new Alkalmazott();
		
		masik.setNev("andi");
		masik.setFizetes(1500);
		
		System.out.println(masik.getAdatok());
		
		if(alk.getAlkFizNagyobb(masik))
		{
			System.out.println(alk.getAdatok() + " fizetese a nagyobb");
		}
		else
		{
			System.out.println(masik.getAdatok() + " fiezetese a nagyobb");
		}

	}

}
