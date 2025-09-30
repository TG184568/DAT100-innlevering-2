package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
            for (int verdi : rad) {
                System.out.println(verdi + " ");
            }
            System.out.println();
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {
        StringBuilder sb = new StringBuilder();
        for (int[] rad : matrise) {
            for (int verdi : rad) {
                sb.append(verdi).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int r = matrise.length;
        int k = matrise[0].length;
        int[][] ny = new int[r][k];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < k; j++) {
                ny[i][j] = matrise[i][j] * tall;
            }
        }
        return ny;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++)  {
            if (a[i].length != b[i].length) return false;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
        int r = matrise.length;
        int k = matrise[0].length;
        int[][] transponert = new int[r][k];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < k; j++) {
                transponert[i][j] = matrise[i][j];
            }
        }
        return transponert;
    }

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
        int rA = a.length;
        int kA = a[0].length;
        int rB = b.length;
        int kB = b[0].length;

        if (kA != rB) {
            throw new IllegalArgumentException("Ikke mulig å multiplisere. Antall kolonner i A må være lik antall rader i B.");
        };

        int[][] c = new int[rA][kB];

        for (int i = 0; i < rA; i++) {
            for (int j = 0; j < kB; j++) {
                int sum = 0;
                for (int t = 0; t < kA; t++) {
                    sum += a[i][t] * b[t][j];
                }
                c[i][j] = sum;
            }
        }
        return c;
	}

}
