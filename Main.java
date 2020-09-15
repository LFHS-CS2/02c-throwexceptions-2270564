import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args)  {
        try {
            BankAccount b1 = new BankAccount(100);
            b1.withdraw(110);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            BankAccount b2 = new BankAccount(100);
            b2.withdraw2(110);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            BankAccount b3 = new BankAccount(100);
            b3.withdraw(110);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
