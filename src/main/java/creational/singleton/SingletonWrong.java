package creational.singleton;

public class SingletonWrong {
    //1.Static field
    //Задача этого шаблона ограничить количество экземпляров некоторого класса в пределах приложения.
    public static final SingletonWrong INSTANCE = new SingletonWrong();


}
