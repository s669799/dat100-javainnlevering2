package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		// TODO Mateusz
		throw new UnsupportedOperationException("skrivUt ikke implementert");
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

		// TODO Mateusz
		throw new UnsupportedOperationException("erLik ikke implementert");
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO Severin
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO Dag Åsmund
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
