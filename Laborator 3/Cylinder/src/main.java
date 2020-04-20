public class main {
    public static void main(String[] args) {
        Circle circle1= new Circle(2.0, "red");
        System.out.println(circle1.toString());
        Circle circle2= new Circle(3.0, "blue");
        System.out.println(circle2.toString());

        Cylinder cylinder1= new Cylinder(2.0,"Yellow",2.0);
        System.out.println(cylinder1);
        Cylinder cylinder2= new Cylinder(3.0,"Purple", 3.0);
        System.out.println(cylinder2);


    }
}
