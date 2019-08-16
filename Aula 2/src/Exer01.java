import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        double valor;
        double desconto;
        double ValorDesconto;

        System.out.println("Digite o valor do produto: ");
        valor = tc.nextDouble();
        System.out.println("Digite o desconto (%): ");
        desconto = tc.nextDouble();
        ValorDesconto = valor * (desconto / 100);
        System.out.println("Valor do produto com desconto: " + (valor - ValorDesconto));
        System.out.println("Valor do desconto: " + desconto);


    }

}
