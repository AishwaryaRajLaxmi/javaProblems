class MyAccount {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public MyAccount(String acc,String n,String add,String phno,String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }

    public String getAccNo(){
        return accNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    };
    public String getPhno(){
        return phno;
    }
    public String getDOB(){
        return dob;
    }
    public long getBalance(){
        return balance;
    }

    public void setAddress(String add){
        address=add;
    }
    
    public void setPhno(String phno){
        this.phno=phno;
    }
}

class SavingsAccount extends MyAccount{
    public void deposit(long amt){
        balance +=amt;
    }

    public void withdraw(long amt){
        balance-=amt;
    }

}

class LoanAccount extends MyAccount{
   
    
public void payEMI(long amt){
    balance-=amt;
}

public void repay(long amt){
 if(balance==amt){
    balance=0;
 }
}
}

public class Account{
    public static void main(String args[]){
        MyAccount obj=new MyAccount("1011111","234","Saharsa","12485994","12-01-2002");
       SavingsAccount obj1=new SavingsAccount();
       obj1.deposit(10001);
       obj1.withdraw(200);
       LoanAccount obj2=new LoanAccount();
       obj2.payEMI(1000);
       obj2.repay(2000);
    }
}
