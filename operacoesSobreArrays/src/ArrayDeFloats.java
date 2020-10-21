import java.util.Arrays;

public class ArrayDeFloats {

    private float[] constantes = {100f, 10f, 1f, 0.1f, 0.01f, 0.001f};
    private int[] outroArray = {1, 2, 3, 4, 5, 6};

    public void setConstantes(float[] constantes) {
        this.constantes = constantes;
    }

    public float[] getConstantes() {
        return constantes;
    }

    public int[] getOutroArray() {
        return outroArray;
    }

    public void setOutroArray(int[] outroArray) {
        this.outroArray = outroArray;
    }

    private static void resetaArray(float[] array) {
        for (int índice = 0; índice < array.length; índice++) {
            array[índice] = 0f;
        }
    }

//  Questão 8
    public boolean eIgual(ArrayDeFloats array) {
        return Arrays.equals(constantes, array.getConstantes());
    }

//  Questão 9
    public void soma(float valor) {
        for (int i = 0; i < constantes.length; i++) {
            constantes[i] += valor;
        }
    }

//  Questão 10
    public boolean existe(float valor) {
        for (float constante : constantes) {
            if (constante == valor) {
                return true;
            }
        }
        return false;
    }

//  Questão 14
    public void reverte() {
        int[] arrayReverso = outroArray.clone();
        int j = arrayReverso.length;
        for (int i = 0; i < outroArray.length; i++) {
            outroArray[i] = arrayReverso[j - 1];
            j--;
        }
    }

//  Questão 15
    public boolean ePalindromo() {
        int[] arrayOriginal = outroArray.clone();
        int[] arrayReverso = outroArray.clone();
        int j = arrayReverso.length;
        for (int i = 0; i < outroArray.length; i++) {
            arrayOriginal[i] = arrayReverso[j - 1];
            j--;
        }
        return Arrays.equals(arrayOriginal, arrayReverso);
    }
}

class Main {
    public static void main(String[] argumentos) {

        ArrayDeFloats arrayDeFloats1 = new ArrayDeFloats();
        ArrayDeFloats arrayDeFloats2 = new ArrayDeFloats();

        float[] duplicata = arrayDeFloats1.getConstantes();

        System.out.println(Arrays.toString(duplicata) + "\n");


//      Questão 8
        float[] arrayIgual = {100f, 10f, 1f, 0.1f, 0.01f, 0.001f};
        arrayDeFloats2.setConstantes(arrayIgual);
        System.out.println("O array da classe ArrayDeFloats1 é igual ao da ArrayDeFloats2? " + arrayDeFloats1.eIgual(arrayDeFloats2) + "\n");

//      Questão 9
        arrayDeFloats1.soma(1f);
        System.out.println(Arrays.toString(arrayDeFloats1.getConstantes()) + "\n");

//      Questão 10
        ArrayDeFloats arrayDeFloats3 = new ArrayDeFloats();
        System.out.println("O numero existe no array? " + arrayDeFloats3.existe(1f) + "\n");

//      Questão 14
        ArrayDeFloats arrayDeFloats4 = new ArrayDeFloats();
        int[] meuArray = {9, 9, 2, 7, 0, 5};
        arrayDeFloats4.setOutroArray(meuArray);
        System.out.println(Arrays.toString(arrayDeFloats4.getOutroArray()));
        arrayDeFloats4.reverte();
        System.out.println(Arrays.toString(arrayDeFloats4.getOutroArray()));

//      Questão 15
        ArrayDeFloats arrayDeFloats5 = new ArrayDeFloats();
        int[] arrayPalindromo = {1, 1, 2, 1, 1};
        arrayDeFloats5.setOutroArray(arrayPalindromo);
        System.out.println(arrayDeFloats5.ePalindromo());
    }

}
