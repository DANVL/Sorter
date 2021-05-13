package org.sorter.comparator;

import java.util.Comparator;

public class SpecificStringComparator implements Comparator<String> {

    private final String startString;

    public SpecificStringComparator(String startString) {
        this.startString = startString;
    }

    @Override
    public int compare(String s1, String s2) {
        if (!s1.startsWith(startString) && s2.startsWith(startString)) {
            return 1;
        } else if (s1.startsWith(startString) && !s2.startsWith(startString)) {
            return -1;
        }

        return 0;
    }
}
