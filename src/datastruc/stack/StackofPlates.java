package datastruc.stack;

import java.util.HashMap;
import java.util.ArrayList;

public class StackofPlates {

    static final Integer SHRESHOLD = 5;
    HashMap<Integer, SimpleStack> stackMap = new HashMap<>();
    Integer currentStack = 0;

    public String pop(){
        if(currentStack.equals(0)){
            return null;
        }
        SimpleStack currStack = stackMap.get(currentStack);
        if (currentStack.equals(1) && currStack.list.isEmpty()) {
            return null;
        }
        if (currStack == null || currStack.list.isEmpty()){
            currentStack--;
            currStack = stackMap.get(currentStack);
        }
        return currStack.pop();
    }

    public void push(String value) {
        if (currentStack == 0) {
            SimpleStack simpleStack = new SimpleStack();
            simpleStack.push(value);
            currentStack = 1;
            stackMap.put(currentStack, simpleStack);
            return;
        }
        SimpleStack currStack = stackMap.get(currentStack);
        if (currStack == null) {
            currStack = new SimpleStack();
            stackMap.put(currentStack, currStack);
        }
        currStack.push(value);
        if (currStack.list.size() >= SHRESHOLD) {
            currentStack++;
        }
    }

    public String popAt(int index) {
        if (currentStack == 0) {
            return null;
        }
        SimpleStack stack = stackMap.get(index);
        if (stack.list.isEmpty()) {
            stack = stackMap.get(index - 1);
        }
        return stack.pop();
    }

}

class Test {
    public static void main(String[] args) {
        StackofPlates stackofPlates = new StackofPlates();
        stackofPlates.push("1");
        stackofPlates.push("2");
        stackofPlates.push("3");
        stackofPlates.push("4");
        stackofPlates.push("5");
        stackofPlates.push("6");

        System.out.println(stackofPlates.pop());
        System.out.println(stackofPlates.pop());
        System.out.println(stackofPlates.pop());
        System.out.println(stackofPlates.pop());
        System.out.println(stackofPlates.pop());
        System.out.println(stackofPlates.pop());
        System.out.println(stackofPlates.pop());
        System.out.println(stackofPlates.pop());

    }
}
