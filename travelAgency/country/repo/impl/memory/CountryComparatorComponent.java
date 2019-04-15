package travelAgency.country.repo.impl.memory;

import static travelAgency.common.buisness.repo.memory.CommonComparatorHolder.getComparatorForNullableStrings;
import static travelAgency.country.serach.CountryOrderByField.NAME;
import static travelAgency.country.serach.CountryOrderByField.SQUARE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import travelAgency.country.domain.Country;
import travelAgency.country.serach.CountryOrderByField;

public final class CountryComparatorComponent {

    private static final CountryComparatorComponent INSTANCE = new CountryComparatorComponent();
    private static Map<CountryOrderByField, Comparator<Country>> comparatorsByField = new HashMap<>();
    /**
     * For complex comparator only
     */
    private static Set<CountryOrderByField> fieldComparePriorityOrder = new LinkedHashSet<>(
        Arrays.asList(NAME, SQUARE));

    static {
        comparatorsByField.put(NAME, getComparatorForNameField());
        comparatorsByField.put(SQUARE, getComparatorForSquareField());
    }

    private CountryComparatorComponent() {
    }


    public static CountryComparatorComponent getInstance() {
        return INSTANCE;
    }


    private static Comparator<Country> getComparatorForNameField() {
        return new Comparator<Country>() {

            @Override
            public int compare(Country country1, Country country2) {
                return getComparatorForNullableStrings()
                    .compare(country1.getName(), country2.getName());
            }
        };
    }

    private static Comparator<Country> getComparatorForSquareField() {

        return new Comparator<Country>() {

            @Override
            public int compare(Country country1, Country country2) {
                return getComparatorForNullableStrings()
                    .compare(country1.getSquare().toString(), country2.getSquare().toString());
            }
        };
    }


    public Comparator<Country> getComparatorForField(CountryOrderByField field) {
        return comparatorsByField.get(field);
    }

    public Comparator<Country> getComplexComparator(CountryOrderByField field) {
        return new Comparator<Country>() {

            @Override
            public int compare(Country c1, Country c2) {
                int result = 0;
                Comparator<Country> countryComparator = comparatorsByField.get(field);

                if (countryComparator != null) {
                    result = countryComparator.compare(c1, c2);
                    //if records have same order priority, i want to order them in their group
                    if (result == 0) {

                        //loop through all possible sorting fields
                        for (CountryOrderByField otherField : fieldComparePriorityOrder) {
                            //if i haven't sorted by field which is taken from parameter in function, i do sorting
                            if (!otherField.equals(field)) {

                                result = comparatorsByField.get(otherField).compare(c1, c2);
                                //if sort result detected that records are not equals - we exit from loop,
                                //else continue
                                if (result != 0) {
                                    break;
                                }
                            }
                        }

                    }
                }

                return result;
            }
        };
    }
}
