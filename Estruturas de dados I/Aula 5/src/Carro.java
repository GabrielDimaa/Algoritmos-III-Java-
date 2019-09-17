public class Carro{

    String modelo;
    String placa;
    String cor;


    @Override
    public String toString() {
        return "Veículo ("
                + "modelo: " + modelo
                + ", placa: " + placa
                + ", cor: " + cor
                + ')';
    }
}
