package finalkeyword;

//final class finaldemo {    //class name as final u cannot extend that class.

 class finaldemo {
	
	final int speedlimit = 40;  //constant variables
	
	void run()
	{
	 //	speedlimit = 50; //Can't change final variable
		
	}
	
	final void bike()   //can't override this method in 
	{
		
		
	}

	public static void main(String[] args) {

		finaldemo dm = new finaldemo();
		dm.run();

	}
}
