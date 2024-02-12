package test;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    ArrayList<Item> ItemList = new ArrayList<>();
    String name;
    String phone;
    double totalAmount;
    String cardNum;

    public User(String name, String phone, String cardNum) {
        this.name = name;
        this.phone = phone;
        this.cardNum = cardNum;
    }

    public void additem(Item item) {
        ItemList.add(item);
        System.out.println("Item added Successfully.");
    }

    public void removeitem(Item item) {
        for (Item i : ItemList) {
            if (i.equals(item)) ItemList.remove(i);
            System.out.println("Item removed Successfully.");
        }
        System.out.println("Not in the List");
    }

    public double calcBill() {
        for (Item i : ItemList) {
            totalAmount += i.quantity * i.unitPrice;
        }
        return totalAmount;
    }

    public void showBill() {
        System.out.println("Total Bill : " + calcBill());
    }

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
}







