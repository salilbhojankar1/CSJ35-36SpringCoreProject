package model;

public class Bank {
	
	private BankService service;

	public BankService getService() {
		return service;
	}
	
	

	public void setService(BankService service) {
		this.service = service;
	}
	
	public String getLogin(String userId)
	{
		boolean flag =service.authentiCate(userId);
		if(flag)
		{
			return "login Success";
		}
		return "login failed";
	}

}
