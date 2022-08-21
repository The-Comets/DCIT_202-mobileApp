import java.util.*;


public class Test {

    public static void main(String[] args) {
        Add add = new Add();
        Product product1 = new Product("2AW", 5);
        Product product2 = new Product("13W", 1);
        Product product3 = new Product("P5W", 2);
        ArrayList<Product> cart = new ArrayList<>();

        
        boolean added = add.addToCart(cart, product1);
        System.out.print(added);


        

    }

}
