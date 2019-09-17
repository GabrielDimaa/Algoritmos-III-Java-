import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int vetor1[] = new int[10];
        int vetor2[] = new int[5];
        int par[] = new int[10];
        int impar[] = new int[10];
        int i;
        int j;
        int x = 0;
        int y = 0;
        int aux = 0;
        int soma = 0;

        for (i=0; i<10; i++) {
            System.out.println("Preencha o primeiro vetor: ");
            vetor1[i] = tc.nextInt();
        }

        for (i=0; i<5; i++) {
            System.out.println("Preencha o segundo vetor: ");
            vetor2[i] = tc.nextInt();
        }

        for (i=0; i<10; i++) {
            aux = vetor1[i];

            for(j=0; j<5; j++) {
                soma = soma + aux + vetor2[j];
                aux = 0;
            }

            if ((soma % 2) == 0) {
                par[x] = soma;
                x++;
            }

            else {
                impar[y] = soma;
                y++;
            }
            soma = 0;

        }

        System.out.println("Vetor resultante Par: ");
        for(i=0; i<x; i++) {
            System.out.print(" " + par[i]);
        }

        System.out.println(" ");

        System.out.println("Vetor resultante Ímpar: ");
        for(i=0; i<y; i++) {
            System.out.print(" " + impar[i]);
        }

    }

}
