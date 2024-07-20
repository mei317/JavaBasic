package chapter14_02;

import java.util.Scanner;

public class Account {

	private String accountNumber;
	private int balance;
	
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public boolean inputNumber() {
		try (Scanner scanner = new Scanner(System.in)) {
			String number = scanner.nextLine().trim();
			return this.accountNumber.equals(number);
		}
	}
	
	@Override
    public String toString() {
        return "¥" + balance + " （口座番号：" + accountNumber + "）";
    }
	
	public static void main (String[] args) {
		Account a = new Account("4649", 1592);
		
		if (a.inputNumber()) {
			System.out.println(a);
		}
	}
	
}
