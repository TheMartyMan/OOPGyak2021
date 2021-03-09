package hazi_2_2;

public class Konyv {

	java.time.LocalDate currentDate = java.time.LocalDate.now();
	private String szerzo;
	private double ar;
	private int ev;
	private String cim;
	
	public String toString() {
		return "KÖNYV = Szerzõ: " + szerzo + ", Ár: " + ar + ", Év: " + ev + ", Cím: " + cim;
	}
	
	public Konyv(String szerzo, double ar, int ev, String cim) {
		this.szerzo = szerzo;
		this.ar = ar;
		this.ev = ev;
		this.cim = cim;
	}
	
	public Konyv(String szerzo,String cim) {
		this.szerzo = szerzo;
		ar = 5600;
		ev = currentDate.getYear(); ;
		this.cim = cim;
	}
	
	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}


	public String getSzerzo() {
		return szerzo;
	}


	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}


	public double getAr() {
		return ar;
	}


	public void setAr(double ar) {
		this.ar = ar;
	}


	public int getEv() {
		return ev;
	}


	public void setEv(int ev) {
		this.ev = ev;
	}

	public void setArNovel(double szazalek)
	{
		this.ar = this.ar + (ar*(szazalek/100));
	}
	
	
}
