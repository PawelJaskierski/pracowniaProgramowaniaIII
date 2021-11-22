public class Student {
    private String name;
    private int knowledgeLevel;
    private String index;
    private float funds;
    Student(String name, int knowledgeLevel, String index, float funds){
        this.name = name;
        this.knowledgeLevel = knowledgeLevel;
        this.index = index;
        this.funds = funds;
    }
    public void study(int hours){
        knowledgeLevel += hours;
    }
    public  void drinkBeer(int bottles){
        funds -= 6*bottles;
        if(funds<0){
            System.out.println("You broke now");
        }
    }
    public int getKnowledgeLevel() {
        return knowledgeLevel;
    }

    public void setKnowledgeLevel(int knowledgeLevel) {
        this.knowledgeLevel = knowledgeLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public float getFunds() {
        return funds;
    }

    public void setFunds(float funds) {
        this.funds = funds;
    }
}
