package lesson_06;

public class Dog extends Animal{
    public static int countDogs = 0;
    public Dog(String name, String color, int age){
        super(name, "Собака", color, age, 500, 10);
        countDogs++;
    }
}
