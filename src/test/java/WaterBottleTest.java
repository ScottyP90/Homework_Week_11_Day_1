import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void Volume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void empty(){
        waterBottle.drink();
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void refill(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(100, waterBottle.refillBottle());
    }
}
