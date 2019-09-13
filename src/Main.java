/*
Descrição do trabalho: Faça a implementação de uma lista armazenada por contiguidade física pra armazenar até
100 registros de alunos. Para cada aluno deve ser armazenado: código, nome, telefone, email, nota g1 e nota g2.
O programa deve ser feito com base na aula sobre lista linear do dia 03/09. Cada nodo, ou nó, da lista deve
conter na parte de informações um registro de alunos.
O programa deve implementar o seguinte menu de opções( cada opção corresponde a uma função);
1 - Criar lista
2 - Incluir no final
3 - Incluir no início
4 - Incluir após um nome(ler um nome, encontrar na lista e incluir na posição posterior)
5 - Consultar por nome (ler um nome e mostrar o registro do nome procurado)
6 - Excluir do início
7 - Excluir do fim
8 - Excluir por código
9 - Listar todos os registros
10 - Listar com médias finais ( listar os nomes dos alunos com suas médias finais calculadas)
11- Sair
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        Registro registro1 = new Registro();
        int escolha;

        do {

            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Criar lista");
            System.out.println("2 - Incluir no final");
            System.out.println("3 - Incluir no início");
            System.out.println("4 - Incluir após um nome");
            System.out.println("5 - Consultar por nome");
            System.out.println("6 - Excluir do início");
            System.out.println("7 - Excluir do fim");
            System.out.println("8 - Excluir por código");
            System.out.println("9 - Listar todos os registros");
            System.out.println("10 - Listar com médias finais");
            System.out.println("11 - Sair");
            escolha = tc.nextInt();

            switch (escolha) {

                case 1:
                    registro1 = FuncaoLista.criarLista();
                    break;

                case 2:
                    registro1 = FuncaoLista.incluirFinal(registro1);
                    break;

                case 3:
                    registro1 = FuncaoLista.incluirInicio(registro1);
                    break;

                case 4:
                    registro1 = FuncaoLista.incluirPosNome(registro1);
                    break;

                case 5:
                    FuncaoLista.consultarNome(registro1);
                    break;

                case 6:
                    registro1 = FuncaoLista.excluirInicio(registro1);
                    break;

                case 7:
                    registro1 = FuncaoLista.excluirFim(registro1);
                    break;

                case 8:
                    registro1 = FuncaoLista.excluirCodigo(registro1);
                    break;

                case 9:
                    FuncaoLista.listarRegistro(registro1);
                    break;

                case 10:
                    FuncaoLista.listarMedia(registro1);
                    break;

                default:
                    System.out.println("Programa encerrado!");
                    break;

            }

        } while (escolha != 11);

    }

}
