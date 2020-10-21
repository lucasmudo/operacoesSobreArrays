public class Questao6 {
    private byte[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public void getQtdDias(int mes) {
        mes--; //Subtraindo 1 cada número corresponde ao seu mês, por exemplo: 1-Janeiro ao invés de 0-Janeiro
        System.out.println(diasPorMes[mes]);
    }

    public static void main(String[] args) {
        Questao6 q6 = new Questao6();

        q6.getQtdDias(2);
    }
}
