import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor;
        int soma = 0;
        int media;
        int cont=0;

        do {
            System.out.println("Digite um valor: ");
            valor = tc.nextInt();
            if (valor == -99) {
                media = soma / cont;
                System.out.println("Soma: " + soma);
                System.out.println("Média: " + media);
                break;
            }
            soma = soma + valor;
            cont++;
        } while (valor != -99);

    }

}

