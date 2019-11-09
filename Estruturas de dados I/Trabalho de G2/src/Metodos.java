import java.util.Scanner;

public class Metodos {

    Scanner tc = new Scanner(System.in);

    public Aluno criarAluno() {

        Aluno dadoAluno = new Aluno();

        dadoAluno.codigo = Utils.validaNumero("Código: ");
        System.out.println("Nome do aluno: ");
        dadoAluno.nome = tc.next();
        dadoAluno.telefone = Utils.lerTelefone();
        dadoAluno.email = Utils.lerEmail();
        System.out.println("Nota G1: ");
        dadoAluno.g1 = tc.nextDouble();
        System.out.println("Nota G2: ");
        dadoAluno.g2 = tc.nextDouble();
        dadoAluno.media = (dadoAluno.g1 + (dadoAluno.g2 * 2)) / 3;

        return (dadoAluno);

    }

    public void addFinal(Lista lista) {

        Aluno novoContato;
        Aluno aux;
        char resp;

        System.out.println("Incluir no final");
        do {

            if (lista.quantidade == 0) {
                novoContato = criarAluno();

                novoContato.elo = null;

                lista.primeiro = novoContato;
                lista.ultimo = novoContato;
                lista.quantidade++;

            }
            else {
                aux = lista.primeiro;

                while (aux.elo != null) {
                    aux = aux.elo;
                }
                novoContato = criarAluno();
                novoContato.elo = null;

                aux.elo = novoContato;
                lista.ultimo = novoContato;
                lista.quantidade++;
            }

            System.out.println("Aluno incluído!");
            System.out.println(("Deseja continuar adicionando? (S / N) "));
            resp = tc.next().toUpperCase().charAt(0);

        } while (resp == 'S');

    }

    public void addInicio(Lista lista) {

        Aluno novoAluno;
        Aluno aux;
        char resp;

        System.out.println("Incluir no início");
        do {

            if (lista.quantidade == 0) {
                novoAluno = criarAluno();

                novoAluno.elo = null;

                lista.primeiro = novoAluno;
                lista.ultimo = novoAluno;
                lista.quantidade++;

            }
            else {
                aux = lista.primeiro;
                novoAluno = criarAluno();
                novoAluno.elo = aux;
                lista.primeiro = novoAluno;
                lista.quantidade++;
            }

            System.out.println("Aluno incluído!");
            System.out.println(("Deseja continuar adicionando? (S / N) "));
            resp = tc.next().toUpperCase().charAt(0);

        } while (resp == 'S');

    }

    public void addAposNome(Lista lista) {

        Aluno aux;
        Aluno novoAluno;
        String nome;

        System.out.println("Incluir após um nome");
        System.out.println("Nome: ");
        nome = tc.next();

        aux = lista.primeiro;
        while (aux.elo != null) {
            if (nome.toUpperCase().equals(aux.nome.toUpperCase())) {
                novoAluno = criarAluno();
                novoAluno.elo = aux.elo;
                aux.elo = novoAluno;
                lista.quantidade++;
                System.out.println("Aluno incluído após " + nome);
                if (novoAluno.elo == null) {
                    lista.ultimo = novoAluno;
                }
                break;
            }
            else {
                aux = aux.elo;
                if (aux.elo == null) {
                    System.out.println("Aluno não encontrado!");
                }
            }
        }

    }

    public void consultarNome(Lista lista) {

        Aluno aux;
        String nome;

        System.out.println("Consultar por nome");
        System.out.println("Nome: ");
        nome = tc.next();

        aux = lista.primeiro;
        while (aux.elo != null) {
            if (nome.toUpperCase().equals(aux.nome.toUpperCase())) {
                System.out.println("--------------------");
                System.out.println("Nome: " + aux.nome);
                System.out.println("Código: " + aux.codigo);
                System.out.println("Telefone: " + aux.telefone);
                System.out.println("Email: " + aux.email);
                System.out.println("Nota G1: " + aux.g1);
                System.out.println("Nota G2: " + aux.g2);
                System.out.println("Média das notas: " + aux.media);
                System.out.println("--------------------");
                break;
            }
            else {
                aux = aux.elo;
                if (aux.elo == null) {
                    System.out.println("Aluno não encontrado!");
                }
            }
        }

    }

    public void excluirInicio(Lista lista) {

        Aluno aux;

        aux = lista.primeiro;
        lista.primeiro = aux.elo;
        lista.quantidade--;

    }

    public void excluirFim(Lista lista) {

        System.out.println("Excluir do fim");

        Aluno aux = lista.primeiro;
        Aluno remover = lista.ultimo;

        if (lista.quantidade == 0) {
            System.out.println("Lista vazia!");
        }
        else if (lista.quantidade == 1) {
            lista.primeiro = null;
            lista.ultimo = null;
            lista.quantidade--;
        }

        while (aux.elo != lista.ultimo) {
            if (aux.elo == remover) {
                aux.elo = null;
                lista.quantidade--;
                lista.ultimo = aux;
                System.out.println("Aluno removido!");
            } else {
                aux = aux.elo;
            }
        }


    }

    public void excluirCodigo(Lista lista) {

        Aluno aux;
        int codigo;

        System.out.println("Excluir por código");
        System.out.println("Código: ");
        codigo = tc.nextInt();

        aux = lista.primeiro;
        if (codigo == aux.codigo) {
            lista.primeiro = aux.elo;
            lista.quantidade--;
            System.out.println("Aluno excluído!");
        }
        else {
            while (aux.elo != null) {
                if (codigo == aux.elo.codigo) {
                    Aluno aux1 = aux.elo;
                    aux.elo = aux1.elo;
                    lista.quantidade--;
                    if (aux.elo == null) {
                        lista.ultimo = aux;
                    }
                    System.out.println("Aluno excluído!");
                    break;
                } else {
                    aux = aux.elo;
                    if (aux.elo == null) {
                        System.out.println("Aluno não encontrado!");
                    }
                }
            }
        }

    }

    public void listarRegistros(Lista lista) {

        Aluno percorreLista = lista.primeiro;

        while (percorreLista.elo != null) {
            System.out.println("--------------------");
            System.out.println("Nome: " + percorreLista.nome);
            System.out.println("Código: " + percorreLista.codigo);
            System.out.println("Telefone: " + percorreLista.telefone);
            System.out.println("Email: " + percorreLista.email);
            System.out.println("Nota G1: " + percorreLista.g1);
            System.out.println("Nota G2: " + percorreLista.g2);
            System.out.println("--------------------");

            percorreLista = percorreLista.elo;
        }

    }

    public void listarMedias(Lista lista) {

        Aluno percorreLista = lista.primeiro;

        while (percorreLista.elo != null) {
            System.out.println("--------------------");
            System.out.println("Nome: " + percorreLista.nome);
            System.out.println("Código: " + percorreLista.codigo);
            System.out.println("Telefone: " + percorreLista.telefone);
            System.out.println("Email: " + percorreLista.email);
            System.out.println("Nota G1: " + percorreLista.g1);
            System.out.println("Nota G2: " + percorreLista.g2);
            System.out.println("Média das notas: " + percorreLista.media);
            System.out.println("--------------------");

            percorreLista = percorreLista.elo;
        }

    }

}
