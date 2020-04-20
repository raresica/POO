import java.util.ArrayList;
import java.util.List;

public class Book  {
    private String name;
    private double price;
    private int qty;
    List<Author> authorList;

    public Book(String name, List authorList, double price) {
        this.name = name;
        this.authorList = authorList;
        this.price = price;
    }

    public Book(String name, List authorList, double price, int qty) {
        this.name = name;
        this.authorList = authorList;
        this.price = price;
        this.qty = qty;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
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



    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + authorList +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
