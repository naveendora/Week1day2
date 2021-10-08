package week1.assignments2;

public class Calculator {
 public int add(int num1, int num2, int num3) {
	 int sum = num1 +  num2 + num3;
	 System.out.println("the sum is " +sum);
	 return sum;
	 
	
}
 public int sub(int num1, int num2) {
	 int loose = num1 - num2;
	 System.out.println("the sub is " + loose);
	 return loose;

}
 
 public double mul(double num1, double num2) {
	double dad = num1 * num2;
	 System.out.println("the multi is " + dad);
	return dad;
	
}
 
 public double div(double d, double e) {
	 double mom = d / e;
	 System.out.println("the divison is " + mom);
	 return mom;
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator arith = new Calculator();
		 arith.add(10,20,30);
		 arith.sub(100,50);
		 arith.mul(2,3);
		 arith.div(10.75,12.5);
		 
		
	}

}
