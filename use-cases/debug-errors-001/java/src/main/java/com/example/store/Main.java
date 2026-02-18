// Main.java

package com.example.store;

public class Main {
    public static void main(String[] args) {
        // Use ShoppingCart from ShoppingCart.java
        ShoppingCart cart = new ShoppingCart();
        
        // Example usage
        cart.addItem(new Product("Milk", 2.99));
        cart.addItem(new Product("Bread", 1.50));
        cart.checkout();
    }
}