package part7;

import java.util.Scanner;

// 왼쪽 아래가 직간인 이등변 삼각형 메서드
public class IsoscelesTriangleLB {
	
	static void putChar(char c, int i) {
		while(i-- > 0) {
			System.out.print(c);
		}
	}
	
	static void putStar(int i) {
		putChar('*', i);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수 : ");
		int x = scan.nextInt();
		
		for(int i = 1; i <= x; i++) {
			putStar(i);
			System.out.println();
		}
		
		scan.close();
	}

}
