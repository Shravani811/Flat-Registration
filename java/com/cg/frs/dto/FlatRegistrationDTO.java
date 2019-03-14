package com.cg.frs.dto;

public class FlatRegistrationDTO {

	private int Flat_Reg_No,Owner_ID;
	private String Flat_Type;
	private double Flat_Area,Rent_Amount,Deposit_Amount;
	public FlatRegistrationDTO(int owner_ID, String flat_Type, double flat_Area, double rent_Amount,double deposit_Amount) {
			this.Owner_ID = owner_ID;
			this.Flat_Type = flat_Type;
			this.Flat_Area = flat_Area;
			this.Rent_Amount = rent_Amount;
			this.Deposit_Amount = deposit_Amount;
		
	}
	public FlatRegistrationDTO() {
		// TODO Auto-generated constructor stub
	}
	public int getFlat_Reg_No() {
		return Flat_Reg_No;
	}
	public void setFlat_Reg_No(int flat_Reg_No) {
		Flat_Reg_No = flat_Reg_No;
	}
	public int getOwner_ID() {
		return Owner_ID;
	}
	public void setOwner_ID(int owner_ID) {
		Owner_ID = owner_ID;
	}
	public String getFlat_Type() {
		return Flat_Type;
	}
	public void setFlat_Type(String flat_Type) {
		Flat_Type = flat_Type;
	}
	public double getFlat_Area() {
		return Flat_Area;
	}
	public void setFlat_Area(double flat_Area) {
		Flat_Area = flat_Area;
	}
	public double getRent_Amount() {
		return Rent_Amount;
	}
	public void setRent_Amount(double rent_Amount) {
		Rent_Amount = rent_Amount;
	}
	public double getDeposit_Amount() {
		return Deposit_Amount;
	}
	public void setDeposit_Amount(double deposit_Amount) {
		Deposit_Amount = deposit_Amount;
	}
}
