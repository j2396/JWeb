package com.h2kinfosys.learnJava.assignment1;

public class CanadaStore implements IStore {

	@Override
	public void validateStoreAddress(String address) {
		// TODO Auto-generated method stub
		System.out.println("Canada Store Address Validated");
	}

	@Override
	public void checkServiceTax() {
		// TODO Auto-generated method stub
		System.out.println("Canada Service Tax :: 10%");
	}

	@Override
	public void assignStoreManager() {
		// TODO Auto-generated method stub
		System.out.println("Canada Store Manager Assigned :: Bob");
	}

}
