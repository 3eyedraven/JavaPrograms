package com.cg.banking.util;
import java.util.HashMap;
import com.cg.banking.beans.Account;

public class BankingServicesUtil {
	public static HashMap<Integer, Account> associates=new HashMap<>();
	private static int ASSOCIATE_ID_COUNTER=200;
	public static int getASSOCIATE_ID_COUNTER() {
		return ++ASSOCIATE_ID_COUNTER;
	}
	public static double getPin() {
		double pin=Math.random();
		return pin;
	}
	public static String getACCOUNT_STATUS() {
		// TODO Auto-generated method stub
		return null;
	}
}
