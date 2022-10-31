package lab_8.prob_4;

import java.util.*;

public class Filter {
    public int countWords(List<String> words, char c, char d, int len){
        return (int)words.stream()
                .filter(word -> contains(word, c)
                        && !contains(word, d)
                        && word.length() == len)
                .count();
    }

    private boolean contains(String word, char c ){
        for (int i =0; i<word.length() ; ++i){
            if(word.charAt(i) == c){
                return true;
            }
        }

        return false;
    }

    public static void main(String [] args){
        Filter filter = new Filter();
        List<String> list = Arrays.asList("john","mary","oaks","thomas","kevin");
        System.out.println(filter.countWords(list, 'o', 'y', 4));
    }
}
