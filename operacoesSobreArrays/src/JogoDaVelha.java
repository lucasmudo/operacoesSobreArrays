import java.util.Scanner;

public class JogoDaVelha {
    private String[][] matriz = new String[3][3];

    public JogoDaVelha() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = "#";
            }
        }
    }

    public void mostrarJogo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean jogar(String jogador, int linha, int coluna) {
        if ((linha < 0) || (linha > 2)) {
            return false;
        }
        if ((coluna < 0) || (coluna > 2)) {
            return false;
        }
        if (matriz[linha][coluna] != "#") {
            return false;
        }
        matriz[linha][coluna] = jogador;
        return true;
    }

    public String verifica() {
        for (int i = 0; i < 3; i++) {
            if ((matriz[i][0] == matriz[i][1]) &&
                    (matriz[i][0] == matriz[i][2])) {
                if (matriz[i][0] != "#") {
                    return matriz[i][0];
                }
            }
        }
        for (int j = 0; j < 3; j++) {
            if ((matriz[0][j] == matriz[1][j]) &&
                    (matriz[0][j] == matriz[2][j]) &&
                    (matriz[0][j] != "#")) {
                return matriz[0][j];
            }
        }
        if ((matriz[0][0] == matriz[1][1]) &&
                (matriz[0][0] == matriz[2][2]) &&
                (matriz[0][0] != "#")) {
            return matriz[0][0];
        }
        if ((matriz[0][2] == matriz[1][1]) &&
                (matriz[0][2] == matriz[2][0]) &&
                (matriz[0][2] != "#")) {
            return matriz[0][2];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == "#") {
                    return "0";
                }
            }
        }
        return "3";
    }
}

class Jogo{
    public static void main(String[] argumentos) {
        Scanner scanner = new Scanner(System.in);
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        String jogador = "X";
        String vencedor = jogoDaVelha.verifica();
        jogoDaVelha.mostrarJogo();
        while (vencedor == "0") {
            System.out.println("Jogador " + jogador);
            System.out.print("Linha: ");
            int linha = scanner.nextInt();
            System.out.print("Coluna: ");
            int coluna = scanner.nextInt();
            if (!jogoDaVelha.jogar(jogador, linha - 1, coluna - 1)) {
                System.out.println("Jogada inválida...");
            } else {
                if (jogador=="X"){
                    jogador="O";
                }else{
                    jogador="X";
                }
            }
            jogoDaVelha.mostrarJogo();
            vencedor = jogoDaVelha.verifica();
        }

        switch (vencedor) {
            case "X" -> System.out.println("O vencedor é o jogador 1(X)");
            case "O" -> System.out.println("O vencedor é o jogador 2(O)");
            case "3" -> System.out.println("Deu Velha");
        }
    }
}