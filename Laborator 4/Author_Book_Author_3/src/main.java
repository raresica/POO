import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Author author1=new Author("Author1","author1@admin",'f');
        Author author2= new Author("Author2","author2@admin",'m');

        List<Author> authorList = new ArrayList<>();
        authorList.add(new Author("Author2", "author2@admin", 'm'));
        authorList.add(new Author("Author1","author1@admin",'f'));

        Book book1=new Book ("Carte1", authorList, 100,4);
        Book book2=new Book("Carte2",authorList,200,1);

        System.out.println(book1);
        System.out.println(book2);
    }
}
