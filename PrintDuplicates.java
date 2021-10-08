package week1.assignments2;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length = arr.length;
		//System.out.println("the length of the array" + length );
		int count = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j])
				{
				
				System.out.println(arr[j]);
					
				}
				
				if(count > 0) {
					System.out.println("the first array" + arr[0]);
				
			}
			
			
		}
		
		}
	}
	
}

