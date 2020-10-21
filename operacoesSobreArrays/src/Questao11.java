import javax.swing.*;

public class Questao11 {
    public static void main(String[] args) {
        double[][] matriz = new double[2][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                String input = JOptionPane.showInputDialog("Digite qualquer número: ");

                matriz[i][j] = Double.parseDouble(input);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("|");
        }

        double a=matriz[0][0] * matriz[1][1];
        double b=matriz[0][1] * matriz[1][0];
        double determinante = a - b; //(x00 * x11) - (x01 * x10)
        System.out.println("A determinante é: " + determinante);



    }
}
