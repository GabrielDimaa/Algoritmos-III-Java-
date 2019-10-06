import java.util.Scanner;

public class Triangulo {

    Scanner tc = new Scanner(System.in);

    double altura;
    double base;

    public void leitura() {
        System.out.println("Base: ");
        base = tc.nextDouble();
        System.out.println("Altura: ");
        altura = tc.nextDouble();
    }

    public void exibicao() {
        System.out.println("Base = " + base);
        System.out.println("Altura = " + altura);
    }

    public void area() {
        double calcular;
        calcular = (base * altura) / 2;
        System.out.println("Área = " + calcular);
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }

}
