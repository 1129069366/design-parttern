package CreationPattern.SingletonPattern;

/**
 * 懒汉式 实现2  线程安全
 */
public class SingletonFour {
    private SingletonFour(){}

    private static SingletonFour instance;

    public static  synchronized SingletonFour getInstance(){
        if (instance==null){
            instance = new SingletonFour();
        }

        return instance;
    }
}
