package datastructure.stack;

import java.util.List;
import java.util.ArrayList;

public class SimpleStack {
    List<String> list = new ArrayList<>();
    Integer last = -1;


    public void push(String value) {
        list.add(value);
        last++;
    }

    public String pop() {
        if (list.isEmpty()){
            return null;
        }
        String value = list.get(last);
        list.remove(value);
        last--;
        return value;
    }

    public String peek() {
        if (list.isEmpty()){
            return null;
        }
        String value = list.get(last);
        return value;
    }

}
