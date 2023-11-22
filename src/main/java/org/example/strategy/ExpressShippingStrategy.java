package org.example.strategy;

public class ExpressShippingStrategy implements ShippingStrategy {
    @Override
    public void ship() {
        System.out.println("Package is shipped by Express Shipping - Shipping Cost: 30$");
    }
}