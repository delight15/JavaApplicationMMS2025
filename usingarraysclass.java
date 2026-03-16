import java.util.Arrays;


public class usingarraysclass{

	public static void main(String[] args){
		
		int[] fillArray = new int[5];
		Arrays.fill(fillArray, 10);
	
	
		for(int myNum : fillArray){
			
			System.out.printf("%d%n", myNum);
			
		}
			
		int[] numbers = {6,2,5,9,1,3,7,4,8,10};
		Arrays.sort(numbers);
		
		int[] copy  = Arrays.copyOf(numbers, numbers.length);
		System.out.println("=========== where we copy array ========");
		for(int copyNum : copy){
			System.out.printf("%d%n", copyNum);
		}
		
		int index = Arrays.binarySearch(numbers, 7);
		System.out.println("the element index is " + index);
		
		for(int num : numbers){
				
			System.out.printf("%d%n", num);
		}
	
	
	}


}