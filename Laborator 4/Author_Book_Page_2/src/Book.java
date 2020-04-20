import java.util.ArrayList;
import java.util.List;

public class Book  {
    private String name;
    private Author author;
    private double price;
    private int qty;
    List<Page> pageList;

    public Book(String name, Author author, double price, List pageList) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pageList=pageList;
    }

    public Book(String name, Author author, double price, int qty,List pageList) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
        this.pageList=pageList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public List<Page> getPageList() {
        return pageList;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", qty=" + qty +
                ", pageList=" + pageList +
                '}';
    }
}
