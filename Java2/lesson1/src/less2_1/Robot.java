package less2_1;

public class Robot implements IActions {

    private int mDist = 100000;
    private int mHeight = 1;

    public boolean run(int dist) {
        if (dist <= mDist) {
            System.out.println("Робот успешно пробежал " + dist);
            return true;
        }
        else {
            System.out.println("Робот не смог пробежать " + dist);
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= mHeight) {
            System.out.println("Робот успешно прыгнул на " + height);
            return true;
        }
        else {
            System.out.println("Робот не смог допрыгнуть до " + height);
            return false;
        }
    }
}
