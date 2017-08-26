package MergeSort;

public class MergeSort {

    private static final int N = 6;
    private static int tab[] = {2,3,5,1,7,8};//{30,29,28,27,26,25,1,2,3,4,5,6,7,24,23,22,21,20,19,18,8,9,10,11,17,16,15,13,14,12};
    private static int t[] = new int[N];  // Tablica pomocnicza

    /* Scalanie dwoch posortowanych ciagow
       tab[pocz...sr] i tab[sr+1...kon] i
       wynik zapisuje w tab[pocz...kon] */
    private static void merge(int pocz, int sr, int kon)
    {
        int i,j,q;
        for (i=pocz; i<=kon; i++) t[i]=tab[i];  // Skopiowanie danych do tablicy pomocniczej
        i=pocz; j=sr+1; q=pocz;                 // Ustawienie wskaĽników tablic
        while (i<=sr && j<=kon) {		  // Przenoszenie danych z sortowaniem ze zbiorów pomocniczych do tablicy głównej
            if (t[i]<t[j])
                tab[q++]=t[i++];
            else
                tab[q++]=t[j++];
        }
        while (i<=sr) tab[q++]=t[i++];	// Przeniesienie nie skopiowanych danych ze zbioru pierwszego w przypadku, gdy drugi zbiór się skończył
    }

    /* Procedura sortowania tab[pocz...kon] */
    public static void mergesort(int pocz, int kon)
    {
        int sr;
        if (pocz<kon) {
            sr=(pocz+kon)/2;
            mergesort(pocz, sr);    // Dzielenie lewej czę¶ci
            mergesort(sr+1, kon);   // Dzielenie prawej czę¶ci
            merge(pocz, sr, kon);   // Ł±czenie czę¶ci lewej i prawej
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        int i;

        System.out.println("Zbior przed sortowaniem:");
        for (i=0; i<N; i++)
            System.out.print(tab[i] + " ");

        mergesort(0,N-1);

        System.out.println("\nZbior po sortowaniu:");
        for (i=0; i<N; i++)
            System.out.print(tab[i] + " ");

    }

}
