package part7;

import java.util.Scanner;

public class Rotate {
	
	static void printBit(int x) {
		for(int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	
	static int rRotate(int x, int n) {
		if(n < 0) {
			return lRotate(x, -n);
		}
		n %= 32;
		return (n == 0 ? x : (x >>> n) | (x << (32 - n)));
	}
	
	static int lRotate(int x, int n) {
		if(n < 0) {
			return rRotate(x, -n);
		}
		n %= 32;
		return (n == 0 ? x : (x << n) | (x >>> (32 - n)));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 x를 n비트 회전합니다.");
		System.out.print("x : ");
		int x = scan.nextInt();
		System.out.print("n : ");
		int n = scan.nextInt();
		
		System.out.println("회전 전 = ");
		printBit(x);
		System.out.println("\n오른쪽 회전 = ");
		printBit(rRotate(x, n));
		System.out.println("\n왼쪽 회전 = ");
		printBit(lRotate(x, n));
		
		scan.close();
	}

}
