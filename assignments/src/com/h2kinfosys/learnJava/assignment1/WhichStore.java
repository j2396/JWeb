package com.h2kinfosys.learnJava.assignment1;

public class WhichStore  {

	public WhichStore() {
		// TODO Auto-generated constructor stub
	}

	public IStore findStore(int storeId) throws Exception {

		switch(storeId){
		
		case 1 : {
			MexicoStore mstore = new MexicoStore();
			return mstore;
		}
		case 2 : {
			CanadaStore cstore = new CanadaStore();
			return cstore;
		}
		case 3 : {
			USStore ustore = new USStore();
			return ustore;
		}
		default : {
			throw new Exception ("InvalidStoreIdException");
		}
		
	}

	}
}
