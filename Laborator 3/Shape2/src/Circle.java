public class Circle extends Shape {
    public double radius;

    public Circle() {
        super();
        super.setTypeOfShape("Circle");
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
       return 2*Math.PI*radius;
    }

    public Circle(double radius) {
        this.radius = radius;
        super.setTypeOfShape("Circle");
    }

    public Circle(String color, boolean filled, String typeOfShape, double radius) {
        super(color, filled, typeOfShape);
        this.radius = radius;
        super.setTypeOfShape("Circle");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", typeOfShape='" + typeOfShape + '\'' +
                ", area=" + getArea() + '\'' +
                ", Perimeter=" + getPerimeter() + '\'' +
                '}';
    }
}
