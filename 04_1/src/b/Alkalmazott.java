package b;

public class Alkalmazott {

	private String nev;
	private int fizetes;

	public void fizetesNovel(int ertek) {
		this.fizetes += ertek;
	}

	public String getAdatok() {
		return "Nev: " + this.nev + "\nFizetes: " + this.fizetes;
	}
	
	public void setNev(String nev)
	{
		this.nev=nev;
	}
	
	public void setFizetes(int fizetes)
	{
		this.fizetes=fizetes;
	}
	
	public String getNev()
	{
		return nev;
	}
	
	public int getFizetes()
	{
		return fizetes;
	}
}
