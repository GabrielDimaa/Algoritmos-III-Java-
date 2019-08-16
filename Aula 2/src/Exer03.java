import javax.swing.*;

public class Exer03 {

    public static void main(String[] args) {

        double p1;
        double p2;
        double trabalho;
        double media;
        String tc;

        tc = JOptionPane.showInputDialog("Digite o resultado da prova 1: ");
        p1 = Double.parseDouble(tc);
        tc = JOptionPane.showInputDialog("Digite o resultado da prova 2: ");
        p2 = Double.parseDouble(tc);
        tc = JOptionPane.showInputDialog("Digite o resultado do trabalho: ");
        trabalho = Double.parseDouble(tc);

        media = (p1 + p2 + trabalho) / 3;

        if (media >= 6){
            JOptionPane.showMessageDialog(null, "Sua média: " + media);
            JOptionPane.showMessageDialog(null, "APROVADO!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Sua média: " + media);
            JOptionPane.showMessageDialog(null, "REPROVADO!");
        }

    }

}

