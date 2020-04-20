public class main {
    public static void main(String[] args) {

        Shape square= new Square("Blue", true, 3);
        Shape rectangle = new Rectangle("Red", false, 2.5,3.0);
        Shape circle =new Circle("Yellow", true, 3.0);

        System.out.println(square.toString());
        System.out.println(rectangle.toString());
        System.out.println(circle.toString());

    }
}
