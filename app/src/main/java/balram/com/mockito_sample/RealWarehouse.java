package balram.com.mockito_sample;

import java.util.HashMap;

/**
 * Created by redcarpet on 5/8/17.
 */

public class RealWarehouse implements Warehouse {

    public RealWarehouse() {
        products = new HashMap();
        products.put("Talisker", 5);
        products.put("Lagavulin", 2);
    }

    public boolean hasInventory(String product, int quantity) {
        return inStock(product) &gt;= quantity;
    }

    public void remove(String product, int quantity) {
        products.put(product, inStock(product) - quantity);
    }

    private int inStock(String product) {
        Integer quantity = products.get(product);
        return quantity == null ? 0 : quantity;
    }

    private HashMap products;
}