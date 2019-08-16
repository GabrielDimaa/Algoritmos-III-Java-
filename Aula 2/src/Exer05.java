import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        String produto = new String();
        double valor;
        double desconto;

        Scanner tc = new Scanner(System.in);

        System.out.println("Produto: ");
        produto = tc.next();
        System.out.println("Valor: ");
        valor = tc.nextDouble();

        if (valor <= 0) {
            do {
                System.out.println("Valor impróprio!");
                System.out.println("Valor: ");
                valor = tc.nextDouble();
            } while (valor <= 0);
        }

        if (valor >= 50 && valor < 200) {
            desconto = valor * 0.05;
            System.out.println("Produto: " + produto);
            System.out.println("Valor: " + valor);
            System.out.println("Valor com desconto: " + (valor - desconto));
        }

        else if (valor >= 200 && valor < 500) {
            desconto = valor * 0.06;
            System.out.println("Produto: " + produto);
            System.out.println("Valor: " + valor);
            System.out.println("Valor com desconto: " + (valor - desconto));
        }

        else if (valor >= 500 && valor < 1000) {
            desconto = valor * 0.07;
            System.out.println("Produto: " + produto);
            System.out.println("Valor: " + valor);
            System.out.println("Valor com desconto: " + (valor - desconto));
        }

        else if (valor >= 1000) {
            desconto = valor * 0.08;
            System.out.println("Produto: " + produto);
            System.out.println("Valor: " + valor);
            System.out.println("Valor com desconto: " + (valor - desconto));
        }



    }

}
