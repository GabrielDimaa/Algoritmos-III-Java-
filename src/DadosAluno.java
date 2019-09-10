public class DadosAluno {

    int codigo;
    String nome;
    int telefone;
    String email;
    float G1;
    float G2;


    @Override
    public String toString() {
        return "DadosAluno{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", email='" + email + '\'' +
                ", G1=" + G1 +
                ", G2=" + G2 +
                '}';
    }
}
