public class DadosAluno {

    int codigo;
    String nome;
    long telefone;
    String email;
    float G1;
    float G2;


    @Override
    public String toString() {
        return "Aluno (" +
                "Codigo: " + codigo +
                ", Nome: " + nome +
                ", Telefone: " + telefone +
                ", Email: " + email +
                ", G1: " + G1 +
                ", G2: " + G2 +
                ')';
    }
}
