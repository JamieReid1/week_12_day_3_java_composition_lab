import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){

        mouse = new Mouse("Dell", 2);

    }

    @Test
    public void hasBrand(){
        assertEquals("Dell", mouse.getBrand());
    }

    @Test
    public void hasButtons(){
        assertEquals(2, mouse.getNoButtons());
    }

}
