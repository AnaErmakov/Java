package less2_2;

import java.io.IOException;
import java.util.Random;

public class App {
    final static int legalSizeR = 4;
    final static int legalSizeC = 4;

    public static void main (String[] Args){
        int sizeR = 4;
        int sizeC = 4;

        String[][] myArray = createMatrixStr(sizeR, sizeC);
        myArray[1][3] = "bad";
        printMatrix(myArray);
        try {
            int sum = calcSumArr(myArray);
            System.out.println("Сумма элементов массива: " + sum);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static int calcSumArr(String[][] myArray) throws MySizeArrayException {

        checkSize(myArray);

        int sumArr = 0;
        //calculate sumArr
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    sumArr += Integer.parseInt(myArray[i][j]);
                }
                catch(NumberFormatException e){
                    throw new MyDataArrayException(i, j);

                }
            }
        }
        return sumArr;
    }

    private static void checkSize(String[][] myArray) throws MySizeArrayException {
        if (myArray.length != legalSizeR) {
            throw new MySizeArrayException();
        }
        else {
            for (int i = 0; i < myArray.length; i ++){
                if (myArray[i].length != legalSizeC){
                    throw new MySizeArrayException();
                }
            }
        }
    }

    private static String[][] createMatrixStr(int sizeR, int sizeC) {
        String[][] matr = new String[sizeR][sizeC];
        Random rand = new Random(9);
        for (int i = 0; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {
                matr[i][j] = String.valueOf(rand.nextInt(0,10));
            }
        }
        return matr;
    }

    public static void printMatrix(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
