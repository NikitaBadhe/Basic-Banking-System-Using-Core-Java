package com.customerdetails;

public class CustomerDetails {

	private String customerName;
	private String accountNo;
	private String accountType;
	private double balance;
	private String adharNo;

	public CustomerDetails(String customerName, String accountNo, String accountType, double balance,String adharNo) {
		this.customerName = customerName;
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
		this.adharNo=adharNo;
	}

	public void setBalanceForDeposit(double balance) {
		this.balance = this.balance + balance;
	}

	public void setBalanceForWithdraw(double balance) {
		if (this.balance > balance) {
			this.balance = this.balance - balance;
			System.out.println(" Withdraw Successfully ");
		}
		else {
			System.out.println(" Insufficient fund ");
		}
	}

	public String getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}
	
	public String getAdharNo() {
		return adharNo;
	}
	
	public void setAdharNo(String adharNo) {
		this.adharNo=adharNo;
	}

	public void showAccount() {
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Customer Name : " + customerName);
		System.out.println("Account No : " + accountNo);
		System.out.println("Account Type : " + accountType);
		System.out.println("Balance : " + balance);
		System.out.println("Adhar No : "+adharNo);
		System.out.println("-------------------------------------------------------------------------------");
	}

}
