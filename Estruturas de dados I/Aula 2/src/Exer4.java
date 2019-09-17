import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int numero;
        int soma=0;
        int media;
        int cont=0;

        do {
            System.out.println("Digite um número: ");
            numero = tc.nextInt();
            if ((numero % 3) == 0) {
                soma = soma + numero;
                cont++;
            }
        } while (numero != 0);

        media = soma / cont;
        System.out.println("Média dos números multiplos por 3: " + media);

    }

}
