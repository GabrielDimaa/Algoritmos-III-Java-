import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        String frase;
        String inversa;

        System.out.println("Digite uma String: ");
        frase = tc.next();
        inversa = new StringBuilder(frase).reverse().toString();
        System.out.println(inversa);

        if (frase.intern() == inversa.intern()) {
            System.out.println("É panlíndromos");
        }

        else {
            System.out.println("Não é panlíndromos");
        }

    }

}
