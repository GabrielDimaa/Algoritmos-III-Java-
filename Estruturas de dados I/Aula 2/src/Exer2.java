import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        double idade;
        double media;
        double cont=0;
        double soma=0;

        do {
            System.out.println("Digite a idade:");
            idade = tc.nextDouble();
            cont++;
            soma = idade + soma;
            media = soma / cont;
            if (cont >= 10) {
                System.out.println(media);
                break;
            }
        } while (media <= 20);

        System.out.println(media);

    }

}
