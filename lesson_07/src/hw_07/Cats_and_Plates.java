package hw_07;

public class Cats_and_Plates {

    public static void main(String[] args){
        Cat[] cat = new Cat[6];
        cat[0] = new Cat("Барсик", 15);
        cat[1] = new Cat("Хвостик", 20);
        cat[2] = new Cat("Яша", 20);
        cat[3] = new Cat("Пушок", 25);
        cat[4] = new Cat("Борис", 15);
        cat[5] = new Cat("Снежок", 20);

        Plate plate = new Plate(100);
        plate.info();

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].printInfo();
        }
        plate.info();
        plate.addFood(100);
        System.out.println("Добавили еды в тарелку");
        plate.info();

        for (int i = 0; i < cat.length; i++) {
            if (!cat[i].satiation){
                cat[i].eat(plate);
                cat[i].printInfo();
            }
        }
        plate.info();
    }
}
