public class main {
    public static void main(String[] args){

        Customer customer1 = new Customer(1, "Rares", 50);
        Customer customer2= new Customer(2, "Alen", 10);

        Account account1 = new Account(1,customer1,100);
        Account account2 = new Account(2, customer2,100);




        Invoice invoice1 = new Invoice(1,customer1,100);
        Invoice invoice2 =new Invoice(2, customer2, 50 );

        invoice1.setAmount(invoice1.getAmountAfterDiscount());
        invoice2.setAmount(invoice2.getAmountAfterDiscount());

        System.out.println("The amount after discount for"+ invoice1.getCustomer().toString() +invoice1.getAmount());
        System.out.println("The amount after discount for"+ invoice2.getCustomer().toString() +invoice2.getAmount());

        account1=account1.deposit(100);
        account2=account2.deposit(200);

        account1=account1.withdraw(invoice1.getAmount());
        account2=account2.withdraw(invoice2.getAmount());

        System.out.println("After the withdraw: "+ account1);
        System.out.println("After the withdraw: "+ account2);



    }
}
