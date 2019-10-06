import java.util.Scanner;

public class Hora {

    Scanner tc = new Scanner(System.in);

    int hora, minuto, segundo;

    public void lerHora(){
        System.out.println("Hora: ");
        hora = tc.nextInt();
        hora();
        System.out.println("Minuto: ");
        minuto = tc.nextInt();
        minuto();
        System.out.println("Segundo: ");
        segundo = tc.nextInt();
        segundo();
    }

    public void hora() {
        while (hora < 0 || hora > 23) {
            System.out.println("Hora inválida!");
            System.out.println("Hora: ");
            hora = tc.nextInt();
        }
    }

    public void minuto() {
        while (minuto < 0 || minuto > 59) {
            System.out.println("Minuto inválido!");
            System.out.println("Minuto: ");
            minuto = tc.nextInt();
        }
    }

    public void segundo() {
        while (segundo < 0 || segundo > 59) {
            System.out.println("Segundo inválido!");
            System.out.println("Segundo: ");
            segundo = tc.nextInt();
        }
    }

    @Override
    public String toString() {
        return "Hora{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                '}';
    }
}
