package work;

import java.util.Scanner;

public class Num1 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸öÕýÕûÊý:");
		n = in.nextInt();
		number(n);
	}
	
	public static void number(int n){
		int m = n;
		if(n<5000)
		{
			n = n*2;
			System.out.println(n);
			number(n);
		}
		if(n-m>0)
		{
			n = n/2;
			System.out.println(n);
		}
	}
}
