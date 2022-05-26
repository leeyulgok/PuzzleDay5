package part7;

import java.util.Random;
import java.util.Scanner;

public class RandomTester {
	
	static int random(int min, int max) {
		Random rand = new Random();
		int result = min + rand.nextInt(max - min + 1);
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("난수를 생성합니다.");
		System.out.print("하한값 : ");
		int min = scan.nextInt();
		System.out.print("상한값 : ");
		int max = scan.nextInt();
		
		int result = random(min, max);
		
		System.out.println("생성한 난수는 " + result + "입니다.");
		scan.close();
	}

}
