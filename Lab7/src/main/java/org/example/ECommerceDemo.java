package org.example;
import java.util.HashMap;

public class ECommerceDemo {
    public static void main(String[] args) {
        ECommercePlatform platform = new ECommercePlatform();

        User user1 = new User(1, "JohnDoe", new HashMap<>());
        User user2 = new User(2, "JaneDoe", new HashMap<>());
        platform.addUser(user1);
        platform.addUser(user2);

        Product apple = new Product(1, "Apple", 0.50, 100);
        Product banana = new Product(2, "Banana", 0.30, 150);
        platform.addProduct(apple);
        platform.addProduct(banana);

        user1.addToCart(apple, 5);
        user2.addToCart(banana, 3);

        platform.createOrder(1, user1);
        platform.createOrder(2, user2);

        System.out.println("Available Products:\n" + platform.getAvailableProducts());
        System.out.println("Users List:\n" + platform.getUsersList());
        System.out.println("Orders List:\n" + platform.getOrdersList());

        platform.updateProductStock(apple.getId(), 80);
        System.out.println("Products sorted by Price:\n" + platform.sortProductsByPrice());
        System.out.println("Products sorted by Stock:\n" + platform.sortProductsByStock());

        System.out.println("Recommended Products for User1:\n" + platform.recommendProducts(user1));
        System.out.println("Recommended Products for User2:\n" + platform.recommendProducts(user2));
    }
}


