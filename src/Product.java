public class Product {
    private String name;
    private boolean vegetarian;
    public Product(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setVegetarian(boolean vegetarian){
        this.vegetarian = vegetarian;
    }
    public boolean getVegetarian(){
        return vegetarian;
    }
}
