package desafios;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class quadradoECubo {
    public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog("Digite um valor qualquer");

        double num1 = Double.parseDouble(numero);

        double quadrado = Math.pow(num1, 2);
        double cubo = Math.pow(num1, 3);

        System.out.printf("O quadrado é %.2f e o cubo é %.2f" , quadrado, cubo);

    }
}
