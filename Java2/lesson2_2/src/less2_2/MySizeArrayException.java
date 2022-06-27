package less2_2;

import java.io.IOException;

public class MySizeArrayException extends IOException {

    public MySizeArrayException() {
        super("Задан неверный размер массива!");
    }
}
