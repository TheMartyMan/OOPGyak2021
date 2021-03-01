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
			return "ez a személy sovány.";

		} else if (tti > 25) {
			return "ez a személy kövér.";

		} else {
			return "ez a személy normális.";

		}
	}

	public String Adatok() {
		double tti = suly / (magassag * magassag);
		return "Név: " + nev + "\nSúly: " + suly + "\nMagasság: " + magassag + "\nTTI: "+ tti + "\nA TTI alapján " + meres();
	}
}
