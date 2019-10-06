import java.util.Scanner;

public class Data {

    Scanner tc = new Scanner(System.in);

    int dia, mes, ano;

    public void lerData(){
        System.out.println("Dia: ");
        dia = tc.nextInt();
        System.out.println("Mês: ");
        mes = tc.nextInt();
        System.out.println("Ano: ");
        ano = tc.nextInt();
        mes();
        dia();
    }

    public void dia() {
        if (mes == 2){
            while (dia <= 0 || dia > 28) {
                System.out.println("Dia inválido!");
                System.out.println("Dia: ");
                dia = tc.nextInt();
            }
        }
        else {
            while (dia <= 0 || dia > 31) {
                System.out.println("Dia inválido!");
                System.out.println("Dia: ");
                dia = tc.nextInt();
            }
        }
    }

    public void mes() {
        while (mes <= 0 || mes > 12) {
            System.out.println("Mês inválido!");
            System.out.println("Mês: ");
            mes = tc.nextInt();
        }
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
}
