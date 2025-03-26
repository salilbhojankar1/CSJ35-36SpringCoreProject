package model;

public class BankEmployee implements BankService {

	public boolean authentiCate(String userId)
	{
		if(userId.equalsIgnoreCase("Emp@123"))
		{
			return true;
			
		}
		return false;
	}
}
