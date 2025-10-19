package hotel.services;
import hotel.HotelService;

public class HouseKeeping implements HotelService {
    public String getServiceName() {
        return "HouseKeeping";
    }

    public boolean cleanRoom(int roomNumber) {
        System.out.println("HouseKeeping: Cleaning room " + roomNumber);
        return true;
    }

    public boolean performService(String... params) {
        try {
            if (params.length == 0) return false;
            int room = Integer.parseInt(params[0]);
            return cleanRoom(room);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}