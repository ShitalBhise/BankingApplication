package com.bank.account;

public class SavingsAccount {
	/*
	 * Creted static variables
	 */
	private static double SavingInterest;
	private static double savingBalance;

	/*
	 * Created constructor
	 */
	public SavingsAccount(double savingsBalance) {
		setSavingsBalance(savingsBalance);
	}

	/*
	 * Setting values by setters
	 */
	public void setSavingsBalance(double savingsBalance) {
		savingBalance = savingsBalance;
	}

	/*
	 * update the interest rate
	 */
	public static void addInterestRate(double newInterestRate) {

		if (newInterestRate >= 0.0)
			SavingInterest = newInterestRate;
		else
			System.out.println("interest rate must be >= 0.0");
	}

	public double getSavingsBalance() {
		return savingBalance;
	}

	/*
	 * calculates the monthly interest and update the savings balance
	 */
	public void calculateMonthlyInterest() {
		savingBalance += (savingBalance * (SavingInterest / 100) / 12);
	}

	/*
	 * return savingsBalance as string
	 */
	public String toString() {
		return String.format("%.2", getSavingsBalance());
	}
}
