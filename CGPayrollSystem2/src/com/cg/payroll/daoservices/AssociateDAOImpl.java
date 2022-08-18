package com.cg.payroll.daoservices;

import java.util.ArrayList;
import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.util.PayrollDBUtil;

public class AssociateDAOImpl implements AssociateDAO {

	@Override
	public Associate save(Associate associate) {
		associate.setAssociateId(PayrollDBUtil.getASSOCIATE_ID_COUNTER());
		PayrollDBUtil.associates.put(associate.getAssociateId(), associate);
		// TODO Auto-generated method stub
		return associate;
	}

	@Override
	public boolean update(Associate associate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Associate findOne(int associateId) {
		return PayrollDBUtil.associates.get(associateId);
		// TODO Auto-generated method stub
	}

	@Override
	public List<Associate> findAll() {
		// TODO Auto-generated method stub
		return new ArrayList<>(PayrollDBUtil.associates.values());
	}

}
