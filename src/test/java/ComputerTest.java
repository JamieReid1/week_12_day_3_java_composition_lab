import behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Computer computer;
    Monitor monitor;
    Keyboard keyboard;

    @Before
    public void before() {

        monitor = new Monitor(22, 786432);
        keyboard = new Keyboard("Logitech", "English, UK");
        computer = new Computer(8, 512, monitor, keyboard);
    }


    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

//    @Test
//    public void hasMonitor() {
//        assertEquals(22, computer.getMonitor().getScreenSize());
//        assertEquals(786432, computer.getMonitor().getPixels());
//    }

    @Test
    public void hasOutputDevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Computer computer = new Computer(8, 512, printer, keyboard);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker, keyboard);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOutputDevice(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void hasInputDevice(){
        assertEquals(keyboard, computer.getInputDevice());
    }

    @Test
    public void canSetInputDevice(){
        Mouse mouse = new Mouse("Dell", 10);
        computer.setInputDevice(mouse);
        assertEquals(mouse, computer.getInputDevice());
    }

    @Test
    public void canInputDataFromKeyboard(){
        assertEquals("Tap Tap! : Tappety Tap!", computer.inputData("Tappety Tap!"));
    }

    @Test
    public void canInputDataFromMouse(){
        Mouse mouse = new Mouse("Dell", 10);
        computer.setInputDevice(mouse);
        assertEquals("Click! : Clickedy Click!", computer.inputData("Clickedy Click!"));
    }

}
