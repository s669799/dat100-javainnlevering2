package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
<<<<<<< HEAD
		
=======

		// TODO A

>>>>>>> branch 'master' of https://github.com/s669799/dat100-javainnlevering2.git
		int i = 0;
		int tall = 0;
		String tallTxt = "Tabell: ";

		for (i = 0; i < tabell.length; i++) {
			tall = tabell[i];
<<<<<<< HEAD
			tallTxt += tall + " ";	
		}	
		System.out.println(tallTxt);
		
=======
			tallTxt += tall + " ";
>>>>>>> branch 'master' of https://github.com/s669799/dat100-javainnlevering2.git
		}
<<<<<<< HEAD
		
=======
		System.out.println(tallTxt);

	}
>>>>>>> branch 'master' of https://github.com/s669799/dat100-javainnlevering2.git

	// b)
	public static String tilStreng(int[] tabell) {

<<<<<<< HEAD
		
=======
		// TODO Dag Åsmund
>>>>>>> branch 'master' of https://github.com/s669799/dat100-javainnlevering2.git
		System.out.println();
		String s = "[" + tabell[0];
<<<<<<< HEAD
		
=======

>>>>>>> branch 'master' of https://github.com/s669799/dat100-javainnlevering2.git
		for (int i = 1; i < tabell.length; i++) {
			s += ", " + tabell[i];

		}
		s += "]" + "\n";
		System.out.print(s);
		return s;
<<<<<<< HEAD
		}
		
	
=======
	}
>>>>>>> branch 'master' of https://github.com/s669799/dat100-javainnlevering2.git

	// c)
	public static int summer(int[] tabell) {
<<<<<<< HEAD

=======
		// TODO Mateusz
>>>>>>> branch 'master' of https://github.com/s669799/dat100-javainnlevering2.git
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			int b = tabell[i];
			sum += b;
		}
		System.out.println(sum);

		int i = 0;
		sum = 0;
		while (i < tabell.length) {
			int b = tabell[i];
			sum += b;
			i++;
		}
		System.out.println(sum);

		sum = 0;
		for (int k : tabell) {
			sum += k;
		}
		System.out.println(sum);
		return sum;
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

		System.out.println("Finnes: " + finnes);
		return finnes;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		
		int pos = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall)
				pos = i;
		}
		System.out.print("Posisjon: " + pos);
		System.out.println();
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] nytabell = new int[tabell.length];
		int j = tabell.length;
		for (int i = 0; i < tabell.length; i++) {
			nytabell[j - 1] = tabell[i];
			j--;
		}
		for (int i = 0; i < nytabell.length; i++)
			System.out.print(nytabell[i] + " ");

		return nytabell;

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		int i = 0;

		while (sortert && i < tabell.length - 1) {
			if (tabell[i] <= tabell[i + 1]) {
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
