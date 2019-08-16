import javax.swing.*;

public class Exer02 {

    public static void main(String[] args) {

        double ValorVenal;
        double ValorNegociado;
        double imposto;
        double ValorPago;
        String tc;

        tc = JOptionPane.showInputDialog("Valor da transação: ");
        ValorNegociado = Double.parseDouble(tc);
        tc = JOptionPane.showInputDialog("Valor venal: ");
        ValorVenal = Double.parseDouble(tc);
        tc = JOptionPane.showInputDialog("Imposto: ");
        imposto = Double.parseDouble(tc);

        if (ValorNegociado > ValorVenal){
            ValorPago = ValorNegociado * (imposto/100);
        }
        else{
            ValorPago = ValorVenal * (imposto/100);
        }

        JOptionPane.showMessageDialog(null, "Valor à ser pago é: " + ValorPago);



    }

}
