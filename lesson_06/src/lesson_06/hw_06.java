package lesson_06;

public class hw_06 {
    public static void main(String[] args){
        Cat cat = new Cat("Барабашка", "пятнистый", 4);
        Cat cat1 = new Cat("Маруся", "белый", 2);
        Cat cat2 = new Cat("Муся", "черный", 7);
        Cat cat3 = new Cat("Алиса", "рыжий", 9);
        cat.printAllInfo();

        Dog dog = new Dog("Вика", "тигровый", 2);
        Dog dog1 = new Dog("Рита", "черный с подпалом", 6);
        Dog dog2 = new Dog("Ива", "рыжий", 12);
        Dog dog3 = new Dog("Мика", "белый", 5);
        Dog dog4 = new Dog("Маффи", "мраморный", 7);
        dog1.printAllInfo();

        System.out.println();
        dog.run(510);
        dog.swim(8);
        cat2.run(100);
        cat2.swim(10);

        System.out.println("\nКоличество собак: " + Dog.countDogs);
        System.out.println("Количество кошек: " + Cat.countCats);
        System.out.println("Количество животных: " + Animal.countAnimals);
    }
}
