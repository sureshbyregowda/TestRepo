package superkeyword;

public class child extends parent{
	
	String name = "Ramesh from child class";
	
	public child()
	{
		super(); //This should be always be at first line
		System.out.println("Child class constructor");
	}
	
	public void getstringdata()
	{
		
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I'm in child class");
	}
	
	public static void main(String[] args) {

		child ch = new child();		
		ch.getstringdata();
		
		ch.getData();
		
	}

}
