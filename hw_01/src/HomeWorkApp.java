public class HomeWorkApp {

    public static void main(String[] args){
        //System.out.println("Класс HomeWorkApp c методом main()");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Three words:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 5;
        int b = -7;
        int sum = 0;
        System.out.println("\na = " + a);
        System.out.println("b = " + b);

        sum  = a + b;
        if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }
        else{
            System.out.println("Сумма положительная");
        }
    }

    public static void printColor(){
        int value = 100;
        if (value <= 0){
            System.out.println("Красный");
        }
        else
        if (100 < value) {
            System.out.println("Зеленый");
        }
        else {
            System.out.println("Желтый");
        }
    }

    public static void compareNumbers(){
        System.out.println("\nСравнение чисел:");
        int a = 5;
        int b = 9;

        if (a >= b) {
            System.out.println(a + " >= " + b);
        }
        else{
            System.out.println(a + " < " + b);
        }
    }
}
