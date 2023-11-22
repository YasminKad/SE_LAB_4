package org.example.state;

import org.example.Package;

public class DeliveredState implements PackageState {
    private Package userPackage;
    public DeliveredState(Package userPackage) {
        this.userPackage = userPackage;
    }
    public void updateState() {
        System.out.println("Package is now Delivered.");
    }
}