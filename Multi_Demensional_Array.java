public class Multi_Demensional_Array{
	public static void main(String[] args){
		
		int[][] numbers = {{9,10,4,6,2},{4,0,5,2,1},{12,9,3,8,6}};
		
		for(int row = 0; row < numbers.length; row++){
			for(int col = 0; col < numbers[row].length; col++){
				System.out.printf("%4d", numbers[row][col]);
			}
			System.out.println(); // move to next row
		}
		
		System.out.println("\nUsing enhanced for loop");
		
		for(int[] row : numbers){
			for(int col : row){
				System.out.printf("%4d", col);
			}
			System.out.println();
		}
	}
}