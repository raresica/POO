public class Rectangle extends Shape {
    public double width;
    public double lenght;

    public Rectangle() {
        super();
        super.setTypeOfShape("Rectangle");
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
        super.setTypeOfShape("Rectangle");
    }

    public Rectangle(String color, boolean filled, String typeOfShape, double width, double lenght) {
        super(color, filled, typeOfShape);
        this.width = width;
        this.lenght = lenght;
        super.setTypeOfShape("Rectangle");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return lenght*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", typeOfShape='" + typeOfShape + '\'' +
                ", area=" + getArea() + '\'' +
                ", Perimeter=" + getPerimeter() + '\'' +
                '}';
    }

    @Override
    public double getPerimeter() {
        return (lenght+width)*2;

    }
}
