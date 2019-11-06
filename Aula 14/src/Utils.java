import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    public static Scanner tc = new Scanner(System.in);

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
            valorLimite = 1000;
        } else if (idade < 18 && idade >= 16) {
            valorLimite = 100;
        } else {
            valorLimite = 300;
        }
        return (valorLimite);
    }

    public static String criarSenha() {
        Scanner tc = new Scanner(System.in);

        String senha;
        String confirma;
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

    public static String cpf(ArrayList<Conta> banco) {
        String cpf;
        boolean valida, verifica = false;
        do {
            System.out.println("CPF (Com '.' e '-'): ");
            cpf = tc.nextLine();
            valida = validaCpf(cpf);
           if (valida == true) {
               verifica = procuraCpf(cpf, banco);
               if (verifica == true) {
                   return (cpf);
               }
               else {
                   System.out.println("CPF inválido!");
                   valida = false;
               }
           }
           else {
               System.out.println("CPF inválido!");
               valida = false;
           }
        } while (valida == false);
        return null;
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
