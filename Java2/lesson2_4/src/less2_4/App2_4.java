package less2_4;

import java.util.Arrays;

public class App2_4 {

    static final int size = 10_000_000;
    static final int halfSize = size / 2;

    public static void main(String[] args) {

        testMethod();
        oneThreadMethod();
        twoThreadsMethod();
        System.out.println("FINISH");
    }
    public static void oneThreadMethod() {

        float[] arr1 = new float[size];
        Arrays.fill(arr1, 1.0f);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Длительность работы oneThreadMethod: " +
                + (System.currentTimeMillis() - startTime) + " ms.");
    }

    public static void twoThreadsMethod() {

        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < halfSize; i++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        }, "A");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = halfSize; i < size; i++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        }, "A");

        long startTime = System.currentTimeMillis();

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("Длительность работы twoThreadsMethod: " +
                + (System.currentTimeMillis() - startTime) + " ms.");
    }

    public static void testMethod() {

        float[] testArr = new float[size];
        Arrays.fill(testArr, 1.0f);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < testArr.length; i++) {
            testArr[i] = (float) (testArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Длительность работы testMethod: " +
                + (System.currentTimeMillis() - startTime) + " ms.");
    }
}
