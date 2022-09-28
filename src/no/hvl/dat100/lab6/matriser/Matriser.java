package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		// TODO Mateusz
		for (int[] i : matrise) {
			for(int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO Severin
		String matTxt = "";

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matTxt += matrise[i][j];
				matTxt += " ";
			}
			matTxt += "\n";
		}
		System.out.print(matTxt);
		return matTxt;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		// TODO Dag Åsmund
		throw new UnsupportedOperationException("skaler ikke implementert");

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		//TODO Mateusz
		//check length
		for(int i = 0; i< a.length; i++) {
			 if(a.length == b.length) {
				 if(a[i].length == b[i].length) { 
				 }
				 else return false;
			 }
			 else return false;
		}
		//check content
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				if (a[i][k] == b[i][k]) {
				} 
				else{
					return false;
					}
				}
			}return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO Severin
		int[][] speilet = new int[matrise[0].length][matrise.length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				speilet[j][i] = matrise[i][j];
			}
		}

		tilStreng(speilet);

		return speilet;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO Dag Åsmund
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
