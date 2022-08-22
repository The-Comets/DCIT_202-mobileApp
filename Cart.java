import java.util.ArrayList;

public class Cart {
    ArrayList<Product> cart = new ArrayList<>();

    private static Cart cartInstance = null;
    
    public static Cart getCartInstance() {
        if(cartInstance == null) {
            cartInstance = new Cart();
        }
        return cartInstance;
    }

    public boolean add(Product item) {
        try {
            this.cart.add(item);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    public boolean remove(Product item) {
        try {
            this.cart.remove(item);
            return true;
        }
        catch(Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    /**
     * 
     * @param item: recieves the newly updated product;
     * @return: true on success and false on fail.
     */
    public boolean updateItem(Product item) {
        try {
            for(Product a: cart) {
                if(a == item) {
                    a = item;
                }
            }
            return true;
        }
        catch(Exception e) {
            // TODO: handle exception;
            return false;
        }
    }
}