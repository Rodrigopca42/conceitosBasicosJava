package desafios;

import javax.swing.JOptionPane;

public class imc {

    public static void main(String[] args) {
        String peso = JOptionPane.showInputDialog("Digite o peso");
        String altura = JOptionPane.showInputDialog("Digite a altura");

        float peso1 = Float.parseFloat(peso);
        float altura1 = Float.parseFloat(altura);

        // Lógica

        float imc = peso1 / (altura1 * altura1) ;

        System.out.printf("O IMC é %.2f", imc);
    }
}
