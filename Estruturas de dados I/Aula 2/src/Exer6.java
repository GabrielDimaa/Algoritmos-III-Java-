import java.util.Scanner;

public class Exer6 {

    public static void main(String[] args) {
            Scanner tc = new Scanner(System.in);

            int notas[] = new int[5];
            int media;
        int soma=0;
        int i;
        int j;
        int x=0;
        int cont=0;
        int vetor[] = new int[5];


        for (i=0; i<5; i++){
            System.out.println("Digite a nota: ");
            notas[i] = tc.nextInt();
            soma = soma + notas[i];
        }

        for (j=0; j<5; j++) {
            for (i=0; i<5; i++) {
                if (notas[i] > x) {
                    x = notas[i];
                    cont = i;
                }
            }

            vetor[j] = x;
            x = 0;
            notas[cont] = 0;
            cont = 0;

        }

        media = soma / 5;

        System.out.println("Notas na ordem decrescente: ");
        for (i=0; i<5; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Média: " + media);


    }

}
