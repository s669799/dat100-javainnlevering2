package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO A
		
		int i = 0;
		int tall = 0;
		String tallTxt = "Tabell: " ;
		
		for (i = 0; i < tabell.length; i++) {
			tall = tabell[i];
			tallTxt += tall + " ";	
		}	
		System.out.println(tallTxt);	
		
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO pølse
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		int i = 0;
		
		while (!finnes && i < tabell.length) {
			if (tabell[i] == tall) {
				finnes = true;
			}
			
			i++;
			
		}
		System.out.println(finnes);
		return finnes;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
