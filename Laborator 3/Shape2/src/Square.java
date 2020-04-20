public  class Square extends Rectangle{
    public Square() {
        super();
        super.setTypeOfShape("Square");
    }

    public Square(double side) {
        super(side, side);
        super.setTypeOfShape("Square");
    }

    public Square(String color, boolean filled, String typeOfShape, double side) {
        super(color, filled, typeOfShape, side, side);
        super.setTypeOfShape("Square");
    }

    public double getSide()
    {
        return super.getLenght();
    }

    public void setSide(double side){
        super.setLenght(side);
        super.setWidth(side);

    }
    public void setLength(double side)
    {
        setSide(side);
    }
    public void setWidth(double side)
    {
        setSide(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
