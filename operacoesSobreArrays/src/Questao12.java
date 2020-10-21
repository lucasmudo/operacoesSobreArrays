import java.util.Arrays;

public class Questao12 {
    private int[] array = {1,2,3,4,5};
    private boolean[] arrayBool = {true, true, true, true, true};

    public void modificaArray(int indice, int novoNumero){
        if (arrayBool[indice]){
            array[indice]=novoNumero;
            arrayBool[indice]=false;
        }
    }

    public String getArray() {
        return Arrays.toString(array);
    }
}

class TestaQuestao12{
    public static void main(String[] args) {
        Questao12 ref1 = new Questao12();
        System.out.println("Array original ref1: " + ref1.getArray());
        ref1.modificaArray(0, 5);
        System.out.println("Array modificado ref1: " + ref1.getArray());
        ref1.modificaArray(0, 8);
        System.out.println("Tentativa de modificação do mesmo valor ref1: " + ref1.getArray() + "\n");

        Questao12 ref2 = new Questao12();
        System.out.println("Array original ref2: " + ref2.getArray());
        ref2.modificaArray(0, 8);
        System.out.println("Array modificado ref2: " + ref2.getArray());
        ref2.modificaArray(0, 15);
        System.out.println("Tentativa de modificação do mesmo valor ref2: " + ref2.getArray());


    }
}

