package travelAgency.reporting;

import java.io.File;
import travelAgency.city.service.CityService;
import travelAgency.country.service.CountryService;
import travelAgency.order.service.OrderService;
import travelAgency.user.service.UserService;

public class ReportProvider {
    private final UserService userService;
    private final OrderService orderService;
    private final CountryService countryService;
    private final CityService cityService;

    private ReportComponent userOrdersTextFileReport;

    public ReportProvider(UserService userService, OrderService orderService,
        CountryService countryService, CityService cityService) {
        this.userService = userService;
        this.orderService = orderService;
        this.countryService = countryService;
        this.cityService = cityService;

        initReportComponents();
    }

    private void initReportComponents() {
        userOrdersTextFileReport = new UserOrdersIoTextFileReport(
            userService,
            orderService,
            countryService,
            cityService);
    }

    public File getUserOrdersTextFileReport() throws Exception {
        return userOrdersTextFileReport.generateReport();
    }

}
