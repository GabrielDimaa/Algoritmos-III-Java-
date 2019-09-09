import java.util.Scanner;

public class Mes {

    public static String getMesPorExtenso () {

        Scanner tc = new Scanner (System.in);

        int mes, idioma;
        String[] portugues = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String[] ingles = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("Digite o mês: ");
        mes = tc.nextInt();
        mes--;
        System.out.println("Escolha o idioma: ");
        System.out.println("1 - Português");
        System.out.println("2 - Inglês");
        idioma = tc.nextInt();

        if (idioma == 1) {
            return portugues[mes];
        }

        else {
            return ingles[mes];
        }

    }

}
