package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dao.FlatRegistrationDAOImpl;
import com.cg.frs.dao.IFlatRegistrationDAO;
import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exceptions.DepositAmtLessThanRentAmtException;
import com.cg.frs.exceptions.FlatTypeNotValidException;
import com.cg.frs.exceptions.OwnerIDDoesNotExistException;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {

	IFlatRegistrationDAO flatDAO = new FlatRegistrationDAOImpl();

	ArrayList list = new ArrayList();

	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {

		if (flat.getDeposit_Amount() < flat.getRent_Amount()) {
			try {
				throw new DepositAmtLessThanRentAmtException();
			} catch (DepositAmtLessThanRentAmtException e) {
				e.printStackTrace();

			}
			flat = null;
		}
		
		return flatDAO.registerFlat(flat);

	}

	public ArrayList<Integer> getAllOwnerIds() {

		return flatDAO.getAllOwnerIds();

	}

	public boolean idCheck(int Owner_ID, ArrayList<Integer> list) {
		//FlatRegistrationDTO flat = new FlatRegistrationDTO();

		boolean value = false;

		if (list.contains(Owner_ID)) {
			value = true;
			
		} else {
			try {
				throw new OwnerIDDoesNotExistException();
			} catch (OwnerIDDoesNotExistException e) {

				e.printStackTrace();
			}
		}
		return value;

	}
}
