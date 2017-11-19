package demo03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		System.out.println("输入一个16进制数:");
		Scanner s = new Scanner(System.in);
		try{
			while(s.hasNext()){
				int a = s.nextInt(16);
				System.out.println("转换为10进制数:");
				System.out.println(a);
			}
		}catch(InputMismatchException e){
			e.printStackTrace();
		}
	}

}
