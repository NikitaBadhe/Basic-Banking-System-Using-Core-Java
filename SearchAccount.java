package com.account;

import java.util.List;

import com.customerdetails.CustomerDetails;

public class SearchAccount {
	public static boolean searchAccount(String ac_no,List <CustomerDetails> l) {
		boolean result=false;
		for(CustomerDetails i:l) {
			if(ac_no.equals(i.getAccountNo())) {
				result=true;
			}
		}
		return result;
	}
}
