package classesAndObjects;

public class Account {
    {
        System.out.println("Logic");

    }
    {
        System.out.println("2 logic");
    }
    static {
        System.out.println("static logic");
    }
    private static long id;
    private static double amount;

    public Account(){
        super();
        System.out.println(1);
    }

    public Account(long id){
        this.id = id;
        System.out.println(2);
    }

    public Account(long id, double amount){
        this();
        this.amount = amount;
        System.out.println(3);
    }

    public long getId(){
        System.out.println("4");
        return id;
    }

    public void setId(long id){
        System.out.println("5");
        this.id = id;
    }

    public double getAmount(){
        System.out.println(6);
        return amount;
    }

    public void setAmount(double amount){
        System.out.println(7);
        this.amount = amount;
    }
}

class Transfer {
    private double transferAmount;
    private double res;

    public Transfer(double amount) {
        transferAmount = amount;
    }

    public double getRes() {
        return res;
    }

    private void setRes(double result) {
        this.res = result;
    }

    public final  double transaction(Account from, Account to) {
        if (from.getAmount() > transferAmount) {
            setRes(to.getAmount() + transferAmount);

        } else {
            System.out.println("rvrvrvr");
            setRes(to.getAmount());
        }
        return getRes();
    }
}

        class Main {
            public static void main(String[] args) {
                Account account1 = new Account(8522L, 85);

            }
}

