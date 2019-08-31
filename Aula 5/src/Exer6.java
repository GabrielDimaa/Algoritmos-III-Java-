public class Exer6 {

    public static void main(String[] args) {

        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int sorteio;

        sorteio = (int) (Math.random() * 12);
        System.out.println(sorteio);
        System.out.println(meses[(sorteio - 1)]);

    }

}
