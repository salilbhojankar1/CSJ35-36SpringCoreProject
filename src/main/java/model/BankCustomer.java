package model;

public class BankCustomer implements BankService {

	public boolean authentiCate(String userId)
	{
		
		if(userId.equalsIgnoreCase("CUST@123"))
		{
			return true;
			
		}
		return false;
	}
}
