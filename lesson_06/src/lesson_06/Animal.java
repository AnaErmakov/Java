package lesson_06;

public abstract class Animal {
    public static int countAnimals = 0;
    protected String name = "кличка животного";
    protected String kind = "вид животного";
    protected String color = "окрас животного";
    protected int age = 0;
    protected int maxRunDist = 0;
    protected int maxSwimDist = 0;

    public Animal(String name, String kind, String color, int age, int maxRunDist, int maxSwimDist){
        this.name = name;
        this.kind = kind;
        this.color = color;
        this.age = age;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
        countAnimals++;
    }

    public void run(int distance){
        if (checkPossibility(this.maxRunDist, distance)){
            System.out.println(this.name + " пробежала " + distance + "м");
        }
        else {
            System.out.println(this.name + " смола пробежать только " + this.maxRunDist + "м");
        }
    }

    public void swim(int distance){
        if (checkPossibility(this.maxSwimDist, distance)){
            System.out.println(this.name + " проплыла " + distance + "м");
        }
        else {
            System.out.println(this.name + " не сможет проплыть " + distance + "м");
        }
    }

    private static boolean checkPossibility(int maxDist, int distance) {
        if (distance < maxDist) {
            return true;
        } else {
            return false;
        }
    }

    public void printAllInfo(){
        System.out.println("\n" + this.kind + " " + this.name);
        System.out.println("Окрас: " + this.color);
        System.out.println("Возраст: " + this.age);
    }
}
