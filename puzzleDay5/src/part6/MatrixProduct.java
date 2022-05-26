package part6;

import java.util.Scanner;

// 4행 3열의 행렬과 3열 4행의 행렬 곱하기.
public class MatrixProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] c = new int[4][4];
		
		System.out.println("행렬 a의 요소를 입력하세요.");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length - 1; j++) {
				System.out.print("a["+i+"]["+j+"] = ");
				int aa = scan.nextInt();
				a[i][j] = aa;
			}
		}
		System.out.println("행렬 b의 요소를 입력하세요.");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b.length + 1; j++) {
				System.out.print("b["+i+"]["+j+"] = ");
				int bb = scan.nextInt();
				b[i][j] = bb;
			}
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				c[i][j] =0;
				for(int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("행렬 a와 b의 곱");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
