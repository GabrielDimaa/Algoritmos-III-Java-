import java.util.Scanner;

public class Conta {

    Scanner tc = new Scanner(System.in);

    public Cliente pessoa;
    public String agencia;
    public String numConta;
    public int senha;
    public float saldo;
    public float limite;


    public void verSaldo() {
        System.out.println("Seu saldo = " + saldo);
    }

    public float depositar() {
        float deposito;
        System.out.println("Valor do depósito: ");
        deposito = tc.nextFloat();
        saldo = saldo + deposito;
        return (saldo);
    }

}
