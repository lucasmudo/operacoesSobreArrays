import javax.swing.*;


public class QuadradoMagico {
    public static boolean eQuadradoMagico(int[][] matriz){
        int somaLinhas=0;
        int somaColunas=0;
        int somaPrincipal=0;
        int somaSecundaria=0;
        int k= matriz.length -1;

//      Soma da diagonal principal
        for (int i=0; i<matriz.length; i++){
            somaPrincipal += matriz[i][i];
        }

//      Soma da diagonal secundaria
        for (int i=0; i< matriz.length; i++){
            somaSecundaria+=matriz[i][k];
            k--;
        }
        if (somaSecundaria!=somaPrincipal){
            return false;
        }

//      Soma das linhas e colunas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                somaLinhas += matriz[i][j];
                somaColunas += matriz[j][i];
            }
            if(somaLinhas != somaPrincipal){
                return false;
            }else if(somaColunas!=somaPrincipal){
                return false;
            }
            somaColunas=0;
            somaLinhas=0;
        }

        return true;
    }
}
class TestaQuadradoMagico{
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int input = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                matriz[i][j]=input;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(QuadradoMagico.eQuadradoMagico(matriz));

    }
}
