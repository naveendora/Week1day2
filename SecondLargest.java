package week1.assignments2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] data = { 3,2,11,4,6,7};

int length = data.length;
System.out.println("lenght of the array" + length);

Arrays.sort(data);
for (int i = 0; i < data.length; i++) {
	System.out.println(data[i]);
}
System.out.println("the second largest number is " + (data[length-2]));
	}

}
