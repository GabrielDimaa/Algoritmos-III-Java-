import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int  data [] = new int[4];
        String conteudo;

        for (int i=0; i<4; i++) {
            System.out.println("Preencha o vetor: ");
            data[i] = tc.nextInt();
        }

        System.out.print("{");

        for (int i=0; i<3; i++) {
            conteudo = + data[i] + ", ";
            System.out.print(conteudo);
        }

        System.out.print(data[3] + "}");

    }

}
