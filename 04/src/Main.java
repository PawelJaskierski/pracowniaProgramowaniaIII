public class Main {
    public static void main(String[] args){
        Product p1 = new Product();
        p1.setName("product");
        System.out.println( p1.getName() );
        p1.setVegetarian(true);
        System.out.println(p1.getVegetarian());
    }
}
