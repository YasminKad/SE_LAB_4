package mocks;

import org.example.Package;
import org.example.state.PackageState;

public class PackageStateMock extends PackageState {
    private boolean updateStateMethodInvoked = false;

    public PackageStateMock(Package userPackage) {
        super(userPackage);
    }

    public void updateState() {
        updateStateMethodInvoked = true;
    }

    public boolean isUpdateStateMethodInvoked() {
        return updateStateMethodInvoked;
    }
}