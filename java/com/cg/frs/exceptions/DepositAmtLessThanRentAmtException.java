package com.cg.frs.exceptions;



public class DepositAmtLessThanRentAmtException extends Exception{
	public DepositAmtLessThanRentAmtException(){
		System.out.println("deposit amount cannot be less than rent amount ");
	}
}
