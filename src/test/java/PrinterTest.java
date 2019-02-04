import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void getPaper(){
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void printTest(){
        printer.print(5);
        assertEquals(45, printer.getPaper());
        assertEquals(45, printer.getToner());
    }

    @Test
    public void printFail(){
        printer.print(55);
        assertEquals(50, printer.getPaper());
        assertEquals(50, printer.getToner());
    }

    @Test
    public void refillPrinter(){
        printer.print(10);
        assertEquals(50, printer.refillPaper());
    }

    @Test
    public void getToner(){
        assertEquals(50, printer.getToner());
    }

}
