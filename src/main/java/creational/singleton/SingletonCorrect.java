package creational.singleton;

public class SingletonCorrect {

    private SingletonCorrect() {
    }

    public static SingletonCorrect getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        public static final SingletonCorrect instance = new SingletonCorrect();
    }

}
