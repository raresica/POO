import javafx.scene.shape.Circle;

public class main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint();
        p2.setXY(3,7);
        MyCircle circle1= new MyCircle(p1, 1);
        MyCircle circle2= new MyCircle(p2,2);
        System.out.println(circle1.distance(circle2));
    }
}
