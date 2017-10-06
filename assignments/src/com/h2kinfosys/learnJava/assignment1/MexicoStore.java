package com.h2kinfosys.learnJava.assignment1;

public class MexicoStore implements IStore {

	@Override
	public void validateStoreAddress(String address) {
		// TODO Auto-generated method stub
		System.out.println("Mexico Store Address Validated");
	}

	@Override
	public void checkServiceTax() {
		// TODO Auto-generated method stub
		System.out.println("Mexico Service Tax :: 15%");
	}

	@Override
	public void assignStoreManager() {
		System.out.println("Mexico Store Manager Assigned :: Martin");
	}

}
