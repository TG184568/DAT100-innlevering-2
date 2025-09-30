package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
        System.out.println(tilStreng(tabell));
	}

	// b)
	public static String tilStreng(int[] tabell) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tabell.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(tabell[i]);
        }
        sb.append("]");
        return sb.toString();
	}

	// c)
	public static int summer(int[] tabell) {
        int sum = 0;
        for (int t : tabell) {
            sum += t;
        }
        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
        for (int t : tabell) {
            if (t == tall) return true;
        }
        return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) return i;
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
        int n = tabell.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = tabell[n - 1 - i];
        }
        return rev;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] <= tabell[i - 1]) {
                return false;
            }
        }
        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int n1 = tabell1.length;
        int n2 = tabell2.length;
        int[] res = new int[n1 + n2];

        for (int i = 0; i < n1; i++) res[i] = tabell1[i];
        for (int j = 0; j < n2; j++) res[n1 + j] = tabell2[j];

        return res;
	}
}
