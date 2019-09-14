import java.util.Scanner;

public class Main {

    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Utils.lerInt());
        System.out.println(Utils.lerInt("Digite um valor: "));
        System.out.println(Utils.lerDouble());
        System.out.println(Utils.lerDouble("Digite um valor: "));
        System.out.println(Utils.lerFloat());
        System.out.println(Utils.lerFloat("Digite um valor: "));
        System.out.println(Utils.lerChar());
        System.out.println(Utils.lerChar("Digite um caractere: "));
        System.out.println(Utils.lerString());
        System.out.println(Utils.lerString("Digite uma frase: "));
        System.out.println(Utils.lerEmail());
        System.out.println(Utils.lerTelefone());
        System.out.println(Utils.lerData());
        Utils.converteData();
        int x = 0, recebe;
        recebe = Utils.validaNumero(x);
        System.out.println(recebe);
    }

}
