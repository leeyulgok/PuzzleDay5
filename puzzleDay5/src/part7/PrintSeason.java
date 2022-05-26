package part7;

import java.util.Scanner;

// 지정한 월의 계절 표시하는 메서드. 
public class PrintSeason {
	
	static void printSeason(int x) {
		switch(x) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다."); break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다."); break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다."); break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다."); break;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		do {			
			System.out.print("몇 월입니까? : ");
			x = scan.nextInt();
		} while(x > 12 || x < 1);
		
		System.out.print("해당 월의 계절은 ");
		printSeason(x);
		scan.close();
	}

}
