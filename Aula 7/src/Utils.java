import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {


    public static int lerInt() {
        System.out.println("Digite um valor: ");
        return Main.tc.nextInt();
    }


    public static int lerInt(String mensagem) {
        System.out.println(mensagem);
        return Main.tc.nextInt();
    }


    public static double lerDouble() {
        System.out.println("Digite um valor: ");
        return Main.tc.nextDouble();
    }


    public static double lerDouble(String mensagem) {
        System.out.println(mensagem);
        return Main.tc.nextDouble();
    }


    public static float lerFloat() {
        System.out.println("Digite um valor: ");
        return Main.tc.nextFloat();
    }


    public static double lerFloat(String mensagem) {
        System.out.println(mensagem);
        return Main.tc.nextFloat();
    }


    public static char lerChar() {
        System.out.println("Digite um caractere: ");
        return Main.tc.nextLine().toUpperCase().charAt(0);
    }


    public static char lerChar(String mensagem) {
        System.out.println(mensagem);
        return Main.tc.nextLine().toUpperCase().charAt(0);
    }


    public static String lerString() {
        System.out.println("Digite uma frase: ");
        return Main.tc.next();
    }


    public static String lerString(String mensagem) {
        System.out.println(mensagem);
        return Main.tc.next();
    }


    public static String lerEmail() {
        String email;
        System.out.println("Email: ");
        email = Main.tc.next();
        boolean valida = email.matches(".*@.*");
        if (valida == true) {
            return (email);
        }
        return (null);
    }


    public static String lerTelefone() {
        String telefone;
        System.out.println("Tefefone: ");
        telefone = Main.tc.next();
        boolean valida = telefone.matches("\\d\\d\\d-\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        if (valida == true) {
            return (telefone);
        }
        return (null);
    }


    public static String lerData() {
        String data;
        System.out.println("Data: ");
        data = Main.tc.next();
        boolean valida = data.matches("\\d\\d/\\d\\d/\\d\\d\\d\\d");
        if (valida == true) {
            return (data);
        }
        return (null);
    }


    public static void converteData() {
        String data1;
        data1 = lerData();
        LocalDate data = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(data.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
    }


    public static int validaNumero(int numero) {
        boolean valida = true;
        do {
            System.out.println("Digite um valor: ");
            try {
                numero = Integer.parseInt(Main.tc.nextLine());
                return (numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite apenas números!");
                valida = false;
            }
        } while (valida != true);
        return (numero);
    }

}