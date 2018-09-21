package ee.sda.patterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // iterator is rarely used but there are times where you don't have a choice
        Iterator<Integer> iterator = integers.iterator();

        // when this returns FALSE, the cycle ends
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // iter = shortcut key within InteliJ
        for (Integer integer: integers) {

        }
    }
}
