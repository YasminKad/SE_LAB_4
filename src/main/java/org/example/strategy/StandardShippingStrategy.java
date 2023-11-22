package org.example.strategy;

public class StandardShippingStrategy implements ShippingStrategy {
    @Override
    public void ship() {
        System.out.println("Package is shipped by Standard Shipping - Shipping Cost: 15$");
    }
}