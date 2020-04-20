public class main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint();
        p2.setXY(3,7);
        System.out.println("distance from " +p1.getXY()+" to " +p2.getXY()+" = "+p1.distance(p2));
        System.out.println(p1.distance());

    }
}
