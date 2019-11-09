/*Descrição do trabalho: Faça a implementação de uma lista encadeada com descritor para armazenar registros de alunos.
Para cada aluno deve ser armazenado: código, nome, telefone, email, nota g1 e nota g2.
O programa deve ser feito com base no exemplo apresentado na aula do dia 28/10.
Cada nodo, ou nó, da lista deve conter na parte de informações um registro de alunos.
O programa deve implementar o seguinte menu de opções( cada opção corresponde a uma função);
1- Incluir no final
2 - Incluir no início
3- Incluir após um nome(ler um nome, encontrar na lista e incluir na posição posterior)
4 - Consultar por nome (ler um nome e mostrar o registro do nome procurado)
5 - Excluir do início
6 - Excluir do fim
7 - Excluir por código
8 - Listar todos os registros
9 - Listar com médias finais ( listar os nomes dos alunos com suas médias finais calculadas)
10- Sair

*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        Lista lista = new Lista();
        Metodos metodos = new Metodos();

        int escolha;

        do {

            System.out.println("Menu:");
            System.out.println("1 - Incluir no final");
            System.out.println("2 - Incluir no início");
            System.out.println("3 - Incluir após um nome");
            System.out.println("4 - Consultar por nome");
            System.out.println("5 - Excluir do início");
            System.out.println("6 - Excluir do fim");
            System.out.println("7 - Excluir por código");
            System.out.println("8 - Listar todos os registros");
            System.out.println("9 - Listar com médias finais ");
            System.out.println("10 - Sair");
            escolha = tc.nextInt();

            switch (escolha) {

                case 1:
                    metodos.addFinal(lista);
                    break;

                case 2:
                    metodos.addInicio(lista);
                    break;

                case 3:
                    metodos.addAposNome(lista);
                    break;

                case 4:
                    metodos.consultarNome(lista);
                    break;

                case 5:
                    metodos.excluirInicio(lista);
                    break;

                case 6:
                    metodos.excluirFim(lista);
                    break;

                case 7:
                    metodos.excluirCodigo(lista);
                    break;

                case 8:
                    metodos.listarRegistros(lista);
                    break;

                case 9:
                    metodos.listarMedias(lista);
                    break;

                default:
                    break;

            }

        } while (escolha != 10);


    }

}
