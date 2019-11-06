import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

//Criar cliente

    public static ArrayList addCliente(ArrayList<Conta> banco) {
        Scanner tc = new Scanner(System.in);

        int idade;
        String nome;
        boolean data;

        System.out.println("Nome do titular: ");
        nome = tc.nextLine();

        idade = Utils.idade();
        while (idade < 16) {
            System.out.println("Idade sem permissão para conta!");
            idade = Utils.idade();
        }

        Conta novaConta = new Conta(nome, idade);

        System.out.println("Data de nascimento: ");
        novaConta.pessoa.dataNascimento = tc.nextLine();
        data = Utils.validaData(novaConta.pessoa.dataNascimento);
        while (data == false) {
            System.out.println("Data incorreta! ");
            System.out.println("Data de nascimento: ");
            novaConta.pessoa.dataNascimento = tc.nextLine();
            data = Utils.validaData(novaConta.pessoa.dataNascimento);
        }

        novaConta.pessoa.cpf = Utils.cpf(banco);

        novaConta.agencia = Utils.gerarAgencia();
        System.out.println("Agência: " + novaConta.agencia);

        novaConta.numConta = Utils.gerarNumConta(novaConta, banco);
        System.out.println("Número da conta: " + novaConta.numConta);

        novaConta.senha = Utils.criarSenha();
        System.out.println("Senha salva");

        novaConta.limite = Utils.limite(novaConta.pessoa.idade);
        novaConta.limiteDisponivel = novaConta.limite;

        banco.add(novaConta);

        return (banco);

    }

//Operações

    public static void operacoes(ArrayList<Conta> banco) {
        Scanner tc = new Scanner(System.in);

        int escolha;
        String numConta;
        String senha;

        System.out.println("Número da conta: ");
        numConta = tc.nextLine();
        System.out.println("Senha: ");
        senha = tc.nextLine();
        Conta dadoAux = new Conta(numConta, senha);
        Conta s;

        for (Conta x : banco) {
                    if (dadoAux.numConta.equals(x.numConta) && dadoAux.senha.equals(x.senha)) {
                        dadoAux = x;

                do {
                    System.out.println("1 - Ver saldo");
                    System.out.println("2 - Depositar");
                    System.out.println("3 - Transferir");
                    System.out.println("4 - Sacar");
                    System.out.println("5 - Extrato bancário");
                    System.out.println("6 - Sair");
                    escolha = tc.nextInt();
                    switch (escolha) {

                        case 1:
                            dadoAux.verSaldo();
                            break;

                        case 2:
                            System.out.println("Valor do depósito: ");
                            float deposito = tc.nextFloat();
                            dadoAux.depositar(deposito);
                            break;

                        case 3:
                            dadoAux.transferir(banco);
                            break;

                        case 4:
                            dadoAux.sacar();
                            break;

                        case 5:
                            dadoAux.extrato();
                            break;

                        case 6:
                            break;

                    }
                } while (escolha != 6);
                break;

            }
        }

        System.out.println("Conta não encontrada!");

    }

// Atualizar dados

    public static void atualizar(ArrayList<Conta> banco) {
        Scanner tc = new Scanner(System.in);

        String numConta;
        String cpf;
        String agencia;
        boolean valida = false;

        System.out.println("Número da conta: ");
        numConta = tc.nextLine();
        System.out.println("cpf: ");
        cpf = tc.nextLine();
        System.out.println("Agência: ");
        agencia = tc.nextLine();
        Conta dadoAux = new Conta(numConta, cpf, agencia);

        for (Conta x : banco) {
            if (dadoAux.numConta.equals(x.numConta) && dadoAux.pessoa.cpf.equals(x.pessoa.cpf)) {
                dadoAux = x;
                int idade;

                System.out.println("Nome do titular: ");
                dadoAux.pessoa.nome = tc.nextLine();

                idade = Utils.idade();
                while (idade < 16) {
                    System.out.println("Idade sem permissão para conta!");
                    idade = Utils.idade();
                }

                dadoAux.senha = Utils.criarSenha();
                System.out.println("Senha salva");

                dadoAux.limiteDisponivel = Utils.limite(dadoAux.pessoa.idade);
                dadoAux.limite = dadoAux.limiteDisponivel;

                System.out.println("Dados atualizados!");

                valida = true;

            }
        }

        if (valida == false) {
            System.out.println("Conta não encontrada!");
        }

    }

// Remover conta

    public static ArrayList remover(ArrayList<Conta> banco) {
        Scanner tc = new Scanner(System.in);

        String numConta;
        String cpf;
        String agencia;
        boolean valida = false;

        System.out.println("Número da conta: ");
        numConta = tc.nextLine();
        System.out.println("cpf: ");
        cpf = tc.nextLine();
        System.out.println("Agência: ");
        agencia = tc.nextLine();
        Conta dadoAux = new Conta(numConta, cpf, agencia);

        for (Conta x : banco) {
            if (dadoAux.numConta.equals(x.numConta) && dadoAux.pessoa.cpf.equals(x.pessoa.cpf) && dadoAux.agencia.equals(x.agencia)) {
                dadoAux = x;
                banco.remove(dadoAux);
                System.out.println("Conta removida!");
                return (banco);
            }
        }

        if (valida == false) {
            System.out.println("Conta não encontrada!");
        }

        return (banco);
    }

}
