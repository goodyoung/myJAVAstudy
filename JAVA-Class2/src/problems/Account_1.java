package problems;

public class Account_1 {
    private String owner;
    private long balance;
    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getBalance() {
        return this.balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    public void deposit(long balance){
        this.balance += balance;
    }
    public void withdraw(long balance){
        if (balance > this.balance){
            System.out.println("인출 상한 금액은 잔액 까지 입니다.\n현재 고객님의 잔액은 "+ this.balance + "원 입니다.");
        }
        else{
            this.balance -= balance;
        }
    }


}
