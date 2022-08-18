package com.cg.banking.services;

import java.util.List;

import com.cg.banking.beans.Account;
import com.cg.banking.beans.Transaction;
import com.cg.banking.daoservices.AccountDAO;
import com.cg.banking.daoservices.AccountDAOImpl;
import com.cg.banking.daoservices.TransactionDAO;
import com.cg.banking.daoservices.TransactionDAOImpl;
import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InsufficientAmountException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.exceptions.InvalidPinNumberException;
import com.cg.banking.util.BankingServicesUtil;

public class BankingServicesImpl implements BankingServices {
	
	private AccountDAO accountDao = new AccountDAOImpl();
	private TransactionDAO transactionDao = new TransactionDAOImpl();

	@Override
	public Account openAccount(String accName, String address, double mobileNo, String string, String nomineeName,
			String string2, String string3, String accountType)
			throws InvalidAmountException, InvalidAccountTypeException, BankingServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float depositAmount(long accountNo, float amount)
			throws AccountNotFoundException, BankingServicesDownException, AccountBlockedException {
		Account account = accountDao.findOne(accountNo);
		float finalAmount = account.getAccountBalance()+amount;
		return finalAmount;
	}
	/*
	 * 
	 * public float depositAmount(long accountNo,float 
	 * @see com.cg.banking.services.BankingServices#withdrawAmount(long, float)
	 */

	@Override
	public float withdrawAmount(long accountNo, float amount, int pinNumber) throws InsufficientAmountException,
			AccountNotFoundException, InvalidPinNumberException, BankingServicesDownException, AccountBlockedException {
		Account account = accountDao.findOne(accountNo);
		float finalBalance=account.getAccountBalance();
		if (pinNumber==account.getPinNumber()) {
			finalBalance=account.getAccountBalance()-amount;
		}
		else {
			throw new InvalidPinNumberException()
		}
		return finalBalance;
	}

	@Override
	public float fundTransfer(long accountNoTo,long accountNoFrom, float transferAmount,int pinNumber)
			throws InsufficientAmountException, AccountNotFoundException, InvalidPinNumberException,
			BankingServicesDownException, AccountBlockedException {
		withdrawAmount(accountNoFrom, transferAmount,pinNumber);
		depositAmount(accountNoTo, transferAmount);
	}

	@Override
	public Account getAccountDetails(long accountNo) throws AccountNotFoundException, BankingServicesDownException {
		Account account = accountDao.findOne(accountNo);
		if (account==null)
			throw new AccountNotFoundException();
		return account;
	}
	

	@Override
	public List<Account> getAllAccountDetails() throws BankingServicesDownException {
		// TODO Auto-generated method stub
		return accountDao.findAll();
	}

	@Override
	public List<Transaction> getAccountAllTransaction(long accountNo)
			throws BankingServicesDownException, AccountNotFoundException {
		return transactionDao.findAll();
	}

	@Override
	public String accountStatus(long accountNo)
			throws BankingServicesDownException, AccountNotFoundException, AccountBlockedException {
Account account = accountDao.findOne(accountNo);
		return BankingServicesUtil.getACCOUNT_STATUS();
	}

	

}