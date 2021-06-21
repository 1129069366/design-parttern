package CreationPattern.SingletonPattern;


import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingletonOne(){

        SingletonOne st1 = SingletonOne.getInstance();
        SingletonOne st2 = SingletonOne.getInstance();
        System.out.println("f");

        System.out.println(st1==st2);
    }

    @Test
    public void testSingletonTwo(){
        //
        SingletonTwo st1 = SingletonTwo.getInstance();
        SingletonTwo st2 = SingletonTwo.getInstance();


        System.out.println(st1==st2);
    }

    @Test
    public void testSingletonThree(){

        //1. 单线程环境
      /*  SingletonThree st1 = SingletonThree.getInstance();
        SingletonThree st2 = SingletonThree.getInstance();

        System.out.println(st1==st2);    true*/

        //2. 多线程环境


    }




}
