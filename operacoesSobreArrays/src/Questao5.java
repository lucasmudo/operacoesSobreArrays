import javax.swing.*;

public class Questao5 {
    public static void main(String[] args) {
        Boolean[][] vetor = new Boolean[2][2];

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                String input = JOptionPane.showInputDialog("Digite 0 para False e qualquer outro numero inteiro para True: ");
                boolean converteInput = true;
                if (Integer.parseInt(input) == 0) {
                    converteInput = false;
                }
                vetor[i][j] = converteInput;
            }
        }

        int contaTrue = 0;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {

                if (vetor[i][j]) {
                    contaTrue++;
                }

                System.out.println(vetor[i][j] + ", ");
            }
        }

        System.out.println("A quaantidade de Trues é:" + contaTrue);
    }
}
