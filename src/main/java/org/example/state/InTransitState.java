package org.example.state;

import org.example.Package;

public class InTransitState extends PackageState {
    public InTransitState(Package userPackage) {
        super(userPackage);
    }
    public void updateState() {
        System.out.println("Package is now In Transit.");
    }
}