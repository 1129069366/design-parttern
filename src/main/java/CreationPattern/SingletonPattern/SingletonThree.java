package CreationPattern.SingletonPattern;

/**
 * 单例模式懒汉式1
 * 线程不安全
 */
public class SingletonThree {

    public SingletonThree(){}

    private static SingletonThree instance;

    public static SingletonThree getInstance(){
        if (instance==null){
            instance = new SingletonThree();
        }

        return instance;
    }


}
