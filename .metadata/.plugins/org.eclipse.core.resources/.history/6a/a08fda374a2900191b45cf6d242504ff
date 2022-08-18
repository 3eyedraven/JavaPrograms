package com.cg.payroll.services;
import java.util.List;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;

public interface PayrollServices {
	int acceptAssociateDetails(String firstName,String lastName,String emailId,String department,String designation,String panCard,int yearlyInvestmentUnder80C,int basicSalary,int epf,int companyPf,int accountNumber, String bankName,String ifscCode);
	double calculateNetSalary(int basicSalary, int epf, int companyPf) throws AssociateDetailNotFoundException;
	Associate getAssociateDetails(int associateId) throws AssociateDetailNotFoundException;
	List<Associate> getAssociateDetails();

}
