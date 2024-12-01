class Bankaccount
{
    private  int accountnumber;
    private  float balance;
    private  String name;

    public int getAccountnumber()
    {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber)
    {
        this.accountnumber = accountnumber;
    }

    public float getBalance()
    {
        return balance;
    }

    public void setBalance(float balance)
    {
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

public class Encapsulation_example1
{
    public static void main(String[] args) {
        Bankaccount obj = new Bankaccount();
        obj.setAccountnumber(1234);
        obj.setBalance(60000);
        obj.setName("vidyut");
        System.out.println("Accountnumber:" +obj.getAccountnumber());
        System.out.println("Balances :"+obj.getBalance());
          System.out.println("name :"+obj.getName());

    }
}
