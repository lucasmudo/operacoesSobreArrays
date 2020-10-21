import java.util.Arrays;

public class Questao13 {
    private int[] array= {1,2,3,4,5};
    private int[] arrayQtd=new int[5];

    public Questao13(int qtd){
        for(int i=0;i<arrayQtd.length;i++){
            arrayQtd[i]=qtd;
        }
    }


    public String getArray() {
        return Arrays.toString(array);
    }

    public void modificaArray(int indice, int novoNumero){
        if (arrayQtd[indice] > 0){
            array[indice]=novoNumero;
            arrayQtd[indice]--;
        }

    }
}

class TestaQuestao13{
    public static void main(String[] args) {
        Questao13 ref1 = new Questao13(2);
        System.out.println("Original: " + ref1.getArray());
        ref1.modificaArray(0, 5);
        System.out.println("Primeira modificação: " + ref1.getArray());
        ref1.modificaArray(0, 6);
        System.out.println("Segunda modificação: " + ref1.getArray());
        ref1.modificaArray(0, 8);
        System.out.println("Terceira modificação: " + ref1.getArray());

        ref1.modificaArray(1, 8);
        System.out.println("Modificando outra posição: " + ref1.getArray());
    }
}
