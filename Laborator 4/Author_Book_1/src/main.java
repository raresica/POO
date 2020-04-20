public class main {
    public static void main(String[] args) {

        Author author1=new Author("Author1","author1@admin",'f');
        Author author2= new Author("Author2","author2@admin",'m');
        Book book1=new Book ("Carte1", author1, 100,4);
        Book book2=new Book("Carte2",author2,200,1);

        System.out.println(book1);
        System.out.println(book2);
    }
}
