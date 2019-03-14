package com.cg.frs.dto;

public class FlatOwnerDTO {
	private int Owner_ID;
	
	private String Owner_Name;
	 private String mobileNo;
	 public FlatOwnerDTO(String Owner_Name, String mobileNo) {
			this.Owner_Name=Owner_Name;
			this.mobileNo=mobileNo;
		}
	public String getOwner_Name() {
		return Owner_Name;
	}
	public void setOwner_Name(String owner_Name) {
		Owner_Name = owner_Name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	
	 public int getOwner_ID() {
			return Owner_ID;
		}
		public void setOwner_ID(int owner_ID) {
			Owner_ID = owner_ID;
		}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
