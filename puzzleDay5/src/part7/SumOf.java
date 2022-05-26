package part7;

import java.util.Scanner;

public class SumOf {
	
	static int sumOf(int[] list) {
		int result = 0;
		for(int i = 0; i < list.length; i++) {
			result += list[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요소 : ");
		int x = scan.nextInt();
		int[] list = new int[x];
		
		for(int i = 0; i < x; i++) {
			System.out.print("x["+i+"] = ");
			int a = scan.nextInt();
			list[i] = a;
		}
		
		int result = sumOf(list);
		
		System.out.println("모든 요소의 합은 " + result + "입니다.");
		scan.close();
	}

}
