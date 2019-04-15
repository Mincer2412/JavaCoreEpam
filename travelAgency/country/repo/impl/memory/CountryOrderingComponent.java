package travelAgency.country.repo.impl.memory;

import java.util.Comparator;
import java.util.List;
import travelAgency.country.domain.Country;
import travelAgency.country.serach.CountryOrderByField;
import travelAgency.country.serach.CountrySearchCondition;

public class CountryOrderingComponent {

    public void applyOrdering(List<Country> countries,
        CountrySearchCondition countrySearchCondition) {
        Comparator<Country> countryComparator = null;

        CountryOrderByField field = countrySearchCondition.getCountryOrderByField();

        switch (countrySearchCondition.getOrderType()) {

            case SIMPLE: {
                countryComparator = CountryComparatorComponent.getInstance().getComparatorForField(field);
                break;
            }
            case COMPLEX: {
                countryComparator = CountryComparatorComponent.getInstance().getComplexComparator(field);
                break;
            }
        }

        if (countryComparator != null) {
            switch (countrySearchCondition.getOrderDirection()) {

                case ASC:
                    countries.sort(countryComparator);
                    break;
                case DESC:
                    countries.sort(countryComparator.reversed());
                    break;
            }
        }
    }
}
