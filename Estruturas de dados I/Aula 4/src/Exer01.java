import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int L[] = new int[10];
        int l[] = new int[10];
        int n = 4;
        int i;
        int j;

        L[0] = 9;
        L[1] = 3;
        L[2] = 8;
        L[3] = 6;
        L[4] = 7;
        n++;

        for (i=0; i<n; i++) {
            System.out.println(L[i]);
        }
        System.out.println("Números de elementos: " + n);
        System.out.println(" ");

        System.out.println("------------------------------------------");

        n--;
        for (i=0; i<n; i++) {
            L[i] = L[i + 1];
            System.out.println(L[i]);
        }
        System.out.println("Números de elementos: " + n);
        System.out.println(" ");

        System.out.println("------------------------------------------");

        for (i=0; i<n; i++) {
            if (L[i] == 8) {
                for (j=i; j<n; j++) {
                    L[j] = L[j + 1];
                }
            }

        }

        n--;
        for (i=0; i<n; i++) {
            System.out.println(L[i]);
        }
        System.out.println("Números de elementos: " + n);
        System.out.println(" ");

        System.out.println("------------------------------------------");

        for (i=0; i<n; i++) {
            l[i + 1] = L[i];

        }
        l[0] = -4;
        n++;

        for (i=0; i<n; i++) {
            System.out.println(l[i]);
        }
        System.out.println("Números de elementos: " + n);
        System.out.println(" ");

        System.out.println("------------------------------------------");

        for (i=2; i<n; i++) {
            l[i] = l[i + 1];
        }
        n--;

        for (i=0; i<n; i++) {
            System.out.println(l[i]);
        }
        System.out.println("Números de elementos: " + n);
        System.out.println(" ");

    }

}