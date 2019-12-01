package Interface;

public class Developing implements BankingClient,Domainclient{
	
	//now this class is responsible to implement ALL methods of BankingClient

	public static void main(String[] args)
	{
		Developing d = new Developing();   //object d is responsible to call all methods which are present in Developing class
		//object.methodname
		d.paycreditcard();
		d.transferbalance();
		d.checkingbalance();
		d.login();
		
	 BankingClient dr = new Developing();  //Run Time Polymorphism  - object dr is responsible to call methods which are present in only BankingClient Interface
	// dr.login();
	 
	 Domainclient dm = new Developing();
	 dm.investment();   //Access only methods which are present in Domainclient
	}

	@Override
	public void paycreditcard() {
	
		System.out.println("PayCreditCard Implemented");
		
	}

	@Override
	public void transferbalance() {
		
		System.out.println("Transferbalance Implemented");
		
	}

	@Override
	public void checkingbalance() {

		System.out.println("checkingbalance Implemented");
	}
	
	public void login()
	{
		System.out.println("Login method");
	}

	@Override
	public void investment() {
		System.out.println("Investment implemented");		
	}

}
