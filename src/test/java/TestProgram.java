import org.dvg.Program;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DVG85 on 11.06.2016.
 */


public class TestProgram {

    @Test
    public void testSum() throws Exception {
        assertEquals(Program.getSum(), 100);
    }
}
