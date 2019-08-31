import java.util.Scanner;

public class Exer5 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int [] notas = new int[5];
        int media, soma = 0, x = 0, cont = 0;
        int [] vetor = new int[5];


        for (int i=0; i<5; i++){
            System.out.println("Digite a nota: ");
            notas[i] = tc.nextInt();
            soma = soma + notas[i];
        }

        for (int j=0; j<5; j++) {
            for (int i=0; i<5; i++) {
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
        for (int i=0; i<5; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Média: " + media);


    }

}
