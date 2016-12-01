package Switch;

/**
 * Created by KJCurtis on 11/29/16.
 */
public class Switch {
    private boolean isOn;

    Switch() {
        isOn = false;
    }
    public String flip() {
        if (isOn) {
            turnOff();
             return "lights out";
        } else {
            turnOn();
             return "lights on";
        }
    }


    protected void turnOn() {
        isOn = true;
    }
    protected void turnOff() {
        isOn = false;
    }
}
