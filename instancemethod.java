public class instancemethod{

	public static void main(String[] args){
	
		instancemethod mymethod = new instancemethod();
		
		System.out.println(mymethod.name("delight ") + "is saying ");
		mymethod.greeting();
	
	}
	
	public void greeting(){
		
		int i = 1;
		while(i <= 10){
			
			System.out.printf("%d Good Morning Class%n", i);
			i++;
		}
	}
	
	public String name(String fullName){
		return fullName;
		
	}


}