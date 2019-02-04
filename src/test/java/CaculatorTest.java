import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CaculatorTest {

    Caculator caculator;

    @Before
    public void before(){
        caculator = new Caculator(42,2);
    }

    @Test
    public void addNumbers(){
        assertEquals(44, caculator.addNumbers());
    }

    @Test
    public void subtractNumbers(){
        assertEquals(40, caculator.subtractNumbers());
    }

    @Test
    public void multiplyNumbers(){
        assertEquals(84, caculator.multiplyNumbers());
    }

    @Test
    public void divideNumbers(){
        assertEquals(21.0, caculator.divideNumbers());
    }
}
