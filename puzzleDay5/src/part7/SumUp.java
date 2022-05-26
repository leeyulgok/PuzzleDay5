package part7;

import java.util.Scanner;

// 1부터 x까지의 합. 
public class SumUp {

	static int sumUp(int x) {
		int result = 0;
		
		for(int i = 0; i <= x; i++) {
			result += i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 x까지의 합을 구합니다.");
		System.out.print("x의 값 : ");
		int x = scan.nextInt();
		
		int result = sumUp(x);
		
		System.out.println("1부터 " + x + "까지의 합은 " + result + "입니다.");
		
		scan.close();
	}

}
