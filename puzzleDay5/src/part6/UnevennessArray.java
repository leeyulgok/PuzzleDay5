package part6;

import java.util.Scanner;

// 불규칙적인 2차원 배열
public class UnevennessArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("불규칙한 2차원 배열을 생성합니다.");
		System.out.print("행 수 : ");
		int x = scan.nextInt();
		
		int[][] list = new int[x][];
		
		for(int i = 0; i < x; i++) {
			System.out.print(i + "행 째의 열 수 : ");
			int y = scan.nextInt();
			list[i] = new int[y];
		}
		System.out.println("각 요소의 값을 입력하세요.");
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < list[i].length; j++) {
				System.out.print("list["+i+"]["+j+"] = ");
				int a = scan.nextInt();
				list[i][j] = a;
			}
		}
		System.out.println("배열 list의 각 요솟값은 다음과 같습니다.");
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j] + "  ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
