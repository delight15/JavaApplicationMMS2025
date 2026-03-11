public class passingarraytomethods{

	public static void main (String[] args){
	
		myNumbers (new int[]{7,9,12,6,4});
		
	
	}
	
	public static void myNumbers(int[] numbers){
		
		for(int num : numbers){
			System.out.printf("%d%n", num);
		}
	}

}