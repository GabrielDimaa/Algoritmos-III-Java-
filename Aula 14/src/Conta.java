import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Conta {

    Scanner tc = new Scanner(System.in);

    public Cliente pessoa = new Cliente();
    public String agencia;
    public String numConta;
    public String senha;
    public float saldo;
    public float limite;
    public float limiteUsado;

//Construtor

    public Conta(String nome, int idade) {
        this.pessoa.nome = nome;
        this.pessoa.idade = idade;
    }

    public Conta(String numConta, String senha) {
        this.numConta = numConta;
        this.senha = senha;
    }

    public Conta(String numConta, String cpf, String agencia) {
        this.numConta = numConta;
        this.pessoa.cpf = cpf;
        this.agencia = agencia;
    }

    public Conta() {}

//Métodos

    public void verSaldo() {
        System.out.println("Seu saldo = R$ " + saldo);
    }

    public void depositar() {
        float deposito;
        System.out.println("Valor do depósito: ");
        deposito = tc.nextFloat();
        saldo = saldo + deposito;
        verSaldo();
    }

    public void sacar() {
        float saque, aux, aux1;
        System.out.println("Valor do saque: ");
        saque = tc.nextFloat();
        if (saque > saldo) {
            aux = saldo - saque;
            while (aux < limite) {
                aux = 0;
                if (limiteUsado == 0) {
                    System.out.println("Você não não tem mais limite!");
                    break;
                }
                else {
                    System.out.println("Você não tem limite para esse saque!");
                    System.out.println("Seu limite é: R$" + (limiteUsado * -1));
                    System.out.println("Valor do saque: ");
                    saque = tc.nextFloat();
                    aux = saldo - saque;
                }
            }
            saldo = aux;
            if (saldo < 0) {
                aux = 0 - saque;
            }
            aux1 = limiteUsado - aux;
            limiteUsado = aux1;
        }
        else {
            saldo = saldo - saque;
        }

        verSaldo();
    }

    public void extrato() {
        if (limiteUsado != limite) {
            System.out.println("Extrato: " + (limite - limiteUsado));
        }
        else {
            System.out.println("Extrato: " + (saldo + (limite * -1)));
        }
    }

    public void transferir(ArrayList<Conta> banco) {
        boolean valida;
        String nome;
        String cpf;
        String agencia;
        String numConta;
        String senha;
        float valor, aux, aux1;

        System.out.println("Valor da transferência: ");
        valor = tc.nextFloat();
        if (valor > saldo) {
            aux = saldo - valor;
            while (aux < limite) {
                aux = 0;
                if (limiteUsado == 0) {
                    System.out.println("Você não não tem mais limite!");
                    break;
                }
                else {
                    System.out.println("Você não tem limite para esse saque!");
                    System.out.println("Seu limite é: R$" + (limiteUsado * -1));
                    System.out.println("Valor da transferência: ");
                    valor = tc.nextFloat();
                    aux = saldo - valor;
                }
            }
            saldo = aux;
            if (saldo < 0) {
                aux = 0 - valor;
            }
            aux1 = limiteUsado - aux;
            limiteUsado = aux1;
        }
        else {
            saldo = saldo - valor;
        }


        System.out.println("CPF (Com '.' e '-'): ");
        cpf = tc.nextLine();
        valida = Metodos.validaCpf(cpf);
        while (valida == false) {
            System.out.println("CPF incorreto! ");
            System.out.println("CPF (Com '.' e '-'): ");
            cpf = tc.nextLine();
            valida = Metodos.validaCpf(cpf);
        }

        System.out.println("Nome do titular: ");
        nome = tc.nextLine();

        System.out.println("Agência: ");
        agencia = tc.nextLine();

        System.out.println("Número da conta: ");
        numConta = tc.nextLine();

        Conta dadoAux;
        boolean validaTransf = false;

        for (Conta x : banco){
            if (x.pessoa.nome.toUpperCase().equals(nome.toUpperCase()) && x.pessoa.cpf.
                    equals(cpf) && x.agencia.equals(agencia) && x.numConta.equals(numConta)) {

                dadoAux = x;

                dadoAux.saldo = dadoAux.saldo + valor;

                System.out.println("Digite sua senha: ");
                senha = tc.nextLine();
                if (!senha.equals(this.senha)) {
                    for (int i=0; i<3; i++) {
                        System.out.println("Senha incorreta (tentativa " + i+1 + "/3");
                        System.out.println("Digite novamente: ");
                        senha = tc.nextLine();
                        if (senha.equals(this.senha)) {
                            System.out.println("Tranferência concluída!");
                            break;
                        }
                    }
                }
                else {
                    System.out.println("Tranferência concluída!");
                    validaTransf = true;
                }
                break;

            }

        }

        if (validaTransf == false) {
            System.out.println("Conta não encontrada!");
        }

    }

//Override para comparação do equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numConta, conta.numConta) &&
                Objects.equals(senha, conta.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numConta, senha);
    }

}

