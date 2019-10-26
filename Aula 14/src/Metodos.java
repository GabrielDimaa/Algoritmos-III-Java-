import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

//Criar cliente

    public static ArrayList addCliente(ArrayList<Conta> banco) {
        Scanner tc = new Scanner(System.in);

        int idade;
        String nome;
        boolean data, cpf;

        System.out.println("Nome do titular: ");
        nome = tc.nextLine();

        idade = idade();
        while (idade < 16) {
            System.out.println("Idade sem permissão para conta!");
            idade = idade();
        }

        Conta novaConta = new Conta(nome, idade);

        System.out.println("Data de nascimento: ");
        novaConta.pessoa.dataNascimento = tc.nextLine();
        data = validaData(novaConta.pessoa.dataNascimento);
        while (data == false) {
            System.out.println("Data incorreta! ");
            System.out.println("Data de nascimento: ");
            novaConta.pessoa.dataNascimento = tc.nextLine();
            data = validaData(novaConta.pessoa.dataNascimento);
        }

        System.out.println("CPF (Com '.' e '-'): ");
        novaConta.pessoa.cpf = tc.nextLine();
        cpf = validaCpf(novaConta.pessoa.cpf);
        if (cpf == true) {
            cpf = procuraCpf(novaConta.pessoa.cpf, banco);
        }
        while (cpf == false) {
            System.out.println("CPF incorreto! ");
            System.out.println("CPF (Com '.' e '-'): ");
            novaConta.pessoa.cpf = tc.nextLine();
            cpf = validaCpf(novaConta.pessoa.cpf);
            if (cpf == true) {
                cpf = procuraCpf(novaConta.pessoa.cpf, banco);
            }
        }

        novaConta.agencia = gerarAgencia();
        System.out.println("Agência: " + novaConta.agencia);

        novaConta.numConta = gerarNumConta(novaConta, banco);
        System.out.println("Número da conta: " + novaConta.numConta);

        novaConta.senha = criarSenha();
        System.out.println("Senha salva");

        novaConta.limite = limite(novaConta.pessoa.idade);
        novaConta.limiteUsado = novaConta.limite;

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
                            dadoAux.depositar();
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

                idade = idade();
                while (idade < 16) {
                    System.out.println("Idade sem permissão para conta!");
                    idade = idade();
                }

                dadoAux.senha = criarSenha();
                System.out.println("Senha salva");

                dadoAux.limite = limite(dadoAux.pessoa.idade);

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

// Métodos p/ gerar e validar

    public static String gerarAgencia() {
        String agencia = new String(), aux;
        int sorteio;

        for (int i = 0; i < 4; i++) {
            sorteio = (int) (Math.random() * 9);
            aux = Integer.toString(sorteio);
            agencia = agencia + aux;
        }
        return (agencia);
    }

    public static String gerarNumConta(Conta contaAux, ArrayList banco) {
        boolean valida;
        String numConta = new String(), aux;
        int sorteio;

        do {
            for (int i = 0; i < 8; i++) {
                if (i == 7) {
                    numConta = numConta + "-";
                }
                sorteio = (int) (Math.random() * 9);
                aux = Integer.toString(sorteio);
                numConta = numConta + aux;
            }
            contaAux.numConta = numConta;
            boolean numContaExiste = banco.contains(contaAux.numConta);
            if (numContaExiste == true) {
                valida = false;
            } else {
                valida = true;
            }
        } while (valida == false);
        return (contaAux.numConta);
    }

    public static float limite(int idade) {
        float valorLimite;
        if (idade > 60) {
            valorLimite = -1000;
        } else if (idade < 18 && idade >= 16) {
            valorLimite = -100;
        } else {
            valorLimite = -300;
        }
        return (valorLimite);
    }

    public static String criarSenha() {
        Scanner tc = new Scanner(System.in);

        String senha = null;
        String confirma = null;
        boolean valida = false;

        do {
            System.out.println("Digite sua senha: ");
            senha = tc.next();
            System.out.println("Confirme sua senha: ");
            confirma = tc.next();
            if (senha.equals(confirma)) {
                if (senha.length() == 4) {
                    valida = true;
                    return (senha);
                }
            } else {
                System.out.println("Senha inválida!");
                valida = false;
            }
        } while (valida == false);
        return (senha);
    }

    public static boolean validaData(String data) {
        boolean valida = data.matches("\\d\\d/\\d\\d/\\d\\d\\d\\d");
        if (valida == true) {
            return (true);
        }
        return (false);
    }

    public static boolean validaCpf(String cpf) {
        boolean valida = cpf.matches("\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d");
        if (valida == true) {
            return (true);
        } else {
            return (false);
        }
    }

    public static boolean procuraCpf(String cpf, ArrayList<Conta> banco) {

        for (Conta x : banco) {
            if (x.pessoa.cpf.equals(cpf)) {
                return (false);
            }
            else {
                return (true);
            }
        }
        return (true);
    }

    public static int idade() {
        Scanner tc = new Scanner(System.in);
        boolean valida = true;
        int numero = 0;
        do {
            System.out.println("Idade: ");
            try {
                numero = Integer.parseInt(tc.nextLine());
                return (numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite apenas números!");
                valida = false;
            }
        } while (valida != true);
        return (numero);
    }

}
