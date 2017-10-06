package com.h2kinfosys.learnJava.assignment1;

public class USStore implements IStore {

	@Override
	public void validateStoreAddress(String address) {
		// TODO Auto-generated method stub
		System.out.println("USA Store Address Validated");
	}

	@Override
	public void checkServiceTax() {
		// TODO Auto-generated method stub
		System.out.println("USA Service Tax :: 5%");
	}

	@Override
	public void assignStoreManager() {
		// TODO Auto-generated method stub
		System.out.println("USA Store Manager Assigned :: Mike");
	}

}
