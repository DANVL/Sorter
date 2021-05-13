package org.sorter;

import org.sorter.comparator.SpecificStringComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] stringsForSorting = {
                {"xac", "ba", "x1b", "ac"},
                {"d", "c", "b", "a"},
                {"xd", "xc", "xb", "xa"}
        };

        SpecificStringComparator comparator = new SpecificStringComparator("x");

        Arrays.stream(stringsForSorting).forEach(string -> {
            System.out.print(Arrays.toString(string) + " -> ");
            Arrays.sort(string, comparator);
            System.out.println(Arrays.toString(string));
        });

    }
}
