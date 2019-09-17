import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {

        int vetor[] = new int[10];
        int i;

        Scanner tc = new Scanner(System.in);

        System.out.println("Preencha o vetor: ");
        for (i=0; i<10; i++){
            System.out.println();
            vetor[i] = tc.nextInt();
        }

        for (i=0; i<10; i++){
            if (vetor[i] > 50){
                System.out.println(+ vetor[i] + " na posição " + i);
            }
        }


    }

}
