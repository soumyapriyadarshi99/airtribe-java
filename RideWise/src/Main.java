import com.airtribe.ridewise.impl.DefaultFareStrategy;
import com.airtribe.ridewise.impl.LeastDriverStrategy;
import com.airtribe.ridewise.impl.NearestDriverStrategy;
import com.airtribe.ridewise.impl.PeakHourFareStrategy;
import com.airtribe.ridewise.model.FareReceipt;
import com.airtribe.ridewise.model.Ride;
import com.airtribe.ridewise.model.Rider;
import com.airtribe.ridewise.service.DriverService;
import com.airtribe.ridewise.service.RideService;
import com.airtribe.ridewise.service.RiderService;
import com.airtribe.ridewise.strategy.FareStrategy;
import com.airtribe.ridewise.strategy.RideMatchingStrategy;

public class Main {
    public static void main(String[] args) {

        DriverService driverService = new DriverService();
        RiderService riderService = new RiderService();

        driverService.registerDriver("sam","bbsr");
        driverService.registerDriver("dam","ctc");
        driverService.registerDriver("fam","bamp");
        driverService.registerDriver("kam","bals");

        Rider soumya = riderService.registerRider("soumya","ctc");
        Rider sourav = riderService.registerRider("sourav","bbsr");

        RideMatchingStrategy nearestDriverStrategy = new NearestDriverStrategy();
        RideMatchingStrategy leastDriverStrategy = new LeastDriverStrategy();

        FareStrategy defaultFareStrategy = new DefaultFareStrategy();
        FareStrategy peakHourFareStrategy = new PeakHourFareStrategy();

        RideService rideService1 = new RideService(driverService,nearestDriverStrategy,defaultFareStrategy );
        Ride ride1=rideService1.requestRide(soumya,20.0);
        System.out.println(ride1);
        FareReceipt fareReceipt1= rideService1.completeRide(ride1.getId());
        System.out.println(ride1);
        System.out.println(fareReceipt1);

    }
}