package semicolonAssignments;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class AirConditionerTest {
        @Test

        public void testAirconditionCreation() {
            AirConditioner sharp = new AirConditioner();
            Assert Assertions;
            assertNotNull(sharp);
        }

        @Test
        public void testAirConditionCanBeOn(){
            AirConditioner sharp = new AirConditioner();
            sharp.turnOn();
            assertTrue(sharp.isOn());
        }

        @Test
        public void testAirConditionCanBeOff(){
            AirConditioner sharp = new AirConditioner();
            sharp.turnOff();
            assertFalse(sharp.isOn());
        }

        @Test
        public void testAirConditionTemperatureCanIncrease(){
            AirConditioner sharp = new AirConditioner();
            sharp.increaseTemp();
            assertEquals(18, sharp.getTemperaturep());
        }

        @Test
        public void testAirConditionTemperatureCanDecrease(){
            AirConditioner sharp = new AirConditioner();
            sharp.DecreaseTemp();
            assertEquals(17, sharp.getTemperaturep());
        }

        @Test
        public void testTemperatureCantGoBeyound30(){
            AirConditioner sharp = new AirConditioner();
            sharp.increaseTemp();
            assertEquals(30, sharp.increaseTemp());
        }

        @Test
        public void testTemperatureCantGoBlow16(){
            AirConditioner sharp = new AirConditioner();
            sharp.DecreaseTemp();
            assertEquals(30, sharp.increaseTemp());
        }
}


