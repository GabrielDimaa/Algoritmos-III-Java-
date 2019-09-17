import java.util.Scanner;

public class Exer1 {


    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int [][] matriz = new int[4][4];
        int l, c, linha, coluna, elemento;
        char escolha;

        for (l=0; l<4; l++) {
            for (c=0; c<4; c++) {
                matriz[l][c] = 0;
            }
        }

        /*---------------- INÍCIO MENU ---------------- */

        do {
            System.out.println("Escolha sua opção: ");
            System.out.println("A - Adicionar elemento");
            System.out.println("R - Remover elemento");
            System.out.println("L - Limpar matriz");
            System.out.println("M - Mostrar matriz");
            System.out.println("S - Sair");
            escolha = tc.next().toUpperCase().charAt(0);

            switch (escolha){

                case 'A':

                    System.out.println("Digite a linha e a coluna que deseja Adicionar: ");
                    System.out.println(" ");
                    linha = tc.nextInt();
                    coluna = tc.nextInt();
                    linha = linha -1;
                    coluna = coluna -1;
                    System.out.println("Digite o elemento que você deseja adicionar: ");
                    elemento = tc.nextInt();

                    if (matriz[linha][coluna] != 0) {
                        System.out.println("A matriz já existe um valor: " + matriz[linha][coluna]);
                    }

                    matriz[linha][coluna] = elemento;

                    break;


                case 'R':

                    System.out.println("Digite a linha e a coluna que deseja remover: ");
                    System.out.println(" ");
                    linha = tc.nextInt();
                    coluna = tc.nextInt();
                    linha = linha -1;
                    coluna = coluna -1;

                    matriz[linha][coluna] = 0;

                    break;

                case 'L':

                    for (l=0; l<4; l++) {
                        for (c=0; c<4; c++) {
                            matriz[l][c] = 0;
                        }
                    }
                    System.out.println("Matriz apagada!");

                    break;

                case 'M':

                    for (l=0; l<4; l++) {
                        for (c=0; c<4; c++) {
                            System.out.println("Linha " + (l+1) + ", coluna " + (c+1) + " = " + matriz[l][c]);
                        }
                    }

                    break;

                case 'S':

                    System.out.println("Programa encerrado!");

                    break;

            }

        } while (escolha != 'S');


    }

}
