package part7;

import java.util.Scanner;

public class MinOfHeightWeight {
	static int minOf(int[] list) {
		int min = list[0];
		for(int i = 1; i < list.length; i++) {
			if(min > list[i]) {
				min = list[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("사람 수 : ");
		int number = scan.nextInt();
		
		int[] height = new int[number];
		int[] weight = new int[number];
		
		System.out.println(number + "명의 신장과 체중을 입력하세요.");
		for(int i = 0; i < number; i++) {
			System.out.print(i+1 + "번의 신장 : ");
			int x = scan.nextInt();
			height[i] = x;
			
			System.out.print(i+1 + "번의 체중 : ");
			int y = scan.nextInt();
			weight[i] = y;
		}
		
		int minHeight = minOf(height);
		int minWeight = minOf(weight);
		
		System.out.println("가장 키가 작은 사람의 신장 : " + minHeight +"cm");
		System.out.println("가장 몸무게가 적은 사람의 체중 : " + minWeight +"kg");
		
		scan.close();
	}

}
