public class Book {
    String name;
    String type;
    int pageCount;
    int acts;
    Book(String name, String type, int pageCount, int acts){
        this.acts = acts;
        this.type = type;
        this.name = name;
        this.pageCount = pageCount;
    }
    public double averagePageInAct(){
        return (pageCount/acts);
    }
}
