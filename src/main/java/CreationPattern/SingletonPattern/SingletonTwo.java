package CreationPattern.SingletonPattern;

/**
 * 单例模式
 *
 * 饿汉式2 静态代码块方式
 *
 * 线程安全的
 */
public class SingletonTwo {
    //私有构造方法
    private SingletonTwo(){}

    private static SingletonTwo singletonTwo;

    static {
        singletonTwo = new SingletonTwo();
    }


    public static SingletonTwo getInstance(){
        return singletonTwo;
    }

}
