package org.example.state;

import org.example.Package;

public class DeliveredState extends PackageState {
    public DeliveredState(Package userPackage) {
        super(userPackage);
    }
    public void updateState() {
        System.out.println("Package is now Delivered.");
    }
}