package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO A
		
		int i = 0;
		int tall = 0;
		String tallTxt = "Tabell: ";

		for (i = 0; i < tabell.length; i++) {
			tall = tabell[i];
			tallTxt += tall + " ";	
		}	
		System.out.println(tallTxt);
			tallTxt += tall + " ";
		}
		

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO Dag Åsmund
		String s = "";
		
		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			if (i < tabell.length - 1) {
				System.out.print(tabell[i] + ",");
			}
			else {
				System.out.print(tabell[i] + "]");
			} 
		} return s;
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO Severin
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

		// TODO Dag Åsmund
		boolean funnet = false;
		int i = 0;
		
		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall)
				funnet = true;
			else
				i++;
		} System.out.print(tabell[i]);
		return tabell[i];

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO Severin
		boolean sortert = true;
		int i = 0;
		
		while (sortert && i < tabell.length - 1) {
			if (tabell[i] <= tabell[i+1]) {
				i++;		
			} else {
				sortert = false;
			}			
		}
		
		System.out.println(sortert);
		return sortert;
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO Dag Åsmund
		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTab = new int[nyLengde];
		for (int i = 0; i < tabell1.length; i++) {
			nyTab[i] = tabell1[i];
		}
		for (int j = 0; j < tabell2.length; j++) {
			nyTab[tabell1.length + j] = tabell2[j];
		}
		return nyTab;
	}
}
