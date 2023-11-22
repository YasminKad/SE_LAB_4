import mocks.PackageStateMock;
import mocks.ShippingStrategyMock;
import org.example.state.InTransitState;
import org.example.state.PackageState;
import org.example.strategy.ShippingStrategy;
import org.example.strategy.StandardShippingStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.example.Package;

class PackageTest {

    @Test
    void setShippingStrategy_shouldSetStrategy() {
        Package myPackage = new Package();
        ShippingStrategy strategy = new StandardShippingStrategy();
        myPackage.setShippingStrategy(strategy);
        assertEquals(strategy, myPackage.getShippingStrategy());
    }

    @Test
    void setPackageState_shouldSetState() {
        Package myPackage = new Package();
        PackageState state = new InTransitState(myPackage);
        myPackage.setPackageState(state);
        assertEquals(state, myPackage.getPackageState());
    }

    @Test
    void shipPackage_shouldInvokeShippingStrategy() {
        Package myPackage = new Package();
        ShippingStrategyMock strategyMock = new ShippingStrategyMock();
        myPackage.setShippingStrategy(strategyMock);
        myPackage.shipPackage();
        assertTrue(strategyMock.isShipMethodInvoked());
    }

    @Test
    void updatePackageState_shouldInvokeUpdateState() {
        Package myPackage = new Package();
        PackageStateMock stateMock = new PackageStateMock();
        myPackage.setPackageState(stateMock);
        myPackage.updatePackageState();
        assertTrue(stateMock.isUpdateStateMethodInvoked());
    }
}
