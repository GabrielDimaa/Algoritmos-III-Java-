import java.util.Scanner;

public class Exer2 {



    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        Carro [][] estac = new Carro[3][3];
        int escolha, l, c, linha, coluna;
        char resp;

        /*---------------- INÍCIO MENU ---------------- */

        do {
            System.out.println("Escolha sua opção: ");
            System.out.println("A - Adicionar carro");
            System.out.println("R - Remover carro");
            System.out.println("L - Limpar estacionamento");
            System.out.println("M - Mostrar estacionamento");
            System.out.println("S - Sair");
            escolha = tc.next().toUpperCase().charAt(0);

            switch (escolha) {

                case 'A':

                    Carro carro1 = new Carro();

                    System.out.println("Digite a linha e a coluna que deseja adicionar: ");
                    System.out.println(" ");
                    linha = tc.nextInt();
                    coluna = tc.nextInt();
                    linha = linha -1;
                    coluna = coluna -1;

                    if (estac[linha][coluna] != null) {
                        System.out.println("O estacionamento já existe um carro: " + estac[linha][coluna]);
                        System.out.println("Deseja sobrepor o veículo (S/N)? ");
                        resp = tc.next().toUpperCase().charAt(0);

                        if (resp == 'N') {
                            break;
                        }
                    }

                    System.out.println("Digite o modelo do carro que você deseja adicionar: ");
                    carro1.modelo = tc.next();
                    System.out.println("Digite a placa: ");
                    carro1.placa = tc.next();
                    System.out.println("Digite a cor: ");
                    carro1.cor = tc.next();

                    estac[linha][coluna] = carro1;
                    break;


                case 'R':

                    System.out.println("Digite a linha e a coluna que deseja remover o carro: ");
                    linha = tc.nextInt();
                    coluna = tc.nextInt();
                    linha = linha -1;
                    coluna = coluna -1;

                    estac[linha][coluna] = null;

                    break;

                case 'L':

                    for (l=0; l<3; l++) {
                        for (c=0; c<3; c++) {
                            estac[l][c] = null;
                        }
                    }
                    System.out.println("Estacionamento vazio!");

                    break;

                case 'M':

                    for (l=0; l<3; l++) {
                        for (c=0; c<3; c++) {
                            System.out.println("Linha " + (l+1) + ", coluna " + (c+1) + ": " + estac[l][c]);
                        }
                    }

                    break;

                default:

                    System.out.println("Programa encerrado!");

                    break;

            }

        } while (escolha != 'S');

    }

}
