package mocks;

import org.example.Package;
import org.example.state.PackageState;

public class PackageStateMock implements PackageState {
    private boolean updateStateMethodInvoked = false;

    public void updateState() {
        updateStateMethodInvoked = true;
    }

    public boolean isUpdateStateMethodInvoked() {
        return updateStateMethodInvoked;
    }
}