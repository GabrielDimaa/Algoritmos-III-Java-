import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        String login = new String();
        String senha = new String();
        int i=1;

        Scanner tc = new Scanner(System.in);

        System.out.println("Login: ");
        login = tc.next();
        System.out.println("Senha: ");
        senha = tc.next();

        if (login.intern() != "java8" && senha.intern() != "java8") {
            do {
                System.out.println("Login ou senha INCORRETOS!");
                System.out.println("Login: ");
                login = tc.next();
                System.out.println("Senha: ");
                senha = tc.next();
                i++;
                if (i >= 4){
                    break;
                }
            } while (i < 4);
        }

        else{
            System.out.println("Acesso autorizado!");
        }

    }


}

