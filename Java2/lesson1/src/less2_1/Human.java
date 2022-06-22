package less2_1;

public class Human implements IActions {

    private int mDist = 10000;
    private int mHeight = 3;

    public boolean run(int dist) {
        if (dist <= mDist) {
            System.out.println("Человек успешно пробежал " + dist);
            return true;
        }
        else {
            System.out.println("Человек не смог пробежать " + dist);
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= mHeight) {
            System.out.println("Человек успешно прыгнул на " + height);
            return true;
        } else {
            System.out.println("Человек не смог допрыгнуть до " + height);
            return false;
        }
    }
}
