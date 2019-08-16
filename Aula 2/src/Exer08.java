import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        int numero;
        int i;

        Scanner tc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = tc.nextInt();

        for (i=1; i<11; i++) {
            System.out.println(+ numero + " x " + i + " = " + (numero * i) );
        }


    }

}
