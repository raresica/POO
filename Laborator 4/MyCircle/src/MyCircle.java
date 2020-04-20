public class MyCircle extends MyPoint {
    private MyPoint center;
    private int radius =1;

    public MyCircle() {
        super();
    }

    public MyCircle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX(){
        return center.x;
    }

    public void setCenterX(int x){
        this.center.x=center.x;
    }

    public int getCenterY(){
        return center.y;
    }

    public void setCenterY(int y){
        this.center.y=center.y;
    }

    public String getCenterXY(){
        int a[]={x,y};
        return a[0]+" "+a[1];
    }

    public void setCenterXY(int x, int y)
    {
        this.center.x=center.x;
        this.center.y=center.y;
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public double getArea(){
        double area= Math.PI*radius*radius;
        return area;
    }

    public double getCircumference(){
        double circumference=2*Math.PI*radius;
        return circumference;
    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}
