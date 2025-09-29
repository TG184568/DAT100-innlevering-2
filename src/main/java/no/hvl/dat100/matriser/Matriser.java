package no.hvl.dat100.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {

        if (matrise == null) {
            System.out.println("null");
            return;
        }

        for (int[] rad : matrise) {
            if (rad == null) {
                System.out.println("null");
                continue;
            }

            StringBuilder sb = new StringBuilder();
            for (int verdi : rad) {
                sb.append(verdi).append(' ');
            }
            System.out.println(sb.toString());
        }
    }

    // b)
    public static String tilStreng(int[][] matrise) {

        if (matrise == null) {
            return "null";
        }

        StringBuilder sb = new StringBuilder();
        for (int[] rad : matrise) {
            if (rad == null) {
                sb.append("null\n");
                continue;
            }

            for (int verdi : rad) {
                sb.append(verdi).append(' ');
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {

        if (matrise == null) {
            return null;
        }

        int[][] resultat = new int[matrise.length][];
        for (int i = 0; i < matrise.length; i++) {
            int[] rad = matrise[i];
            if (rad == null) {
                resultat[i] = null;
                continue;
            }

            int[] nyRad = new int[rad.length];
            for (int j = 0; j < rad.length; j++) {
                nyRad[j] = tall * rad[j];
            }
            resultat[i] = nyRad;
        }
        return resultat;
    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {

        if (a == b) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            int[] radA = a[i];
            int[] radB = b[i];

            if (radA == radB) {
                continue;
            }
            if (radA == null || radB == null) {
                return false;
            }
            if (radA.length != radB.length) {
                return false;
            }

            for (int j = 0; j < radA.length; j++) {
                if (radA[j] != radB[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // e)
    public static int[][] speile(int[][] matrise) {

        if (matrise == null) {
            return null;
        }

        int rader = matrise.length;
        int kolonner = 0;

        for (int[] rad : matrise) {
            if (rad != null && rad.length > kolonner) {
                kolonner = rad.length;
            }
        }

        int[][] resultat = new int[kolonner][rader];

        for (int i = 0; i < rader; i++) {
            int[] rad = matrise[i];
            if (rad == null) {
                continue;
            }
            for (int j = 0; j < rad.length; j++) {
                resultat[j][i] = rad[j];
            }
        }
        return resultat;
    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {

        if (a == null || b == null) {
            return null;
        }

        int raderA = a.length;
        int kolonnerA = 0;
        for (int[] rad : a) {
            if (rad != null) {
                kolonnerA = rad.length;
                break;
            }
        }

        int kolonnerB = 0;
        for (int[] rad : b) {
            if (rad != null) {
                kolonnerB = rad.length;
                break;
            }
        }

        int[][] resultat = new int[raderA][kolonnerB];
        for (int i = 0; i < raderA; i++) {
            int[] radA = a[i];
            if (radA == null) {
                continue;
            }

            for (int j = 0; j < kolonnerB; j++) {
                int sum = 0;
                for (int k = 0; k < kolonnerA; k++) {
                    int verdiA = k < radA.length ? radA[k] : 0;
                    int[] radB = (k < b.length) ? b[k] : null;
                    int verdiB = (radB != null && j < radB.length) ? radB[j] : 0;
                    sum += verdiA * verdiB;
                }
                resultat[i][j] = sum;
            }
        }
        return resultat;
    }
}
