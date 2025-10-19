package hotel;
import hotel.services.Valet;
import hotel.services.HouseKeeping;
import hotel.services.Cart;

public class FrontDesk {
    private Valet valet;
    private HouseKeeping housekeeping;
    private Cart cart;

    public FrontDesk() {
        valet = new Valet();
        housekeeping = new HouseKeeping();
        cart = new Cart();
    }

    public boolean pickupVehicle(String plate) {
        return valet.pickUpVehicle(plate);
    }

    public boolean cleanRoom(int room) {
        return housekeeping.cleanRoom(room);
    }

    public boolean requestCarts(int num) {
        return cart.requestCart(num);
    }

    public boolean checkIn(int room, int carts) {
        System.out.println("FrontDesk: Check-in processing");
        return cleanRoom(room) && requestCarts(carts);
    }

    public boolean checkOut(String plate, int carts) {
        System.out.println("FrontDesk: Check-out processing");
        return pickupVehicle(plate) && requestCarts(carts);
    }
}