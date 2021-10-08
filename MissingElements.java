package week1.assignments2;

import java.util.Arrays;

import org.w3c.dom.Attr;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] Attr = {1,2,3,4,7,6,8};
int length = Attr.length;
// System.out.println(length);
Arrays.sort(Attr);
for (int i = 1; i < Attr.length; i++) {
	if ( Attr[i] == 0) {
		System.out.println(i);
		break;
	}
}

	
	}

}
