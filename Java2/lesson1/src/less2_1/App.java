package less2_1;

public class App {
    public static void main(String[] Args){

        Cat cat = new Cat();
        Human man = new Human();
        Robot bot = new Robot();

        IActions[] subjects = {cat, man, bot};//new IActions[3];
        IObstacle[] obstacles = {new Wall(1), new Track(100),
                                new Wall(2), new Track(1000),
                                new Wall(3), new Track(100000)};

        for (int i = 0; i < subjects.length; i++){
            for (int j =0; j < obstacles.length; j++){
                if (!obstacles[j].getIt(subjects[i])) {
                    break;
                }
            }
        }
    }
}
