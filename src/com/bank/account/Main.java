package com.bank.account;

public class Main {

	public static void main(String[] args) {

		SavingsAccount.addInterestRate(4);

		SavingsAccount saver1 = new SavingsAccount(2000.0);
		saver1.calculateMonthlyInterest();
		System.out.println("This month:\nSaver 1 balance= " + saver1.getSavingsBalance());

		SavingsAccount saver2 = new SavingsAccount(3000.0);
		saver2.calculateMonthlyInterest();
		System.out.println("Saver 2 balance= " + saver2.getSavingsBalance());

		SavingsAccount.addInterestRate(5);

		saver1.calculateMonthlyInterest();
		System.out.println("Next month:\nSaver 1 balance= " + saver1.getSavingsBalance());

		saver2.calculateMonthlyInterest();
		System.out.println("Saver 2 balance= " + saver2.getSavingsBalance());

	}
}