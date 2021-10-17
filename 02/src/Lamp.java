public class Lamp {
    boolean isOn;
    void switchOn(){
        isOn = true;
    }
    void switchOf(){
        isOn = false;
    }
    void chekIfOn(){
        System.out.println(isOn ? "On" : "Of");
    }


}
