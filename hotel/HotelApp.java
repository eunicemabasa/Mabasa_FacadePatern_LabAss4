package hotel;
import hotel.FrontDesk;

public class HotelApp {
    private FrontDesk desk;

    public HotelApp() {
        desk = new FrontDesk();
    }

    public static void main(String[] args) {
        new HotelApp().demo();
    }

    void demo() {
        desk.pickupVehicle("ABC123");
        System.out.println();

        desk.cleanRoom(101);
        System.out.println();

        desk.requestCarts(2);
        System.out.println();

        desk.checkIn(205, 3);
        System.out.println();

        desk.checkOut("XYZ789", 1);
    }
}