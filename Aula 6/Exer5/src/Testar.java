import java.util.Scanner;

public class Testar {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int numero, resultado, tamanho;

        for (int i=0; i<10; i++) {
            array1[i] = 1 + (int)(Math.random() * 10);
            array2[i] = 1 + (int)(Math.random() * 10);
        }
        System.out.println("Pesquise um número nos arrays: ");
        numero = tc.nextInt();

        resultado = MeusArrays.verifica(array1, array2, numero);
        System.out.println(resultado);

        System.out.println("Número de elementos do array: ");
        tamanho = tc.nextInt();
        int[] ArrayRandom = new int[tamanho];

        ArrayRandom = MeusArrays.novoArray(tamanho);
        for (int i=0; i<tamanho; i++) {
            System.out.println(ArrayRandom[i]);
        }

    }

}
