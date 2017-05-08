package balram.com.mockito_sample;

/**
 * Created by redcarpet on 5/8/17.
 */

public interface Warehouse  {
    boolean hasInventory(String product, int quantity);
    void remove(String product, int quantity);
}