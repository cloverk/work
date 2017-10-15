package work;

import java.util.Scanner;

public class Num2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		int n = in.nextInt();
		
		int m = 0;          //层数
		int d = 1;			//数值
		int[][] arr = new int[n][n];
		
		if(n %2 ==0) {
			m=n/2;
		}else {
			m=n/2+1;
		}
		
		for(int i=0;i<m;i++) {
			for(int j=i;j<n-i;j++) {
				arr[j][i] = d++;
			}
			for(int j=i+1; j<n-i;j++) {
				arr[n-i-1][j] = d++;
			}
			for(int j=n-i-2;j>=i;j--) {
				arr[j][n-i-1] = d++;
			}
			for(int j=n-i-2;j>=i+1;j--) {
				arr[i][j] = d++;
			}
		}

		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
	}
}