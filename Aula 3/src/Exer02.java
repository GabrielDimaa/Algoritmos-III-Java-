import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        double valor;
        double acrescimo;

        do{
            System.out.println("Valor do produto: ");
            valor = tc.nextDouble();
            acrescimo = valor * 0.12;
            System.out.println(Math.round(valor + acrescimo));
        }while (valor != 0);
    }

}
