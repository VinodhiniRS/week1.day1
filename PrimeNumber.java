package week1.day1.assignment;

public class PrimeNumber {
public static void main(String args[])
{
	int Input=13;
	boolean flag = false;
	for (int i =2;i<=13/2;i++)
	{
		if(Input%i == 0)
		{
			flag = true;
		}
	}
	if(flag == false)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}
}

