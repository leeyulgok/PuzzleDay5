package part7;

import java.util.Scanner;

public class InverseNumber {
	static int readPlusInt(int x) {
		String str = "";
		while(x > 0) {
			String s = String.format("%d",x%10);
			x /= 10;
			str += s;
		}
		
		int result = Integer.parseInt(str);
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int retry = 0;
		do {			
			do {			
				System.out.print("양의 정숫값 : ");
				x = scan.nextInt();
			} while(x <= 0);
			
			int result = readPlusInt(x);
			
			System.out.println("반대로 읽으면 " + result +"입니다.");
			System.out.println("다시 한 번 1-Yes/0-No");
			retry = scan.nextInt();
		} while(retry == 1);
		
		scan.close();
	}

}
