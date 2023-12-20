package com.transaction;

import java.util.List;
import java.util.Scanner;

import com.customerdetails.CustomerDetails;

public class Deposite {
	

	public static void deposite(double amount,String ac_no, List<CustomerDetails> l) {
		for(CustomerDetails i:l) {
			if(ac_no.equals(i.getAccountNo())) {
				i.setBalanceForDeposit(amount);
				System.out.println(" Deposit Successfully ");
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println("Account Balance : "+i.getBalance()); 
			}
		}
		
		
	}
}
