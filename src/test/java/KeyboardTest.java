import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){

        keyboard = new Keyboard("Logitech", "English, UK");

    }

    @Test
    public void hasBrand(){
        assertEquals("Logitech", keyboard.getBrand());
    }

    @Test
    public void hasALanguage(){
        assertEquals("English, UK", keyboard.getLanguage());
    }

    @Test
    public void canPressKey(){
        assertEquals("Tap Tap!", keyboard.pressKey());
    }

}
