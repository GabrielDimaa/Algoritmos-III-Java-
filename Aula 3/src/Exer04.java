import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        String frase = new String();

        System.out.println("Escreva uma frase: ");
        frase = tc.nextLine();
        frase = frase.replace(" ", "");

        frase = new StringBuilder(frase).reverse().toString();
        System.out.println(frase);

    }

}
