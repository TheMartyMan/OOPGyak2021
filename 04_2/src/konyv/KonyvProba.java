package konyv;

public class KonyvProba {

	public static void main(String[] args) {
		Konyv k1 = new Konyv();
		k1.setAr(1200);
		k1.setCim("Nemtudom");
		k1.setEv(2020);
		k1.setSzerzo("Én");

		System.out.println(k1.toString());
	}

}
