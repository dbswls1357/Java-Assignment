package week03.khkim;

import java.util.Random;
import java.util.Scanner;

public class Khkim0915_3 {

	public static void main(String[] args) {
		// 가변 배열
		// int[][] score = new int[3][] //2차원에 해당하는 사이즈는 주어져야 함.
		// 예제. 배열 동적 생성 및 출력
		
		lab04();

	}

	public static void lab04() {
		int[][] arr = makeArray2D();
		printArray(arr);
		
		
	}

	private static void printArray(int[][] arr) {
		
	}

	public static int[][] makeArray2D() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("층의 개수 : "); // 초기화 한 층은 변경되면 안됨. 
		final int ROW = scanner.nextInt(); // 변경하지 못하도록 함.
		
		int[][] array = new int[ROW][];
		
		for(int i=0; i<array.length;i++) {
			System.out.print(i+ "층의 개수 : ");
			final int COL = scanner.nextInt(); // 변경하지 못하도록 함.
			array[i] = new int[COL]; // 각 층마다의 방을 생성함. //표현 익히기 
		}
		
		Random r = new Random();
		for(int[] num : array) {
			for(int i=0; i<num.length; i++) {
				num[i] = r.nextInt(100);
			}
		}
		

//		System.out.print(array);
		return array;
		
		
		}
	
}
