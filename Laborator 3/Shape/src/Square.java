public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side,side);

    }

    public Square(String color, boolean filled,double side) {
        super(color,filled,side,side);

    }


    public double getSide() {

        return super.getLength();
    }


    public void setSide(double side) {

        super.setLength(side);
        super.setWidth(side);
    }

    public void setLength(double side){
        setSide(side);
    }

    public void setWidth(double side){
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                ", color=" + color + '\'' +
                ", filled=" + filled +
                ", perimeter=" + getPerimeter() +
                ", area= " +getArea() +
                '}';
    }
}
