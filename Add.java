import java.util.*;
public class Add {

    

    public boolean addToCart(ArrayList<Product> cart, Product product) {
        int len = cart.size();
        // push to the list.
        cart.add(product);
        // if the len == cart.size() +1;
        if (len >= cart.size()) {
            return true;
        } else {
            return false;
        }

    }

    ArrayList<Product> cart = new ArrayList<>();

}

