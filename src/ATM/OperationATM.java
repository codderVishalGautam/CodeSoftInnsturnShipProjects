package ATM;

import java.util.Scanner;

public class OperationATM {

	float balance;
	Scanner sc = new Scanner(System.in);
	int atmPin = 1234;

	public void validatePin() {
		System.out.println("Enter Your ATM PIN : ");
		int yourPin = sc.nextInt();
		if (atmPin == yourPin) {
			User_Menu();
		} else {
			System.out.println("Enter a Valid Pin Number!!");
		}
	}

	public void User_Menu() {
		System.out.println("Kindly choose your choice : ");
		System.out.println("1. Check A/C Balance : ");
		System.out.println("2. Withdraw Money : ");
		System.out.println("3. Deposite Money : ");
		System.out.println("4. Exit : ");
		int option = sc.nextInt();
		if (option == 1) {
			checkBalance();
		} else if (option == 2) {
			withdrawMoney();
		} else if (option == 3) {
			depositeMoney();
		} else if (option == 4) {
			return;
		} else {
			System.out.println("Choose correct choice !!");
			System.out.println("");
		}
	}

	public void checkBalance() {
		System.out.println("Available Balance : " + balance);
		System.out.println("");
		User_Menu();
	}

	public void withdrawMoney() {
		try {
			System.out.println("Enter Amount to Withdraw : ");
			float amount = sc.nextFloat();
			if (amount > balance) {
				System.out.println("Insufficient Balance.");
				System.out.println("");
			} else {
				balance -= amount;
				System.out.println("Your Money Withdraw Successfully.");
				System.out.println("");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		User_Menu();
	}

	public void depositeMoney() {
		try {
			System.out.println("Enter the Amount : ");
			System.out.println("");
			float depositeAmt = sc.nextFloat();
			balance += depositeAmt;
			System.out.println("Money Deposited Successfully.");
			System.out.println("");
			User_Menu();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
