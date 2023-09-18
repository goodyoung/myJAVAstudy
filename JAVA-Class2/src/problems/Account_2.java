package problems;

public class Account_2 {
    public static void main(String[] args) {
        Account_1 acc = new Account_1();
        acc.setOwner("Goh");
        acc.setBalance(1230000);
        System.out.println(acc.getBalance());
        acc.deposit(123);
        System.out.println(acc.getBalance());
        acc.withdraw(112312312);
//        System.out.println(acc.getBalance());

    }
}
