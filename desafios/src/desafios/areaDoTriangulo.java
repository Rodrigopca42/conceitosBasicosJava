package desafios;

import javax.swing.JOptionPane;

public class areaDoTriangulo {
    public static void main(String[] args) {
        String base = JOptionPane.showInputDialog("Digite o valor da base em cm");
        String altura = JOptionPane.showInputDialog("Digite o valor da altura em cm");

        double base1 = Double.parseDouble(base);
        double altura1 = Double.parseDouble(altura);

        double area = base1 * altura1 / 2;

        System.out.printf("A área do trianglo é %.2f cm", area);
    }
}
