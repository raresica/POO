public class Invoice extends Customer {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID=ID;
        //this.customer = new Customer(customer.getID(), customer.getName(), customer.getDiscount());
        this.customer = customer;
        this.amount = amount;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }





    public double getAmountAfterDiscount(){
        double amountAfterDiscount= amount- this.amount*this.customer.getDiscount()/100;
        this.amount=amountAfterDiscount;
        return amountAfterDiscount;
    }
}
