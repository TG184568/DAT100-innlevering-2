package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {

        if (tabell == null) {
            System.out.println("null");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tabell.length; i++) {
            sb.append(tabell[i]);
            if (i < tabell.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        System.out.println(sb.toString());
    }

    // b)
    public static String tilStreng(int[] tabell) {

        if (tabell == null) {
            return "null";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tabell.length; i++) {
            sb.append(tabell[i]);
            if (i < tabell.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // c)
    public static int summer(int[] tabell) {

        int sum = 0;
        if (tabell != null) {
            for (int verdi : tabell) {
                sum += verdi;
            }
        }
        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {

        if (tabell == null) {
            return false;
        }

        for (int verdi : tabell) {
            if (verdi == tall) {
                return true;
            }
        }
        return false;
    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {

        if (tabell == null) {
            return -1;
        }

        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
    }

    // f)
    public static int[] reverser(int[] tabell) {

        if (tabell == null) {
            return null;
        }

        int[] reversert = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
            reversert[i] = tabell[tabell.length - 1 - i];
        }
        return reversert;
    }

    // g)
    public static boolean erSortert(int[] tabell) {

        if (tabell == null || tabell.length <= 1) {
            return true;
        }

        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] < tabell[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {

        if (tabell1 == null && tabell2 == null) {
            return null;
        }

        if (tabell1 == null) {
            return tabell2.clone();
        }

        if (tabell2 == null) {
            return tabell1.clone();
        }

        int[] resultat = new int[tabell1.length + tabell2.length];
        for (int i = 0; i < tabell1.length; i++) {
            resultat[i] = tabell1[i];
        }
        for (int i = 0; i < tabell2.length; i++) {
            resultat[tabell1.length + i] = tabell2[i];
        }
        return resultat;
    }
}
