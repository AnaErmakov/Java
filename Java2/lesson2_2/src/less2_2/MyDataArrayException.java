package less2_2;

public class MyDataArrayException extends NumberFormatException {

        public MyDataArrayException(int row, int col) {

            super("Задан неверный формат данных! В ячейке [" + row + ", " + col + "].");
        }
}

