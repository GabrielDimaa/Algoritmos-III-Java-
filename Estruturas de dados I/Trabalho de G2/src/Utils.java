import java.util.Scanner;

public class Utils {

    public static Scanner tc = new Scanner(System.in);

    public static int validaNumero(String frase) {
        boolean valida = false;
        int numero = 0;
        while (valida != true) {
            System.out.println(frase);
            try {
                numero = Integer.parseInt(tc.nextLine());
                return (numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite apenas números!");
                valida = false;
            }
        }
        return (numero);
    }

    public static String lerTelefone() {
        String telefone;
        boolean valida = false;
        int valor;
        do {
            valor = validaNumero("Telefone: ");
            telefone = Integer.toString(valor);
            valida = telefone.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d");
            if (valida) {
                return (telefone);
            }
            else {
                System.out.println("Telefone incorreto!");
                valida = false;
            }
        } while (valida == false);
        return null;
    }

    public static String lerEmail() {
        String email;
        boolean valida;
        do {
            System.out.println("Email: ");
            email = tc.next();
            valida = email.matches(".*@.*");
            if (valida) {
                return (email);
            }
            else {
                System.out.println("Email incorreto!");
                valida = false;
            }
        } while (valida == false);
        return null;
    }


}
