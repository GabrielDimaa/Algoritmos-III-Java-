import java.util.Scanner;

public class Metodos {

    Scanner tc = new Scanner(System.in);


    public Conta contaCliente() {
        Conta conta1 = new Conta();
        boolean valida;
        int idade, senha, confirma;

        System.out.println("Nome do titular: ");
        conta1.pessoa.nome = tc.nextLine();
        System.out.println("CPF (Com '.' e '-'): ");
        conta1.pessoa.cpf = tc.nextLine();
        valida = validaCpf(conta1.pessoa.cpf);
        while (valida == false) {
            System.out.println("CPF incorreto! ");
            System.out.println("CPF (Com '.' e '-'): ");
            conta1.pessoa.cpf = tc.nextLine();
            valida = validaCpf(conta1.pessoa.cpf);
        }
        System.out.println("Idade: ");
        idade = tc.nextInt();
        conta1.pessoa.idade = validaNumero(idade);
        conta1.agencia = gerarAgencia();
        System.out.println("Agência: " + conta1.agencia);
        conta1.numConta = gerarNumConta();


        return (conta1);

    }

    public static String gerarAgencia() {
        String agencia = new String(), aux;
        int sorteio;

        for (int i=0; i<4; i++) {
            sorteio = (int) (Math.random() * 9);
            aux = Integer.toString(sorteio);
            agencia = agencia + aux;
        }
        return (agencia);
    }

    public static String gerarNumConta() {
        String numConta = new String(), aux;
        int sorteio;

        for (int i=0; i<8; i++) {
            if (i == 7) {
                numConta = numConta + "-";
            }
            sorteio = (int) (Math.random() * 9);
            aux = Integer.toString(sorteio);
            numConta = numConta + aux;
        }
        return (numConta);
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
        return(senha);
    }





    public static boolean validaCpf(String cpf) {
        boolean valida = cpf.matches("\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d");
        if (valida == true) {
            return (true);
        }
        return (false);
    }

    public static int validaNumero(int numero) {
        Scanner tc = new Scanner(System.in);
        boolean valida = true;
        do {
            System.out.println("Digite um valor: ");
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
