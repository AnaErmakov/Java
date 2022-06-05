package lesson_06;

public class Cat extends Animal {

    public static int countCats = 0;
    public Cat(String name, String color, int age){
        super(name, "Кошка", color, age, 200, 0);
        countCats++;
    }
}
