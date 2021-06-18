package CreationPattern.SingletonPattern;

/**
 * 单例模式
 *
 * 饿汉式1 静态变量创建类的对象
 *
 * 线程安全的
 */

//命名方式Singleton表示单例模式  One表示第一种实现单例模式的方式
public class SingletonOne {

    //私有构造方法
    private SingletonOne(){}

    private static SingletonOne singletonOne = new SingletonOne();

    public static SingletonOne getInstance(){
        return singletonOne;
    }

}
