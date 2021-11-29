import java.util.List;

public class Bookcase {
    private List<Book> books;

    public void present(){
        for (Book book: books) {
            book.present();
            }
        }
    public  void addBook(Book book){
        books.add(book);
    }
    public  void removeBook(String title){
        int counter = 0;
        for (Book book: books) {
            if(book.getTitle() == title){
                books.remove(counter);
            }
            counter += 1;
        }
    }
}
