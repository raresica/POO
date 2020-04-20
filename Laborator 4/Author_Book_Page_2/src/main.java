import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Author author1=new Author("Author1","author1@admin",'f');
        Author author2= new Author("Author2","author2@admin",'m');

        List<Page> pageList = new ArrayList<>();
        pageList.add(new Page(1, 100, "gigel"));
        pageList.add(new Page(2, 102, "gigel1"));

        Book book1=new Book ("Carte1", author1, 100,4, pageList);
        Book book2=new Book("Carte2",author2,200,1, pageList);

        System.out.println(book1);
        System.out.println(book2);
    }
}
