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
        System.out.println("f");

        System.out.println(st1==st2);
    }



}
