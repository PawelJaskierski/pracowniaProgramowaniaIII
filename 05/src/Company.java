public class Company {
    String name;
    float funds;
    int stock;
    String product;
    float productPrice;
    Company(String name, float funds, int stock, String product, float productPrice){
        this.funds = funds;
        this.name = name;
        this.stock = stock;
        this.product = product;
        this.productPrice = productPrice;
    }
    void sellItems(int numberOfItems){
        this.stock -= numberOfItems;
        this.funds += numberOfItems*productPrice;
    }
    void buyItems(int numberOfItems, float unitPrice){
        this.stock += numberOfItems;
        funds -= numberOfItems*unitPrice;
    }

}
