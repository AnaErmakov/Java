package hw02;

public class hwApp2 {
    public static void main(String[] args){
        int a = 12;
        int b = 5;
        System.out.println("Сумма чисел (" + a + " + " + b + ") от 10 до 20: " + sumInRange(a, b));
        printIsPositive(-5);

        int year = 2000;
        if (isLeapYear(year)) {
            System.out.println(year + " - високосный год");
        }
        else{
            System.out.println(year + " - невисокосный год");
        }
    }

    public static boolean sumInRange(int a, int b){
        int sum = a + b;
        boolean isTrue = true;

        if (sum>=10 && sum <= 20){
            isTrue = true;
        }
        else {
            isTrue = false;
        }

        return isTrue;
    }

    public static void printIsPositive(int a){
        boolean positive = isPositive(a);
        if (positive) {
            System.out.println(a + " - положительное число");
        }
        else {
            System.out.println(a + " - отрицательное число");
        }
    }

    public static boolean isPositive(int a){
        boolean positive = true;
        if (a < 0) {
            positive = !positive;
        }
        return positive;
    }

    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        if (year%4 == 0) {
            isLeap = true;
            if ((year%100 == 0) && (year%400 != 0)){
                isLeap = false;
            }
        }
        return isLeap;
    }
}
