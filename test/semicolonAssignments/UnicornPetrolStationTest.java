package semicolonAssignments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolonAssignments.UnicornPetrolStation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UnicornPetrolStationTest {
    UnicornPetrolStation fillingStation;
    @BeforeEach
    //given
    public void setUp(){
        fillingStation = new UnicornPetrolStation("Yaba");
    }
    @Test
    //when
    void testThatObjectExist(){
        // assert
        assertNotNull(fillingStation);
    }
    @Test
    //when
    public void testToSetLiterBought(){
        fillingStation.setLiterBought(4);
        //assert
        assertEquals(4, fillingStation.getLiterBought());
    }
    @Test
    //when
    public void testAmount(){
        fillingStation.setLiterBought(4);
        //assert
        assertEquals(800, fillingStation.amount());
    }

    @Test
    //when
    public  void testAmountAfterDiscount(){
        fillingStation.setLiterBought(4);
        //assert
        assertEquals(784, fillingStation.priceAfterDiscount());
    }
}