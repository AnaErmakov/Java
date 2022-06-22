package less2_1;

public class Track implements IObstacle {
    private int mLength;

    public Track(int length){
        mLength = length;
    }

    public boolean getIt (IActions subj){
        return subj.run(mLength);
    }
}
