package com.cg.frs.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.frs.dto.FlatRegistrationDTO;

class FlatRegistrationDAOImplTest {
	
	static FlatRegistrationDAOImpl daoObj;
	static FlatRegistrationDTO dtoObj;
	@BeforeAll
	public static void Obj() {
		daoObj = new FlatRegistrationDAOImpl();
		dtoObj = new FlatRegistrationDTO();
	}
	
	@Test
	void testRegisterFlat() {
		dtoObj.setDeposit_Amount(1000);
		dtoObj.setFlat_Area(199);
		dtoObj.setFlat_Type("a");
		dtoObj.setRent_Amount(1200);
		assertEquals(1,daoObj.registerFlat(dtoObj).getFlat_Reg_No());
	}
	
	@Test
	void testRegisterFlat1() {
		dtoObj.setDeposit_Amount(100);
		dtoObj.setFlat_Area(19);
		dtoObj.setFlat_Type("b");
		dtoObj.setRent_Amount(120);
		assertEquals(2,daoObj.registerFlat(dtoObj).getFlat_Reg_No());
	}

	@Test
	void testGetAllOwnerIds() {
		List<Integer> list = Arrays.asList(1,2,3);
		assertEquals(list,daoObj.getAllOwnerIds());
	}

}
