import java.util.ArrayList;
import java.util.List;

public class MyPoint {
    private int x=0;
    private int y=0;
    private List<MyPoint> myPointList;


    public MyPoint() {
        super();
        myPointList=new ArrayList<>();
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String getXY(){
        int a[]= {x,y};
        return a[0]+", " +a[1];
    }

    public void addElements(MyPoint point){
        myPointList.add(point);
    }


    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x,int y){
        double dist= (double)(this.x-x)*(this.x-x)+(this.y-y)*(this.y-y);
        return Math.sqrt(dist);
    }

    public double distance(MyPoint another){
        int x= another.getX();
        int y= another.getY();
        double dist= (double)(this.x-x)*(this.x-x)+(this.y-y)*(this.y-y);
        return Math.sqrt(dist);

    }
    public double distance(){
        double dist= (double)(this.x-0)*(this.x-0)+(this.y-0)*(this.y-0);
        return Math.sqrt(dist);
    }

}
