package part7;

import java.util.Random;
import java.util.Scanner;

public class MentalArithmetic {
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	static int question(int x, int y, int z) {
		int randomQ = 1 + rand.nextInt(4);
		int result = 0;
		switch(randomQ) {
		case 1:
			System.out.print(x +"+"+ y +"+"+ z + "=");
			return result = x+y+z;
		case 2:
			System.out.print(x +"-"+ y +"+"+ z + "=");
			return result = x-y+z;
		case 3:
			System.out.print(x +"+"+ y +"-"+ z + "=");
			return result = x+y-z;
		case 4:
			System.out.print(x +"-"+ y +"-"+ z + "=");
			return result = x-y-z;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("암산훈련!!");
		
		int retry = 0;
		int n = 0;
		int result;
		do {
			int x = 1 + rand.nextInt(99);
			int y = 1 + rand.nextInt(99);
			int z = 1 + rand.nextInt(99);
			do {
				result = question(x,y,z);
				n = scan.nextInt();
				if(n != result) {
					System.out.println("틀렸습니다!");
				}
			} while(n != result);
			System.out.print("정답입니다!! 다시 한 번? : 1-Yes/0-No");
			retry = scan.nextInt();
		} while(retry == 1);

	}

}
