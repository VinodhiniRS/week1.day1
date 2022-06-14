package week1.day1.assignments;

public class FibonacciSeries {
	
public static void main(String args[])
{
	int Range = 7;
	int Num1 = 0;
	int Num2 =1;
	System.out.println(Num1);
	System.out.println(Num2);
	for (int i = 2; i<=Range; i++) {
		int sum = Num1 + Num2;
		Num1 = Num2;
		Num2 = sum;
		System.out.println(sum);
}
}
}



