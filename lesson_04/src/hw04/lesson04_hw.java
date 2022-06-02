package hw04;

import java.util.Random;
import java.util.Scanner;

public class lesson04_hw {
    static public void main(String[] args){
        //tic tac toe

        int size = 5;
        int quanToWin = 4;
        System.out.println("Для выхода нажмите q");

        String[][] field = initArr(size);
        for (int i = 0; i < (size*size); i++) {
            if (i % 2 == 0) {
                if (!humanTurn(field)) break;
                if (isWinner(field, "X", quanToWin)) {
                    System.out.println("Поздравляю! Вы победили!");
                    break;
                }
            }
            else {
                aiTurn(field, size);
                if (isWinner(field, "0", quanToWin)) {
                    System.out.println("Выиграл компьютер!");
                    break;
                }
            }
            printArr(field);
            if (i == size*size -1) System.out.println("Ничья!");
        }
        System.out.println("Игра окончена");
    }

    public static String[][] initArr(int size){
        String[][] field = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j ++){
                field[i][j] = "*";
            }
        }
        return field;
    }

    public static void printArr(String [][] field){
        String sepArr = "";
        for (int i = 0; i < field.length; i++){
            for(int j = 0; j < field.length; j ++){
                System.out.print(field[i][j] + " ");
            }
            sepArr += "--";
            System.out.println("");
        }
        System.out.println(sepArr);
    }

    public static boolean humanTurn(String [][] field){
        String ch = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Делайте Ваш ход (номер строки и номер столбца) :");

        while (true) {
            try {
                ch = scanner.next();
                int x = Integer.parseInt(ch) - 1;
                ch = scanner.next();
                int y = Integer.parseInt(ch) - 1;

                if ((x >= field.length) || (y >= field.length)) {
                    System.out.println("Вы сходили за пределы поля. Сделайте еще один ход...");
                } else {
                    if (field[x][y] == "*") {
                        field[x][y] = "X";
                        break;
                    } else {
                        System.out.println("Вы сделали ход на заполненное поле. Сходите еще раз...");
                    }
                }

            } catch (Exception e) {
                //System.out.println(e.toString());
                if (!ch.equals("q")) {
                    System.out.println("Вы ввели не число. Сходите еще раз...");
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void aiTurn(String [][] field, int size){
        Random rand = new Random();

        while (true) {
            int x = rand.nextInt(size);
            int y = rand.nextInt(size);

            if (field[x][y] == "*") {
                field[x][y] = "0";
                break;
            }
        }
        System.out.println("Компьютер сходил");
    }

    public static boolean isWinner(String[][] field, String ch, int quanCh){
        int size = field.length;
        int countI = 0;
        int countJ = 0;
        int countD1 = 0;
        int countD2 = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                //System.out.println(field[i][j] + ", " + countI + ", " + ch + ", " + field[i][j].equals(ch));
                countI = (field[i][j].equals(ch)) ? countI + 1 : 0;
                countJ = (field[j][i].equals(ch)) ? countJ + 1 : 0;
                if ((countI == quanCh) || (countJ == quanCh)) return true;
            }
            countI = 0;
            countJ = 0;
            countD1 = (field[i][i].equals(ch)) ? countD1 + 1 : 0;
            countD2 = (field[i][size - i -1].equals(ch)) ? countD2 + 1 : 0;
            if ((countD1 == quanCh) || (countD2 == quanCh)) return true;

        }
        /*for (int b = 0; b < size - quanCh; b++) {
            for (int i = 0; i < size - b - 1; i++) {
                countD2 = (field[i + b][size - i - b - 1].equals(ch)) ? countD2 + 1 : 0;
                countD1 = (field[i + b][i + b].equals(ch)) ? countD1 + 1 : 0;
                if ((countD1 == quanCh) || (countD2 == quanCh)) return true;
            }
        }*/
        return false;
    }
}
