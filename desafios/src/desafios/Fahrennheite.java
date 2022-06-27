package desafios;

import javax.swing.JOptionPane;

public class Fahrennheite {

    public static void main(String[] args) {
        
        String escolha = JOptionPane.showInputDialog("Qual temperatura você quer converter? (C) para celsius e (F) para fahrenheite");
        
        String temperatura = JOptionPane.showInputDialog("Digite a temperatura em Fahrennheit que será convertido para Celsius");

        float temp = Float.parseFloat(temperatura);

        // Lógica
        float resul = "C".equals(escolha) ? 9 * temp / 5 + 32 : 0;
        resul = "F".equals(escolha) ? 5 * (temp - 32) / 9 : resul; 

        System.out.printf("A temperatura equivalente é %.2f", resul);

    }
}
