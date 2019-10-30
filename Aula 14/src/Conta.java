import javax.swing.plaf.SeparatorUI;
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

    public void depositar(float valor) {
        float aux;
        if (limiteUsado < limite) {
            if (valor > (saldo*1)) {
                saldo = saldo + valor;
                limiteUsado = valor - saldo;
            }
            else {
                saldo = saldo + valor;
                limiteUsado = limiteUsado + valor;
            }
        }
        else {
            saldo = saldo + valor;
        }
    }

    public float sacar() {
        float saque;

        float saldo;
        if (this.saldo < 0) {
            saldo = limiteUsado;
        }
        else {
            saldo = this.saldo + limiteUsado;
        }
        System.out.println("Valor: ");
        saque = tc.nextFloat();
        while (saque > saldo) {
            System.out.println("Você não tem limite para isso!");
            System.out.println("Seu limite é R$" + this.limiteUsado);
            if (limiteUsado <= 0) {
                return (0);
            }
            System.out.println("Valor: ");
            saque = tc.nextFloat();
        }
        if (saque > this.saldo) {
            this.limiteUsado = saldo - saque;
            this.saldo = this.saldo - saque;
        }
        else {
            this.saldo = this.saldo - saque;
        }
        return (saque);
    }

    public void extrato() {
        System.out.println("Extrato: " + (saldo + limite));
    }

    public void transferir(ArrayList<Conta> banco) {
        boolean valida;
        float valor;
        String nome;
        String cpf;
        String agencia;
        String numConta;
        String senha;

        valor = sacar();

        if (valor == 0) {
            System.out.println("Tranferência concluída!");
        }
        else {
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

            for (Conta x : banco) {
                if (x.pessoa.nome.toUpperCase().equals(nome.toUpperCase()) && x.pessoa.cpf.
                        equals(cpf) && x.agencia.equals(agencia) && x.numConta.equals(numConta)) {

                    dadoAux = x;

                    dadoAux.depositar(valor);

                    System.out.println("Digite sua senha: ");
                    senha = tc.nextLine();
                    if (!senha.equals(this.senha)) {
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Senha incorreta (tentativa " + i + 1 + "/3");
                            System.out.println("Digite novamente: ");
                            senha = tc.nextLine();
                            if (senha.equals(this.senha)) {
                                System.out.println("Tranferência concluída!");
                                break;
                            }
                        }
                    } else {
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

