import java.util.Scanner;

public class FuncaoLista {



    public static boolean validaLista (Registro registro1) {

        //Função para não criar novo aluno se passar o limite do registro

        if (registro1.TamanhoLista == 99) {
            return (false);
        }

        return (true);

    }

    public static DadosAluno cadastro () {

        Scanner tc = new Scanner(System.in);

        DadosAluno aluno1 = new DadosAluno();

        System.out.println("Código: ");
        aluno1.codigo = tc.nextInt();
        System.out.println("Nome: ");
        aluno1.nome = tc.next();
        System.out.println("Telefone: ");
        aluno1.telefone = tc.nextLong();
        System.out.println("Email: ");
        aluno1.email = tc.next();
        System.out.println("Nota G1: ");
        aluno1.G1 = tc.nextFloat();
        System.out.println("Nota G2: ");
        aluno1.G2 = tc.nextFloat();

        return (aluno1);

    }




    public static Registro criarLista () {

        Scanner tc = new Scanner(System.in);

        Registro registro1 = new Registro();
        int i = 0;
        char resp = 0;

        do {

                DadosAluno aluno1;

                aluno1 = cadastro();

                registro1.lista[i] = aluno1;
                registro1.TamanhoLista = i;
                i++;

                if (registro1.TamanhoLista >= 99) {
                    System.out.println("Lista cheia!");
                    return (registro1);
                }

                System.out.println("Deseja Continuar? (S/N)");
                resp = tc.next().toUpperCase().charAt(0);

                if (resp == 'N') {
                    return (registro1);
                }

        } while (resp == 'S');

        return (null);

    }




    public static Registro incluirFinal(Registro registro1) {

        Scanner tc = new Scanner(System.in);

        boolean valida = validaLista(registro1);
        if (valida == false) {
            return registro1;
        }

        DadosAluno aluno1;

        System.out.println("Incluir no final!");
        aluno1 = cadastro();
        System.out.println("Aluno incluído no final!");

        registro1.TamanhoLista++;
        registro1.lista[registro1.TamanhoLista] = aluno1;

        return (registro1);

    }




    public static Registro incluirInicio (Registro registro1) {

        Scanner tc = new Scanner(System.in);

        boolean valida = validaLista(registro1);
        if (valida == false) {
            return registro1;
        }


        Registro registro2 = new Registro();

        for (int i=0; i<(registro1.TamanhoLista + 1); i++) {
            registro2.lista[i+1] = registro1.lista[i];
        }
        registro2.TamanhoLista = registro1.TamanhoLista;

        DadosAluno aluno1;

        System.out.println("Incluir no início!");
        aluno1 = cadastro();
        System.out.println("Aluno incluído no Início!");

        registro2.lista[0] = aluno1;
        registro2.TamanhoLista++;


        return (registro2);

    }




    public static Registro incluirPosNome (Registro registro1) {

        Scanner tc = new Scanner(System.in);

        boolean valida = validaLista(registro1);
        if (valida == false) {
            return registro1;
        }


        Registro registro2 = new Registro();
        String nomeAluno;
        int posicao = 0;
        char resp;

        System.out.println("Incluir após um nome!");

        do {

            System.out.println("Digite o nome do aluno: ");
            nomeAluno = tc.next();

            for (int i = 0; i < (registro1.TamanhoLista + 1); i++) {

                if (registro1.lista[i].nome.toUpperCase().equals(nomeAluno.toUpperCase())) {
                    posicao = i;
                    posicao++;

                    for (int j = 0; j<(posicao); j++) {
                        registro2.lista[j] = registro1.lista[j];
                    }

                    DadosAluno aluno1;

                    System.out.println("Adicionar aluno");
                    aluno1 = cadastro();
                    System.out.println("Aluno incluído!");

                    registro2.lista[posicao] = aluno1;
                    registro1.TamanhoLista++;

                    for (int k=(posicao + 1); k<(registro1.TamanhoLista + 1); k++) {
                        registro2.lista[k] = registro1.lista[k-1];
                    }
                    registro2.TamanhoLista = registro1.TamanhoLista;

                    return (registro2);

                }

            }

            System.out.println("Aluno não encontrado!");
            System.out.println("Deseja procurar novamente? ");
            resp = tc.next().toUpperCase().charAt(0);

        } while (resp == 'S');

        return (registro1);

    }




    public static void consultarNome (Registro registro1) {

        Scanner tc = new Scanner(System.in);

        String nomeAluno;
        char resp;

        System.out.println("Consultar nome do aluno!");

        do {

            System.out.println("Digite o nome do aluno: ");
            nomeAluno = tc.next().toUpperCase();

            for (int i = 0; i < (registro1.TamanhoLista + 1); i++) {

                if (registro1.lista[i].nome.toUpperCase().equals(nomeAluno)) {
                    System.out.println(registro1.lista[i]);
                    break;
                }

            }

            System.out.println("Aluno não encontrado!");
            System.out.println("Deseja procurar novamente? ");
            resp = tc.next().toUpperCase().charAt(0);

        } while (resp == 'S');

    }




    public static Registro excluirInicio(Registro registro1) {

        Registro registro2 = new Registro();

        System.out.println("Excluir do início!");

        for (int i=0; i<(registro1.TamanhoLista + 1); i++) {
            registro2.lista[i] = registro1.lista[i+1];
        }

        System.out.println("Aluno excluído!");
        registro2.TamanhoLista = registro1.TamanhoLista;
        registro2.TamanhoLista--;
        return (registro2);

    }




    public static Registro excluirFim (Registro registro1) {

        registro1.lista[registro1.TamanhoLista] = null;
        registro1.TamanhoLista--;
        System.out.println("Aluno excluído!");
        return (registro1);

    }




    public static Registro excluirCodigo (Registro registro1) {

        Scanner tc = new Scanner(System.in);

        Registro registro2 = new Registro();
        int codigo;
        int posicao = 0;
        char resp;

        System.out.println("Excluir por código!");

        do {

            System.out.println("Digite o código: ");
            codigo = tc.nextInt();

            for (int i = 0; i < (registro1.TamanhoLista + 1); i++) {

                if (registro1.lista[i].codigo == codigo) {
                    posicao = i;

                    for (int j = 0; j<posicao; j++) {
                        registro2.lista[j] = registro1.lista[j];
                    }

                    for (int k=posicao; k<(registro1.TamanhoLista + 1); k++) {
                        registro2.lista[k] = registro1.lista[k + 1];
                    }

                    registro2.TamanhoLista = registro1.TamanhoLista;
                    registro2.TamanhoLista--;
                    System.out.println("Aluno excluído!");
                    return (registro2);

                }

            }

            System.out.println("Código não encontrado!");
            System.out.println("Deseja procurar novamente? ");
            resp = tc.next().toUpperCase().charAt(0);

        } while (resp == 'S');

        return (registro1);

    }




    public static void listarRegistro (Registro registro1) {

        for (int i=0; i<(registro1.TamanhoLista + 1); i++) {
            System.out.println(registro1.lista[i]);
        }

    }




    public static void listarMedia(Registro registro1) {

        float media;

        System.out.println("Média dos alunos!");
        for (int i=0; i<(registro1.TamanhoLista + 1); i++) {
            media = (registro1.lista[i].G1 + (registro1.lista[i].G2 * 2)) / 3;
            System.out.println(registro1.lista[i].nome + " = " + media);
            media = 0;
        }

    }


}
