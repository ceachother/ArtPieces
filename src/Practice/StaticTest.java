package Practice;

import com.sun.jmx.snmp.tasks.ThreadService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by cecillee on 19/6/2017.
 */
public class StaticTest {

    public static void foo() {
        System.out.println("Base foo");

    }

    public void bar() {
        System.out.println("Base bar");
        Test.TestInner in = new Test().new TestInner();
        Test.TestStaticInner si = new Test.TestStaticInner();
    }

    public void bar2(int s) {
    }

    public String bar2(Integer s) {
        return null;
    }

    public String bar3(Integer i , Integer ii, Integer iii) {
        return null;
    }

    public String bar3(int ...s) {
        List list = Arrays.asList(s);
        return null;
    }

    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        int[] ints = new int[]{1, 2, 3};
        staticTest.bar3(ints);
    }

    public static void testStaticMethod() {

    }

}

class Child extends StaticTest {
    public static void foo() {
        System.out.println("Practice.Child foo");
    }

    public void bar() {
        System.out.println("Practice.Child bar");
    }

    public static void main(String[] args) {
        StaticTest.foo();
        Child.foo();
    }

}
class testCall implements Callable{
    @Override
    public Object call() throws Exception {
        ExecutorService e = Executors.newCachedThreadPool();
        return null;
    }

}

class testRun implements Runnable{

    @Override
    public void run() {
        ExecutorService e = Executors.newCachedThreadPool();
        FutureTask task = new FutureTask(new testCall());
        Thread thread = new Thread(task);
        try {
            thread.join();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }
}
