package week1.assignments2;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {3,2,11,4,6,7};
int length = arr.length;
int[] brr= {1,2,8,4,9,7};
int length2 = brr.length;
//System.out.println(length);
//System.out.println(length2);
for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < brr.length; j++) {
		if(arr[i]==brr[j]) {
			System.out.println(arr[j]);
		}
		
	}
	
}
}
	
}