import java.util.Scanner;
public class Excercise {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        // Se lee un array bidimensional de elementos de tipo int
        int[][] mat = Internal.loadIntArray2D(input);
        // array que almacena el número de valores pares en cada fila de mat
        int [][] res;
        
        res = invertMat(mat);

        // Se muestra el resultado
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int [] auxFila(int [] fila) {
        // Método auxiliar
        int[] res = new int[fila.length];
        int c = 0;
        for (int i = fila.length - 1; i >= 0; i--){
            res[c] = fila[i];
            c++;
        }
        return res;
    }
    public static int [][] invertMat(int[][] valores) {
        //-->> Poner aquí su código <<--//
        int[][] myArray = new int[valores.length][];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = auxFila(valores[i]);
        }
        return myArray;
    }    
}