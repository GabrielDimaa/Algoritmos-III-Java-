/*
Usando um array unidimensional de 10 elementos do tipo String, faça uma classe que simule a ocupação de um
estacionamento de veículos. Considere que a posição do array corresponde ao número da vaga e para cada vaga é
armazenada a placa do veículo que está estacionado. Sua classe deve conter um laço de repetição simulando um
menu que controle a entrada e a saída dos veículos com as opções: 1-Entrada, 2-Saída e 3-Listar situação
atual e 4-Encerrar o programa. Se o usuário escolher 1, solicite o número da vaga e a placa do veículo; se
escolher 2, solicite o número da vaga que será liberada e armazene o valor branco na posição correspondente ao array;
se escolher 3, liste a situação atual apresentando em tela todos os elementos do array; quando for 4,
encerre o laço e o programa.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exer9 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        String [] estac = new String[10];
        int escolha, local;
        char resp;

        do {

            System.out.println("Escolha sua opção: ");
            System.out.println("1 - Entrada");
            System.out.println("2 - Saída");
            System.out.println("3 - Listar situação atual");
            System.out.println("4 - Encerrar programa");
            escolha = tc.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println("Número da vaga: ");
                    local = tc.nextInt();
                    local--;
                    if (estac[local] != null) {
                        System.out.println("Essa vaga já possui um veículo: " + estac[local]);
                        System.out.println("Deseja sobrepor o veículo (S/N)? ");
                        resp = tc.next().toUpperCase().charAt(0);

                        if (resp == 'N') {
                            break;
                        }
                    }

                    System.out.println("Placa do veículo: ");
                    estac[local] = tc.next();
                    System.out.println("Veículo adicionado a vaga " + (local + 1));
                    break;

                case 2:
                    System.out.println("Número da vaga a ser liberada: ");
                    local = tc.nextInt();
                    local--;
                    estac[local] = null;
                    System.out.println("Vaga liberada!");
                    break;

                case 3:
                    for (int i=0; i<10; i++) {
                        System.out.println("Vaga " + (i + 1) + ": " + estac[i]);
                    }
                    break;

                default:
                    System.out.println("Programa encerrado!");
                    break;

            }

        } while (escolha != 4);

    }

}
