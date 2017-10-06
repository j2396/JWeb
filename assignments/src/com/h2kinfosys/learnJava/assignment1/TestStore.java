package com.h2kinfosys.learnJava.assignment1;

public class TestStore {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WhichStore st  = new WhichStore();
		try {
			for(int i=1; i <= 4; i++){
				IStore istr = (IStore) st.findStore(i);
				istr.validateStoreAddress("11100 XYZ DR");
				istr.checkServiceTax();
				istr.assignStoreManager();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

}
