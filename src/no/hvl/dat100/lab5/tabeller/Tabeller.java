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
			
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO Dag Åsmund
		
		System.out.println("[" + tabell[0] + ", " + tabell[1] + ", " + tabell[2] + "]");
		
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {
		// TODO Mateusz 
		int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
			int b = tabell[i];
			sum += b;
		}
		System.out.println(sum);
		
		int i = 0;
		sum = 0;
		while(i < tabell.length) {
			int b = tabell[i];
			sum += b;
			i++;
		}
		System.out.println(sum);
		
		
		sum = 0;
		for(int k : tabell) {
			sum += k;
		}
		System.out.println(sum);
		return sum;
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
		
		System.out.println("Finnes: " + finnes);
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
		}
		return tall;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO Mateusz
		int[] nytabell = new int[tabell.length];
		int j = tabell.length;
		for(int i = 0; i< tabell.length; i++) {
			nytabell[j-1] = tabell[i];
			j--;
		}
		for(int i = 0; i< nytabell.length; i++)
			System.out.print(nytabell[i] + " ");
		
		return nytabell;
		
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
		
		System.out.println("Sortert: " + sortert);
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
