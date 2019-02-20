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

    @Test
    public void canMove(){
        assertEquals("Zooom!", mouse.move());
    }

    @Test
    public void canClick(){
        assertEquals("Click!", mouse.click());
    }

    @Test
    public void canSendData(){
        assertEquals("I have clicked!", mouse.sendData("I have clicked!"));
    }

}
