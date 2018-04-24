package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class MostOccurWords {

    public static void main(String[] args) {
        String str = "qw=er=qw=er]abc,ccc;abc,abc Abc'abc0ccc9ccc8ccc7ccc";
        String[] ex = {"abc", "ccc","qw","er"};
        List<String> list = Arrays.asList(ex);
        List<String> result = mostOccuranceWords(str,list);
        System.out.println(result.size());
        System.out.println(result.get(0));
        System.out.println(result.get(1));
    }
    public static List<String> mostOccuranceWords(String str, List<String> excludeWords) {

        List<String> result = new ArrayList<>();
        Hashtable<String,Integer> table = new Hashtable<>();

        int begin = 0;
        int mostOcc = 0;
        for(int end = 0; end< str.length(); end++) {
            char c = str.toLowerCase().charAt(end);
            if((c-'a' < 26 && c-'a' >=0) && end != str.length()-1) {
                continue;
            } else {
                String word = "";
                if (end == str.length() - 1) {
                    word = str.substring(begin, end + 1);
                } else {
                    word = str.substring(begin,end);
                }
                if(!excludeWords.contains(word)) {
                    Integer occ = table.get(word);
                    if(occ == null) {
                        occ = 1;
                        table.put(word,occ);
                    } else {
                        occ++;
                        table.put(word,occ);
                    }
                    if(occ>mostOcc) {
                        mostOcc = occ;
                        result.clear();
                        result.add(word);
                    } else if(occ == mostOcc) {
                        result.add(word);
                    }
                }
                begin = end+1;
            }
        }

        return result;
    }
}
