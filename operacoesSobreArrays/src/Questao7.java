public class Questao7 {
    public static void main(String[] args) {
        int[][] tabuada = new int[10][10];

        for (int i = 0; i < tabuada.length; i++) {
            for (int j = 0; j < tabuada.length; j++) {
                tabuada[i][j] = i + j;
            }
        }

        System.out.println(tabuada[7][9]);


    }
}
