package hotel.services;
import hotel.HotelService;

public class Cart implements HotelService {
    public String getServiceName() {
        return "Luggage Cart";
    }

    public boolean requestCart(int numberOfCarts) {
        if (numberOfCarts <= 0) return false;
        System.out.println("Cart: Preparing " + numberOfCarts + " carts");
        return true;
    }

    public boolean performService(String... params) {
        try {
            if (params.length == 0) return false;
            int carts = Integer.parseInt(params[0]);
            return requestCart(carts);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}