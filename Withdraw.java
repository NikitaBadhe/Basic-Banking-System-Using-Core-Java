package com.transaction;

import java.util.List;
import java.util.Scanner;

import com.customerdetails.CustomerDetails;

public class Withdraw {

	public static void withdraw(double amount,String ac_no, List<CustomerDetails> l) {
		for(CustomerDetails i:l) {
			if(ac_no.equals(i.getAccountNo())) {
				i.setBalanceForWithdraw(amount);
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println(" Account Balance : "+i.getBalance()); 
				
			}
				
		}
		
		
	}
}
