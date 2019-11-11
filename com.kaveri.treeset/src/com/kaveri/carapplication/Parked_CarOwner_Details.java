package com.kaveri.carapplication;

public class Parked_CarOwner_Details {

	String ownerName;
	String carModel;
	int carNo;
	Long ownerMobileNo;
	String ownerAddress;
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public Long getOwnerMobileNo() {
		return ownerMobileNo;
	}
	public void setOwnerMobileNo(Long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public Parked_CarOwner_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parked_CarOwner_Details(String ownerName, String carModel, int carNo, Long ownerMobileNo,
			String ownerAddress) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}
	
	
}
