package part7;

import java.util.Scanner;

// 메서드 시작
public class SignOf1 {
	
	static int signOf(int x) {
		int sign = 0;
		
		if(x > 0) {
			sign = 1;
		} else if(x == 0) {
			sign = 0;
		} else {
			sign = -1;
		}
		
		return sign;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 : ");
		int x = scan.nextInt();
		
		int result = signOf(x);
		
		System.out.println("signOf(x)는 " + result + "입니다.");
		
		scan.close();
	}

}
