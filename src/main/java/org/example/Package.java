package org.example;
import org.example.state.InTransitState;
import org.example.state.PackageState;
import org.example.strategy.ShippingStrategy;
import org.example.strategy.StandardShippingStrategy;

public class Package {
    private ShippingStrategy shippingStrategy;
    private PackageState packageState = new InTransitState(this);

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setPackageState(PackageState packageState) {
        this.packageState = packageState;
    }

    public void shipPackage() {
        shippingStrategy.ship();
    }

    public void updatePackageState() {
        packageState.updateState();
    }

    public ShippingStrategy getShippingStrategy() {
        return this.shippingStrategy;
    }


    public PackageState getPackageState() {
        return this.packageState;
    }
}