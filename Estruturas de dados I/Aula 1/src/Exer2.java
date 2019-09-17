import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {

        float vetor[] = new float[5];
        int escolha;
        int i;

        Scanner tc = new Scanner(System.in);

        for (i=0; i<5; i++){
            System.out.println("Preencha o vetor: ");
            vetor[i] = tc.nextFloat();
        }

        System.out.println("Digite um número: ");
        escolha = tc.nextInt();

        if (escolha == 0){
            System.out.println("Programa encerrado!");
        }
        else if (escolha == 1){
            for (i=0; i<5; i++){
                System.out.println(+ vetor[i]);
            }
        }
        else if (escolha == 2){
            i = 4;
            do {
                System.out.println(+ vetor[i]);
                i = i - 1;
            } while (i >= 0);
        }

    }

}
