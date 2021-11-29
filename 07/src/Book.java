import java.util.List;

public class Book {
   private Writer author;
   private int numberOfPages;
   private String title;
   private List<Chapter> chapters;

    public Book(Writer author, int numberOfPages, String title, List<Chapter> chapters) {
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.chapters = chapters;
    }
    public Book(int numberOfPages, String title, String name, String surname) {
        this.author = new Writer(name, surname);
        this.numberOfPages = numberOfPages;
        this.title = title;
    }
    public void present(){
        System.out.println("Title: " + getTitle() +"\nNumber of pages: " + numberOfPages + "\nWritten by: " + author.sign());
        for (Chapter chapter: chapters) {
            System.out.println(chapter.chapterTitle);
        }
    }

    public String getTitle() {
        return title;
    }

}
