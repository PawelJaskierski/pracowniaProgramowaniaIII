import java.util.ArrayList;
public class ShoppingList {
    ArrayList<String> products;
    public ShoppingList(){
        products = new ArrayList<String>();
    }
     public int returnNumberOfProducts(){
        int sum = 0;
         for (String product:products) {
             product +=1;
         }
         return sum;
    }
    public void addProduct(String product){
        products.add(product);
    }
    public void addProduct(){
        products.add(System.console().readLine());
    }
    public void displayList(){
        for (String product:products) {
            System.out.print(product+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        ShoppingList s1 = new ShoppingList();
        s1.displayList();
        s1.returnNumberOfProducts();
        s1.addProduct("1");
        s1.addProduct("2");
        s1.addProduct("3");
        s1.displayList();
        s1.returnNumberOfProducts();
        s1.addProduct("4");
        s1.displayList();
        s1.returnNumberOfProducts();
    }
}
