package hazi_1;

public class TTI {

	private String nev;
	private int suly;
	private double magassag;
	
	public void setNev(String nev)
	{
		this.nev=nev;
	}
	
	public void setSuly(int suly)
	{
		this.suly=suly;
	}
	
	public void setMagassag(double magassag)
	{
		this.magassag=magassag;
	}

 
	
	
	public String meres() {
		double tti = suly / (magassag * magassag);
		if (tti < 18.5) {
			return "ez a szem�ly sov�ny.";

		} else if (tti > 25) {
			return "ez a szem�ly k�v�r.";

		} else {
			return "ez a szem�ly norm�lis.";

		}
	}

	public String Adatok() {
		double tti = suly / (magassag * magassag);
		return "N�v: " + nev + "\nS�ly: " + suly + "\nMagass�g: " + magassag + "\nTTI: "+ tti + "\nA TTI alapj�n " + meres();
	}
}
