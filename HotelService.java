package hotel;

public interface HotelService {
    String getServiceName();
    boolean performService(String... params);
}