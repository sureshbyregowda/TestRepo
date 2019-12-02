package thiskeyword;

public class thisDemo20 {	
	
	int a =2;	
	public void getData()
	{		
		int a =3;		
		System.out.println(a);		
		System.out.println(this.a);  //this refers to current object - object scope lies in class level
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);	
		System.out.println("commiting changes");	
		
		System.out.println("commiting changes second time");	
		System.out.println("commiting changes thrid time");		
		
		System.out.println("Hello GM");		
	}

	public static void main(String[] args) {
        thisDemo20 td = new thisDemo20();        
        td.getData();
	}
}
