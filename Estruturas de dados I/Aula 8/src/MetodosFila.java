public class MetodosFila {

    public static boolean validaLista (ListaFila fila1) {
        //Função para não criar novo aluno se passar o limite do registro
        if (fila1.tamanho == 9) {
            return (false);
        }
        return (true);
    }

    public static ListaFila criarFila() {
        ListaFila fila1 = new ListaFila();
        int i;
        char resp;

        System.out.println("Criar uma Lista!");
        for (i=0; i<fila1.Max; i++) {
            System.out.println("Digite um nome: ");
            fila1.fila[i] = Main.tc.next();
            System.out.println("Deseja continuar inserindo? (S/N)");
            resp = Main.tc.next().toUpperCase().charAt(0);
            if (resp == 'N') {
                fila1.tamanho = i;
                break;
            }
        }

        fila1.tamanho = i;
        return (fila1);

    }


    public static ListaFila destruirFila(ListaFila fila1) {

        System.out.println("Destruir fila!");
        for (int i=0; i<(fila1.tamanho + 1); i++) {
            fila1.fila[i] = null;
        }
        fila1.tamanho = 0;
        return (fila1);

    }


    public static ListaFila inserirNaFila(ListaFila fila1) {

        boolean valida = validaLista(fila1);
        char resp;

        if (valida == true) {
            System.out.println("Inserir na fila!");
            for (int i=(fila1.tamanho + 1); i<fila1.Max; i++) {
                System.out.println("Digite um nome: ");
                fila1.fila[i] = Main.tc.next();
                System.out.println("Deseja continuar inserindo? (S/N)");
                resp = Main.tc.next().toUpperCase().charAt(0);
                if (resp == 'N') {
                    fila1.tamanho = i;
                    return (fila1);
                }
            }
        }

        else {
            System.out.println("Fila cheia!");
        }

        return (fila1);

    }


    public static ListaFila remocaoElemento(ListaFila fila1) {

        System.out.println("Elemento removido");
        fila1.fila[fila1.tamanho] = null;
        fila1.tamanho--;
        return (fila1);

    }


    public static ListaFila localizacao(ListaFila fila1) {

        String nome;
        char resp;

        System.out.println("Consulta ou alteração!");
        System.out.println("Digite o nome: ");
        nome = Main.tc.next().toUpperCase();
        for (int i=0; i<(fila1.tamanho + 1); i++) {
            if (nome.equals(fila1.fila[i].toUpperCase())) {
                System.out.println("Nome encontrado!");
                System.out.println("Deseja alterar nome? (S/N)");
                resp = Main.tc.next().toUpperCase().charAt(0);
                if (resp == 'S') {
                    System.out.println("Digite o nome: ");
                    fila1.fila[i] = Main.tc.next();
                    break;
                }
            }
        }

        System.out.println("Nome não encontrado!");
        return (fila1);

    }


    public static void mostrarFila(ListaFila fila1) {
        for (int i=0; i<fila1.Max; i++) {
            System.out.println(fila1.fila[i]);
        }
    }

}
