public class Rectangle extends Shape{
    public double width;
    public double length;

    public Rectangle() {
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.length = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.length = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double lenght) {
        this.length = lenght;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
