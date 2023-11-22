package org.example.state;

import org.example.Package;

public class InTransitState implements PackageState {
    private Package userPackage;
    public InTransitState(Package userPackage) {
        this.userPackage = userPackage;
    }
    public void updateState() {
        System.out.println("Package is now In Transit.");
    }
}