public class Exer8 {

    public static void main(String[] args) {

        int [] par = new int[10];
        int [] impar = new int[10];
        int sorteio, PosicaoPar = 0, PosicaoImpar = 0;

        for (int i=0; i<10; i++) {
            sorteio = 1 + (int)(Math.random() * 20);

            if ((sorteio % 2) == 0) {
                par[PosicaoPar] = sorteio;
                PosicaoPar++;
            }

            else {
                impar[PosicaoImpar] = sorteio;
                PosicaoImpar++;
            }

        }

        System.out.println("Array Par: ");
        for (int i=0; i<PosicaoPar; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println();
        System.out.println("Array Ímpar: ");
        for (int i=0; i<PosicaoImpar; i++) {
            System.out.print(impar[i] + " ");
        }

    }

}
