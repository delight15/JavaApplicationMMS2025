public class returningarraysfrommethods{

	public static void main(String[] args){
		for(int i = 0; i < 5; i++){
			
			System.out.println(test()[i]);
			
		}
	}
	public static int[] test(){
		
		return new int[]{6,9,12,15,4};
	}
}