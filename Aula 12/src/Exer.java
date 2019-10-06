public class Exer {

    public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo();
        triangulo1.leitura();
        triangulo1.exibicao();
        triangulo1.area();

        Data data1 = new Data();
        data1.lerData();
        System.out.println(data1);

        Hora hora1 = new Hora();
        hora1.lerHora();
        System.out.println(hora1);

    }

}
