public class main {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,"Rares","Onescu", 1000);
        Employee employee2=new Employee(2,"Rares2","Onescu2",2000);

        System.out.println("Inainte de marime");
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        employee1.raiseSalary(30);
        employee2.raiseSalary(50);


        System.out.println("Dupa marime");
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());


    }
}
