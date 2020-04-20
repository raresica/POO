public class Main {
    public static void main(String[] args) {
    Circle circle1=new Circle();
    Circle circle2=new Circle(1.0);
    Circle circle3=new Circle(1.0,"red");

    circle1.setColor("blue");
    circle1.setRadius(1.4);
    circle2.setColor("purple");

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());

        System.out.println("circle1 area= " +circle1.getArea());
        System.out.println("circle3 area= " +circle3.getArea());
    }
}
