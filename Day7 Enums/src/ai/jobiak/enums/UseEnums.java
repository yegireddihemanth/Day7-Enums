package ai.jobiak.enums;

public class UseEnums {
	
	public static void main(String args[]) {
		
//		Apple apple = Apple.Jammu;
//		Apple apple1 = Apple.Kashmir;
//		System.out.println(apple);
//		System.out.println(apple1);
		
		for(Apple apples:Apple.values()) {    
		System.out.println(apples.ordinal()+" --> "+apples );   
	}

	}
}
