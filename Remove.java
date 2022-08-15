import java.util.ArrayList;

public class Remove {
    public static boolean removeFromCart(ArrayList<Product> cart, Product product) {
        int len = cart.size();

        if (len - 1 == cart.size()) {
            return true;
        } else {
            return false;
        }
    }
}
