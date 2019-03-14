package com.cg.frs.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cg.frs.dto.FlatOwnerDTO;
import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO {

	ArrayList<Integer> ownerList = new ArrayList<Integer>();
	Map<Integer,FlatOwnerDTO> ownerMap = new HashMap<Integer,FlatOwnerDTO>();
	int flat_Reg_No=1;
	//creating a map for flat owners
	public FlatRegistrationDAOImpl(){
		
		
		ownerMap.put(1,new FlatOwnerDTO("Vaishali Srivastava","8888108810"));
		ownerMap.put(2,new FlatOwnerDTO("Ankita Ghokle","9876665454"));
		ownerMap.put(3,new FlatOwnerDTO("Rohini Vijayan","7659993201"));
		
	}
		
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		Map<Integer,FlatRegistrationDTO> registerMap = new HashMap<Integer,FlatRegistrationDTO>();
		
		flat.setFlat_Reg_No(flat_Reg_No);
		registerMap.put(flat.getFlat_Reg_No(), new FlatRegistrationDTO(flat.getOwner_ID(),flat.getFlat_Type(),flat.getFlat_Area(),flat.getRent_Amount(),flat.getDeposit_Amount()));
		flat_Reg_No++;
		return flat;
	}

	public ArrayList<Integer> getAllOwnerIds() {
		
		for(Map.Entry<Integer,FlatOwnerDTO> a : ownerMap.entrySet())
			 ownerList.add(a.getKey());
	
		return  ownerList;
		
	}

}

