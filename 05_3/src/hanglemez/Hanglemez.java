package hanglemez;

public class Hanglemez {
	private String eloado;
	private String cim;
	private int hossz;

	public Hanglemez(String eloado, String cim, int hossz) {
		this.eloado = eloado;
		this.cim = cim;
		this.hossz = hossz;

	}

	@Override
	public String toString() {
		return "Hanglemez elõadó: " + eloado + ", cím: " + cim + ", hossz: " + hossz;
	}

	public int getHosszabb(Hanglemez lemez) {
		if (this.hossz > lemez.hossz) {
			return 1;
		} else if (this.hossz < lemez.hossz) {
			return -1;
		}

		return 0;

	}

	public boolean getSzerzoEgyezik(String szerzo) {
		if (this.eloado.equals(szerzo))
			return true;

		return false;
	}

	public String getEloado() {
		return eloado;
	}

	public void setEloado(String eloado) {
		this.eloado = eloado;
	}

	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public int getHossz() {
		return hossz;
	}

	public void setHossz(int hossz) {
		this.hossz = hossz;
	}

}
