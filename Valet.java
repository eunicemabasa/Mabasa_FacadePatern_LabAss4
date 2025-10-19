package hotel.services;
import hotel.HotelService;

public class Valet implements HotelService {
    public String getServiceName() {
        return "Valet Parking";
    }

    public boolean pickUpVehicle(String plateNumber) {
        System.out.println("Valet: Picking up vehicle " + plateNumber);
        return true;
    }

    public boolean performService(String... params) {
        if (params.length == 0) return false;
        return pickUpVehicle(params[0]);
    }
}