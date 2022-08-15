import java.util.ArrayList;

public class main {
    public static void main(String args[]) {
        ArrayList<Product> cart = new ArrayList<>();
        Product a =new Product("82", 25);
        
        cart.add(new Product("42", 23));
        cart.add(new Product("32", 3));
        cart.add(new Product("62", 23));
        cart.add(new Product("22", 65));
        cart.add(a);

        
        boolean b = Remove.removeFromCart(cart, a);
        System.out.println(b);

    }

}
