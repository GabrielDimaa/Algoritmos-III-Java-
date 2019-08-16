import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {
        int valor[] = new int[4];
        int maior = 0, menor = 0;
        Scanner tc = new Scanner(System.in);


        for (int i = 0; i < valor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valor[i] = tc.nextInt();
            if (valor[i] > maior) {
                maior = valor[i];
            }

        }
        menor=maior;
        for (int j = 0; j < 4; j++) {
            if (valor[j] < menor) {
                menor = valor[j];
            }
        }
        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);

    }
}
