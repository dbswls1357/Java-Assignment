package week03.khkim;

import java.util.Scanner;

public class Khkim01 {

	public static void main(String[] args) {
		// 배열 생성
//		int[] intArray = {4,3,2,1,0};
//		int[] intArray2 =  new int[5];

//		//예제. 배열 선언 및 생성 
//		Scanner scanner = new Scanner(System.in);
//		
//		int[] intArray;
//		intArray = new int[5];
//		
//		int max = 0;
//		System.out.println("양수 5개를 입력하세요");
//		
//		for(int i =0; i<5; i++) {
//			intArray[i] = scanner.nextInt();
//			if(intArray[i]> max) {
//				max = intArray[i];
//			}
//		}
//		System.out.println("The best is " + max);
//		scanner.close();
		
		// 한번 배열의 크기가 생성되면 나머지는 변경이 불가능하다
		
		// length : 변경이 될 수 없기에 배열은 길이를 가질 수 있다.
		
		
//		// 예제. 배열의 length 필드 활용
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("양수 5개를 입력하세요");
//
//		int[] intArray = new int[5];
//		
//		double sum = 0.0;
//		for(int i = 0; i<intArray.length; i++) {
//			intArray[i] = scanner.nextInt(); 
//		}
//		
//		for(int i = 0; i<intArray.length; i++) {
//			sum += intArray[i];
//		}
//		System.out.println("Sum is " + sum);
//		System.out.println("Avg is " + sum/intArray.length);
//		scanner.close();
		
		
		// 배열과 for-each문 : 향상된 forans 
		// for(변수 : 배열 이름 ){반복 작업문}
		// 배열의 원소를 하나씩 읽어서 반복문 작업을 함.
		
//		int[] n = {1,2,3,4,5};
//		int sum = 0;
//		
//		for(int k : n) {
//			sum += k;
//		}
//		System.out.println("Sum is " + sum);
//		
//		// 아래와 같다 
//		for(int i=0; i<n.length; i++) {
//			int k = n[i];
//			sum += k;
//		}
		
		// 예제. for-each 문 활용
		String[] f = {"apple", "pear", "cherry", "strawberry", "grape"};
		for(String s : f) {
			System.out.println(s);
		}
		
	}

}
