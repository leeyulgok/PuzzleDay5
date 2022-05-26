package part6;

import java.util.Scanner;

// 학급 단위로 학생 수가 다른 학생
public class PointClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학급 수 : ");
		int x = scan.nextInt();
		
		int[][] cls = new int[x][];
		int[] sumPoint = new int[x];
		int totalPoint = 0;
		
		for(int i = 0; i < x; i++) {
			System.out.print(i+1 + "반의 학생 수 : ");
			int stu = scan.nextInt();
			cls[i] = new int[stu];
			for(int j = 0; j < cls[i].length; j++) {
				System.out.print((i+1)+ "반 " + (j+1) + "번의 점수 : ");
				int point = scan.nextInt();
				sumPoint[i] += point;
			}
			totalPoint += sumPoint[i];
		}
		System.out.println("반  |  합계  평균");
		System.out.println("===+===========");
		for(int i = 0; i < x; i++) {
			System.out.println(i+1+"반  " + sumPoint[i] + "  " +sumPoint[i]/cls[i].length);
		}
		System.out.println("===+===========");
		System.out.println("합  |" + totalPoint + "  " +totalPoint/x);
		
		scan.close();
	}

}
