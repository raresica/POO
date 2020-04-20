public class main {
    public static void main(String[] args) {
        MyTriangle triangle1= new MyTriangle(0, 0, 10, 0, 0, 10);
        MyPoint point1= new MyPoint(0, 11);
        MyPoint point2= new MyPoint(0, 0);
        MyPoint point3= new MyPoint(10, 1);

        MyTriangle triangle2= new MyTriangle(point1,point2,point3);

        System.out.println(triangle1);
        System.out.println(triangle2);
    }
}
