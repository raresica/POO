public abstract class Shape {
    public String color;
    public boolean filled;
    public String typeOfShape;

    public Shape() {
        super();
    }

    public Shape(String color, boolean filled, String typeOfShape) {
        this.color = color;
        this.filled = filled;
        this.typeOfShape = typeOfShape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getTypeOfShape() {
        return typeOfShape;
    }

    public void setTypeOfShape(String typeOfShape) {
        this.typeOfShape = typeOfShape;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", typeOfShape='" + typeOfShape + '\'' +
                '}';
    }
}
