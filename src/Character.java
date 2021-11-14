public class Character {
    private int hitPoints;
    private String characterClass;
    private  boolean alive;
    public Character(){

    }

    public int getHitPoints() {
        return hitPoints;
    }
    public String getCharacterClass(){
        return  characterClass;
    }
    public boolean getAlive(){
        return alive;
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    public void setCharacterClass(String characterClass){
        this.characterClass = characterClass;
    }
    public void setAlive(boolean alive){
        this.alive = alive;
    }
}
