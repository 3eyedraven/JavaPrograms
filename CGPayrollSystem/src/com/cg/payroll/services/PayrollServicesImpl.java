package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.daoservices.AssociateDAOImpl;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;

public class PayrollServicesImpl implements PayrollServices {

	
		private AssociateDAO associateDao = new AssociateDAOImpl();

	@Override
	public int acceptAssociateDetails(String firstName, String lastName, String emailId, String department,
			String designation, String panCard, int yearlyInvestmentUnder80C, int basicSalary, int epf, int companyPf,
			int accountNumber, String bankName, String ifscCode) {
		BankDetails bankDetails= new BankDetails(accountNumber, bankName, ifscCode);
		Salary salary=new Salary(basicSalary, epf, companyPf);
		Associate associate=new Associate(basicSalary, firstName, lastName, department, designation, panCard, emailId,salary,bankDetails);
		associate = associateDao.save(associate);
		return associate.getAssociateId();
		
		//return associateDao.save(new Associate(yearlyInvestmentUnder80C, firstName, lastName, department, designation, panCard, emailId))
	}

	@Override
	public double calculateNetSalary(double basicSalary, double epf, double companyPf) throws AssociateDetailNotFoundException {
		
		double netSalary = basicSalary-epf-companyPf;
		double hra=basicSalary*30/100;
		double ca=basicSalary*30/100;
		double otherAllowance=basicSalary*25/100;
		double pa=basicSalary*20/100;
		netSalary=netSalary+hra+ca+otherAllowance+pa;
		
		return netSalary;
	}

	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailNotFoundException {
		Associate associate = associateDao.findOne(associateId);
		if (associate==null)
			throw new AssociateDetailNotFoundException("Associate Details not found for the id: "+associateId);
		else return associate;
	}

	@Override
	public List<Associate> getAssociateDetails() {
		// TODO Auto-generated method stub
		return associateDao.findAll();
	}

}
