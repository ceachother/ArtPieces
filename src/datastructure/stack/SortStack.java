package datastructure.stack;

public class SortStack {

    SimpleStack stack = new SimpleStack();
    SimpleStack temp = new SimpleStack();
    public static void main(String[] args) {

    }

    public void push(String value) {
        if (stack.list.isEmpty() || Integer.parseInt(value) <= Integer.parseInt(stack.peek())) {
            stack.push(value);
        } else {
            temp.push(pop());
            push(value);
            stack.push(temp.pop());
        }

    }

    public String pop() {
        if (stack.list.isEmpty()) {
            return null;
        }
        return stack.pop();
    }

}
