package creational.singleton;

public class Main {
    public static void main(String[] args) {

        SingletonWrong singletonWrong = new SingletonWrong();
        SingletonWrong singletonWrong1 = new SingletonWrong();

        SingletonWrong singletonWrong3 = SingletonWrong.INSTANCE;
        SingletonWrong singletonWrong4 = SingletonWrong.INSTANCE;

        SingletonEnum singletonEnum = SingletonEnum.SINGLETON_ENUM;
        SingletonEnum singletonEnum1 = SingletonEnum.SINGLETON_ENUM;

        SingletonCorrect singletonCorrect = SingletonCorrect.getInstance();
        SingletonCorrect singletonCorrect1 = SingletonCorrect.getInstance();


        System.out.println("1:" + singletonWrong.hashCode() + " 2: " + singletonWrong1.hashCode() );
        System.out.println("3:" + singletonWrong3.hashCode() + " 4: " + singletonWrong4.hashCode() );
        System.out.println("5:" + singletonEnum.hashCode() + " 6: " + singletonEnum1.hashCode());
        System.out.println("7:" + singletonCorrect.hashCode() + " 8: " + singletonCorrect1.hashCode());
    }
}
