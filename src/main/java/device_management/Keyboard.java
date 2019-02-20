package device_management;

public class Keyboard {

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
}
