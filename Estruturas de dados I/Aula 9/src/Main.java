import java.util.Scanner;

public class Main {

    public static void addElemento(Lista lista) {
        Scanner tc = new Scanner(System.in);
        Elemento novoElemento = new Elemento();
        Elemento elementoAux = new Elemento();

        if (lista.quant == 0) {
            System.out.println("Insira o valor: ");
            novoElemento.numero = tc.nextInt();
            novoElemento.proximo = null;

            lista.primeiro = novoElemento;
            lista.ultimo = novoElemento;
            lista.quant++;

        }
        else {
            elementoAux = lista.primeiro;

            while (elementoAux.proximo != null) {
                elementoAux = elementoAux.proximo;
            }
            System.out.println("Insira o valor: ");
            novoElemento.numero = tc.nextInt();
            novoElemento.proximo = null;

            elementoAux.proximo = novoElemento;
            lista.ultimo = novoElemento;
            lista.quant++;
        }

    }


    public static void listar(Lista lista) {

        Elemento aux = lista.primeiro;
        while (aux != null) {
            System.out.println(aux.numero);
            aux = aux.proximo;
        }

    }


    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int escolha;
        Lista lista = new Lista();
        lista.quant = 0;

        do {
            System.out.println("1 - Add elemento");
            System.out.println("2 - Número de elementos");
            System.out.println("3 - Listar elementos");
            System.out.println("4 - Sair");
            escolha = tc.nextInt();
            switch (escolha) {

                case 1:
                    addElemento(lista);
                    break;

                case 2:
                    System.out.println("Número de elementos: " + lista.quant);
                    break;

                case 3:
                    listar(lista);
                    break;

                case 4:
                    break;
            }
        } while (escolha != 4);
    }

}
