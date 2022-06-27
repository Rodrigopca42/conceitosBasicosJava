package desafios;

import javax.swing.JOptionPane;

public class equacaoDoSegundoGrau {
     public static void main(String[] args) {
        
        String a = JOptionPane.showInputDialog("Digite o valor de A");
        String b = JOptionPane.showInputDialog("Digite o valor de B");
        String c = JOptionPane.showInputDialog("Digite o valor de C");

        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int c1 = Integer.parseInt(c);

        int delta = (int)Math.pow(b1, 2) - 4 * a1 * c1; 

    System.out.printf("O valor de Delta é: %d \n", delta);
        
        int raiz =(int) Math.sqrt(delta);
        System.out.println(raiz);
        int x1 = (- b1 + raiz) / (2 * a1);
        int x2 = (- b1 - raiz) / (2 * a1);
        
    System.out.printf("O resultado de X1 é %d, e o resultado de X2 é %d", x1, x2);
     }
}
