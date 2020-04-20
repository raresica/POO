public class main {
    public static void main(String[] args) {

        Shape square= new Square("Blue", true,"Square", 3);
        Shape rectangle = new Rectangle("Red", false,"Rectangle", 2.5,3.0);
        Shape circle =new Circle("Yellow", true,"Circle", 3.0);

        System.out.println(square);
        System.out.println(rectangle);
        System.out.println(circle);

    }
}
