package Practice;

import java.util.*;

/**
 * Created by cecillee on 14/7/2017.
 */
public class Test {

    private static final List list = new ArrayList();

    private volatile TreeNode t = new TreeNode(2);

    private Test y = new Test(){
        Integer tes()
        {
            return 2;
        }
    };

    public static void main(String[] args) {
        System.out.println(list.size());
        list.add("lalala");
        list.add("shenmeya");
        list.remove("lalala");
        System.out.println(list.size());
        System.out.println(getString(list, "shenmeya"));

        try {
            System.out.println();
        }
        finally {
            System.out.println();
        }
    }

    private void privateTest() {

    }

    public static Boolean getString(List list, String string) {
        Iterator<String> stringIter = list.iterator();
        while (stringIter.hasNext()) {
            String s = stringIter.next();
            if (s.equals(string)) {
                return true;
            }
        }
        return false;
    }

    public class TestInner{

        public void testIn() {
            System.out.println("TestInner Method");
        }

    }

    public static class TestStaticInner{

        public static void testStatic() {
            System.out.println("TestInner Method");
        }
    }
}


