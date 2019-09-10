import java.util.Scanner;

public class FuncaoLista {


    public static Registro criarLista () {

        Scanner tc = new Scanner(System.in);

        Registro registro1 = new Registro();
        int i = 0;
        char resp = 0;

        do {

                DadosAluno aluno1 = new DadosAluno();

                System.out.println("Código: ");
                aluno1.codigo = tc.nextInt();
                System.out.println("Nome: ");
                aluno1.nome = tc.next();
                System.out.println("Telefone: ");
                aluno1.telefone = tc.nextInt();
                System.out.println("Email: ");
                aluno1.email = tc.next();
                System.out.println("Nota G1: ");
                aluno1.G1 = tc.nextFloat();
                System.out.println("Nota G2: ");
                aluno1.G2 = tc.nextFloat();

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

        DadosAluno aluno1 = new DadosAluno();

        System.out.println("Código: ");
        aluno1.codigo = tc.nextInt();
        System.out.println("Nome: ");
        aluno1.nome = tc.next();
        System.out.println("Telefone: ");
        aluno1.telefone = tc.nextInt();
        System.out.println("Email: ");
        aluno1.email = tc.next();
        System.out.println("Nota G1: ");
        aluno1.G1 = tc.nextFloat();
        System.out.println("Nota G2: ");
        aluno1.G2 = tc.nextFloat();
        System.out.println("Aluno incluso no final!");

        registro1.TamanhoLista++;
        registro1.lista[registro1.TamanhoLista] = aluno1;

        return (registro1);

    }


    public static void listarRegistro (Registro registro1) {

        System.out.println(registro1.TamanhoLista);
        for (int i=0; i<10; i++) {
            System.out.println(registro1.lista[i]);
        }

    }


}
