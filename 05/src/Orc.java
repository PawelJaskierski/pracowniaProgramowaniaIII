public class Orc {
    public int age;
    public String fantasySetting;
    public String skinColor;
    public boolean hasWeapon;

    public Orc(int age, String fantasySetting, String skinColor, boolean hasWeapon){
        this.age = age;
        this.fantasySetting = fantasySetting;
        this.skinColor = skinColor;
        this.hasWeapon = hasWeapon;
    }
    public void equipWeapon(){
        hasWeapon = true;
    }
    public void dropWeapon(){
        hasWeapon = false;
    }
    public String shout(){
        return "AAAAAAAAAAAAAAAAAAAA";
    }
}
