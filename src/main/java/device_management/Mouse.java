package device_management;

import behaviours.IInput;

public class Mouse implements IInput {

    private String brand;
    private int noButtons;

    public Mouse(String brand, int noButtons){
        this.brand = brand;
        this.noButtons = noButtons;
    }

    public String getBrand() {
        return brand;
    }

    public int getNoButtons() {
        return noButtons;
    }

    public String move(){
        return "Zooom!";
    }

    public String click(){
        return "Click!";
    }

    @Override
    public String sendData(String data) {
        return data;
    }
}
