import java.util.Scanner;

public class Main {

    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {


        int escolha = 0;
        ListaFila ObjetoFila = new ListaFila();

        do {

            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Criar lista");
            System.out.println("2 - Destruir lista");
            System.out.println("3 - Inserção de um elemento");
            System.out.println("4 - Remoção de um elemento");
            System.out.println("5 - Localização para consulta ou alteração");
            System.out.println("6 - Mostrar lista");
            System.out.println("7 - Sair");
            escolha = tc.nextInt();

            switch (escolha) {

                case 1:
                    ObjetoFila = MetodosFila.criarFila();
                    break;

                case 2:
                    ObjetoFila = MetodosFila.destruirFila(ObjetoFila);
                    break;

                case 3:
                    ObjetoFila = MetodosFila.inserirNaFila(ObjetoFila);
                    break;

                case 4:
                    ObjetoFila = MetodosFila.remocaoElemento(ObjetoFila);
                    break;

                case 5:
                    ObjetoFila = MetodosFila.localizacao(ObjetoFila);
                    break;

                case 6:
                    MetodosFila.mostrarFila(ObjetoFila);

                default:
                    System.out.println("Programa encerrado!");
                    break;


            }

        } while (escolha != 7);

    }

}
