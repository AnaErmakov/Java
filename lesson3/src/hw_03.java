public class hw_03 {
    public static void main(String[] args){

        int[] intArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Массив: ");
        printArr(intArr);
        System.out.println("\nНовый массив: ");
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = (intArr[i] == 0) ? 1 : 0;
        }
        printArr(intArr);

        int[] int100 = new int[100];
        System.out.println("\n\nМассив из 100 элементов:");
        for (int i = 0; i < int100.length; i++){
            int100[i] = i + 1;
        }
        printArr(int100);

        int[] int12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\n\nИсходный массив:");
        printArr(int12);
        System.out.println("\nУдвоить все элементы меньше 6. \nПолученный массив:");
        for (int i = 0; i < int12.length; i++){
            int12[i] = (int12[i] < 6) ? int12[i]*2 : int12[i];
        }
        printArr(int12);
        findMinMax(int12);

        int n = -3;
        moveArray(int12,n);
        System.out.println("Массив, сдвинутый на " + n + ":");
        printArr(int12);

        int[][] matrix = createMatrixXY(5,5,0);
        fillDiagonalsByOnes(matrix);
        System.out.println("\n\nПолученная матрица:");
        printMatrix(matrix);

        int[] arr = createIntArray(5, 8);
        System.out.println("\n\nМассив, заданный при помощи метода createIntArray(len, initialValue): ");
        printArr(arr);

        int12[5]=0;
        System.out.println("\n\nМассив: ");
        printArr(int12);
        System.out.println("\nЕсть место в массиве, где сумма элементов справа и слева равны: " + checkBalance(int12));
    }

    public static boolean checkBalance(int[] arr){
        int intLeft = 0;
        int intRight = arr.length - 1;
        int sumLeft = arr[0];
        int sumRight = arr[arr.length-1];
        for (int i = 0; i < arr.length - 1; i++){
            if (intLeft == intRight)
                return false;
            if (sumRight > sumLeft) {
                intLeft++;
                sumLeft += arr[intLeft];
            }
            else {
                intRight--;
                sumRight += arr[intRight];
            }
            if ((intLeft == intRight - 1)&&(sumRight == sumLeft))
                return true;
        }
        return false;
    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length-1]);
    }

    public static void findMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }
        System.out.println("\nМинимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }

    private static void moveArray(int[] arr, int n) {
        if (n >= 0) moveToRight(arr,n);
        else moveToLeft(arr, -1 * n);
    }
    public static void moveToRight(int[] arr, int n) {
        int temp = 0;
        for (int j = 0; j < n; j++) {
            temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
    }
    public static void moveToLeft(int[] arr, int n) {
        int temp = 0;
        for (int j = 0; j < n; j++) {
            temp = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
        }
    }
    public static int[][] createMatrixXY(int x, int y, int a){
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                arr[i][j] = a;
            }
        }
        return arr;
    }

    public static void fillDiagonalsByOnes(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if ((i == j) || (j == arr.length - i - 1)){
                    arr[i][j] = 1;
                }
            }
        }
    }

    public static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println();
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
        }
    }

    public static int[] createIntArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i =0; i < len; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

}
