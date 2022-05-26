package part7;

import java.util.Scanner;

public class LinearSearch {

	static int linearSearch(int[] list, int key) {
		int result = 0;
		for(int i = 0; i < list.length; i++) {
			if(key == list[i]) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	static int linearSearchR(int[] list, int key) {
		int result = 0;
		for(int i = list.length-1; i >= 0; i--) {
			if(key == list[i]) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요소 : ");
		int x = scan.nextInt();
		int[] list = new int[x];
		
		for(int i = 0; i < x; i++) {
			System.out.print("list["+i+"] = ");
			int y = scan.nextInt();
			list[i] = y;
		}
		System.out.print("찾는 값 : ");
		int key = scan.nextInt();
		
		int sum = 0;
		for(int i = 0; i < x; i++) {
			if(key == list[i]) {
				sum++;
			}
		}
		if(sum > 1) {
			System.out.println("해당 값의 요소가 여러개 존재합니다.");
			System.out.println("가장 앞에 위치한 값은 list[" + linearSearch(list, key) + "]에 있습니다.");
			System.out.println("가장 뒤에 위치한 값은 list[" + linearSearchR(list, key) + "]에 있습니다.");
		} else {
			System.out.println("찾는 값은 list[" + linearSearch(list, key) + "]에 있습니다.");
		}
		
		
		scan.close();
	}

}
