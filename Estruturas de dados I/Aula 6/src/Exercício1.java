import java.util.Scanner;

class Exercício1 {


    private static Lista CriarLista(){

        Scanner tc = new Scanner(System.in);

        Lista lista1 = new Lista();
        int numero, LF = 0;


            System.out.println("Preencha a lista: ");
            System.out.println("(99) Cancela o preenchimento! ");
            do {
                numero = tc.nextInt();
                if (numero != 99) {
                    lista1.lista[LF] = numero;
                    LF++;
                }
            } while (numero != 99);

        lista1.TamanhoLista = LF - 1;
        System.out.println("Lista Preenchida!");

        return (lista1);

    }



    private static Lista InserirFinal(Lista lista2) {

        Scanner tc = new Scanner(System.in);

        int valor;

        System.out.println("Insira um valor: ");
        valor = tc.nextInt();
        lista2.TamanhoLista++;
        lista2.lista[lista2.TamanhoLista] = valor;

        System.out.println("Valor inserido no final!");

        return (lista2);

    }



    private static Lista ExcluirFinal(Lista lista2) {

        lista2.lista[lista2.TamanhoLista] = 0;
        lista2.TamanhoLista--;
        System.out.println("Valor final excluído!");

        return (lista2);

    }



    private static Lista ApagarLista(Lista lista2) {

        for (int i=0; i<(lista2.TamanhoLista+1); i++) {
            lista2.lista[i] = 0;
        }

        System.out.println("Lista apagada!");

        return (lista2);

    }



    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        Lista lista2 = new Lista();
        int escolha;

        do {

            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Criar lista");
            System.out.println("2 - Inserir no final");
            System.out.println("3 - Excluir do final");
            System.out.println("4 - Apagar lista");
            System.out.println("5 - Sair");
            escolha = tc.nextInt();

            switch (escolha) {

                case 1:
                    lista2 = CriarLista();
                    for (int i=0;i<10;i++) {
                        System.out.println(lista2.lista[i]);
                    }
                    break;

                case 2:
                    lista2 = InserirFinal(lista2);
                    for (int i=0;i<10;i++) {
                        System.out.println(lista2.lista[i]);
                    }
                    break;

                case 3:
                    lista2 = ExcluirFinal(lista2);
                    for (int i=0;i<10;i++) {
                        System.out.println(lista2.lista[i]);
                    }
                    break;

                case 4:
                    lista2 = ApagarLista(lista2);
                    for (int i=0;i<10;i++) {
                        System.out.println(lista2.lista[i]);
                    }
                    break;

                default:
                    System.out.println("Programa encerrado!");
                    break;

            }

        } while (escolha != 5);

    }

}
