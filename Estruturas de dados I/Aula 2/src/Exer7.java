import java.util.Scanner;

public class Exer7 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int mes;

        System.out.println("Digite um mês: ");
        mes = tc.nextInt();
        mes = mes - 1;

        System.out.println(meses[mes]);

    }

}
