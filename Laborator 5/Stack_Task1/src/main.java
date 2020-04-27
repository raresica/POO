

public class main {
    public static void main(String[]args){
        Customer customer1 = new Customer(1, "Rares", 50);
        ObjectStack stack= new ObjectStack<String>(100);
        System.out.println(stack.isEmpty());
        stack.push("text");
        stack.push(2.0);
        stack.push(Math.PI);
        stack.pop();
        stack.push(customer1);
        System.out.println(stack.peek());
        System.out.println(stack.isFull());
        System.out.println(stack.toString());


    }
}
