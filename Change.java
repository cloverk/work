package demo03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		System.out.println("����һ��16������:");
		Scanner s = new Scanner(System.in);
		try{
			while(s.hasNext()){
				int a = s.nextInt(16);
				System.out.println("ת��Ϊ10������:");
				System.out.println(a);
			}
		}catch(InputMismatchException e){
			e.printStackTrace();
		}
	}

}
