package device_management;

import behaviours.IInput;

public class Keyboard implements IInput {

    String brand;
    String language;

    public Keyboard(String brand, String language){
        this.brand = brand;
        this.language = language;
    }

    public String getBrand() {
        return brand;
    }

    public String getLanguage() {
        return language;
    }

    public String pressKey(){
        return "Tap Tap!";
    }

    @Override
    public String sendData(String data) {
        return data;
    }
}
