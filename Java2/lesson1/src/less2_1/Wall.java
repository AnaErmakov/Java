package less2_1;

public class Wall implements IObstacle {

    private int mHeight;

    public Wall(int height){
        mHeight = height;
    }

    public boolean getIt (IActions subj){
        return subj.jump(mHeight);
    }

}
