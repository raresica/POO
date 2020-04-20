public class main {
    public static void main(String[] args) {
    Account account1= new Account("1","Rares1", 10);
    Account account2= new Account("2","Rares2", 10);

    account1.credit(100);
    account2.debit(3);
    account1.transferTo(account2,5);

        System.out.println("account1= "+account1);
        System.out.println("account2= "+account2);
    }
}
