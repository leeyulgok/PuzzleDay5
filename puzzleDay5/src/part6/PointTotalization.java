package part6;

import java.util.Scanner;

// 4명의 국어, 수학 점수로부터 과목별 학생별 평균
public class PointTotalization {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int number = 4;
		int[][] point = new int[number][2];
		int[] sumStudent = new int[number];
		int[] sumSubject = new int[2];
		System.out.println("4명의 국어, 수학 점수를 입력하세요.");
		for(int i = 0; i < number; i++) {
			System.out.print(i+1 + "번 국어 : ");
			int x = scan.nextInt();
			point[i][0] = x;
			System.out.print("   수학 : ");
			int y = scan.nextInt();
			point[i][1] = y;
			
			sumStudent[i] = point[i][0] + point[i][1];
			sumSubject[0] += point[i][0];
			sumSubject[1] += point[i][1];
		}
		System.out.println("No. 국어 수학 평균");
		for(int i = 0; i < number; i++) {
			System.out.println(i+1 + "   " + point[i][0] + "   " + point[i][1] + "   " + (double)sumStudent[i]/2);
		}
		System.out.println("평균 " + sumSubject[0]/number + "  " + sumSubject[1]/number);
		
		
		scan.close();
	}

}
