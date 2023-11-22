package mocks;
import org.example.state.PackageState;
import org.example.strategy.ShippingStrategy;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class ShippingStrategyMock implements ShippingStrategy {
    private boolean shipMethodInvoked = false;

    @Override
    public void ship() {
        shipMethodInvoked = true;
    }

    public boolean isShipMethodInvoked() {
        return shipMethodInvoked;
    }
}
