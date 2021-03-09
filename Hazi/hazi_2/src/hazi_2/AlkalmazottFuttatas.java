package hazi_2;

public class AlkalmazottFuttatas {

	public static void main(String[] args) {
		Alkalmazott[] alkTomb = new Alkalmazott[5];
		
		feltolt(alkTomb);
		kiir(alkTomb);
		Alkalmazott maxFiz = getLegmagasabbFiz(alkTomb);
		System.out.println("A legnagyobb fizetesu alkalmazott " + maxFiz.getAdatok());
		System.out.println("240-280 koze eso fizetesuek szama: " + getAlkDbFizIntervallum(alkTomb, 230, 280));
		System.out.println("Atlag " + getAtlag(alkTomb));
		System.out.println("Ado " + getAdo(alkTomb));

	}
	
	private static void feltolt(Alkalmazott[] alkTomb)
	{
		for(int i=0; i< alkTomb.length; i++)
		{
			alkTomb[i]= new Alkalmazott("Tomi", (int)(Math.random()*50+200));
		}
	}
	
	private static void kiir(Alkalmazott[] alkTomb)
	{
		for(int i=0; i< alkTomb.length; i++)
		{
			System.out.println(alkTomb[i].getAdatok());
		}
	}
	
	private static Alkalmazott getLegmagasabbFiz(Alkalmazott[] input)
	{
		Alkalmazott max = input[0];
		
		for(Alkalmazott alk : input)
		{
			if(alk.getFizetes()>max.getFizetes())
				max=alk;
		}
		
		return max;
	}
	
	private static int getAlkDbFizIntervallum(Alkalmazott[] input, int also, int felso)
	{
		int db=0;
		for(Alkalmazott alk : input)
		{
			if(alk.getFizHatarok(also,felso))
				db++;
		}
		
		return db;
	}
	
	private static double getAtlag(Alkalmazott[] input)
	{
		double sum=0;
		for(Alkalmazott alk : input)
		{
			sum+=alk.getFizetes();
		}
		
		return sum/input.length;
	}
	
	private static double getAdo(Alkalmazott[] input)
	{
		double sum=0;
		for(Alkalmazott alk : input)
		{
			sum+=alk.getAdo();
		}
		
		return sum;
	}
	

}
