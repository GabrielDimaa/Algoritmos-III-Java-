import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        ArrayList<Conta> banco = new ArrayList();

        int escolha;


        do {
            System.out.println("1 - Adicionar conta");
            System.out.println("2 - Operações");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Remover");
            System.out.println("5 - Sair");
            escolha = tc.nextInt();
            switch (escolha) {

                case 1:
                    banco = Metodos.addCliente(banco);
                    break;

                case 2:
                    Metodos.operacoes(banco);
                    break;

                case 3:
                    Metodos.atualizar(banco);
                    break;

                case 4:
                    banco = Metodos.remover(banco);
                    break;

                case 5:
                    System.out.println("Programa encerrado!");
                    break;

            }

        } while (escolha != 5);

    }

}
