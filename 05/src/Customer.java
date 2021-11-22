public class Customer {
    String name;
    int age;
    String address;
    Customer(String name, int age, String address){
        this.address = address;
        this.age = age;
        this.name = name;
    }
    String sign(){
        return name;
    }
}
