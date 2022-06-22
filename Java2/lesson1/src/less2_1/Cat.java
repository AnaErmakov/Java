package less2_1;

public class Cat implements IActions {
    private int mDist = 1000;
    private int mHeight = 2;

    public boolean run(int dist) {
        if (dist <= mDist) {
            System.out.println("Кот успешно пробежал " + dist);
            return true;
        }
        else {
            System.out.println("Кот не смог пробежать " + dist);
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= mHeight) {
            System.out.println("Кот успешно прыгнул на " + height);
            return true;
        } else {
            System.out.println("Кот не смог допрыгнуть до " + height);
            return false;
        }
    }
}
