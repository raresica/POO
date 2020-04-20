public class main {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle();
        Rectangle rectangle2=new Rectangle((float) 2.0,(float) 2.5);

        rectangle1.setLenght((float) 1.0);
        rectangle1.setWidth((float) 1.5);

        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());

        System.out.println("Area of rectangle1= "+rectangle1.getArea()+" and perimeter= "+rectangle1.getPerimeter());
        System.out.println("Area of rectangle2= "+rectangle2.getArea()+" and perimeter= "+rectangle2.getPerimeter());

    }
}
