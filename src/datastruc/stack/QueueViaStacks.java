package datastruc.stack;

public class QueueViaStacks {
    SimpleStack inStack = new SimpleStack();
    SimpleStack outStack = new SimpleStack();
    public static void main(String[] args) {

    }

    public void push(String value) {
        inStack.push(value);
    }

    public String pop() {
        if (outStack.list.isEmpty()) {
            moveToAnotherStack(inStack, outStack);
        }
        return outStack.pop();
    }

    private void moveToAnotherStack(SimpleStack inStack, SimpleStack outStack) {
        while (!inStack.list.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}
