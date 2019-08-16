import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        String frase = new String();

        System.out.println("Escreva uma frase: ");
        frase = tc.nextLine();

        if (frase.contains("sexo") == true || frase.contains("sexual") == true) {
            System.out.println("Conteúdo impróprio");
        }
        else {
            System.out.println("Conteúdo liberado");
        }

    }

}
