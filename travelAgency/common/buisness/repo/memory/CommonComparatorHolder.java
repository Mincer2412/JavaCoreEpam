package travelAgency.common.buisness.repo.memory;

import java.util.Comparator;

public class CommonComparatorHolder {


    private CommonComparatorHolder() {
    }

    private static Comparator<String> comparatorForNullableStrings = new Comparator<String>() {

        @Override
        public int compare(String s1, String s2) {

            if (s1 == null && s2 == null) {
                return 0;
            } else if (s1 != null) {
                return s1.compareTo(s2);
            } else {
                return -1;
            }

        }
    };

    public static Comparator<String> getComparatorForNullableStrings() {
        return comparatorForNullableStrings;
    }
}
