package test;
import java.util.Scanner;
public class Payment extends User {
    public Payment(String name, String phone, String cardNum) {
        super(name, phone, cardNum);
    }

    public void payBill() {
        System.out.println("1.Cash" + " " + "2.Credit Card");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                cashPayment();
                break;
            case 2:
                cardPayment();
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

    private void cashPayment() {
        System.out.println("Amount : ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            totalAmount -= amount;
            System.out.println("Payment Succeccful.");
            System.out.println("Due : " + totalAmount);
        } else {
            System.out.println("Invalid Amount.");
        }

    }

    private void cardPayment() {
        System.out.println("Card Number : ");
        String cNum = sc.next();
        if (cNum.length() == 10 && cNum.equals(cardNum)) {
            cashPayment();
        } else {
            System.out.println("Invalid Card.");
        }
    }
}
