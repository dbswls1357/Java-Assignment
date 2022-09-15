package week02.khkim;

import java.util.Scanner;

public class KhkimAssign {

	public static void main(String[] args) {
		System.out.println("201811962 김기현");
	
		Scanner scanner = new Scanner(System.in);


		while(true) {
			System.out.println("1) 쿠폰으로 초콜릿 구매하기 2) 문자 산수 퍼즐 3) 구구단 출력하기 4) 종료 ");
			System.out.print("메뉴를 선택하세요 : ");
			int inputNum = scanner.nextInt();
	

			switch(inputNum) {

				case 1:
					menu1();
					break;
					
				case 2:
					System.out.println("case2 ");

					break;
					
				case 3:
					menu3();
					break;
					
				case 4:
					System.out.println("종료합니다. ");
					System.exit(0);
					break;
					
				default:
					System.out.println("다른 수 입력해주세요 ");
					break;


			}
			//scanner.close();


		}
		
		

	
	}
	
	public static void chocoMachine() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("돈을 넣어 주세요 : ");
		int money = scanner.nextInt(); 
		
		// Original에서 나온 쿠폰 수와 교환 못하는 쿠폰 수;
		int coupon = money / 7;
		int rest_coupon = money % 7;
		
		int choco_counter = money + coupon;
		
		int rest_counter = 0;
		
		
		// 피보나치를 써야할거같은데...
		
		
		
		
		// 쿠폰 계산 
		//int origin_coupon = coupon/7;
//		int extra_coupon = origin_coupon/7;
//		int total_coupon = origin_coupon + extra_coupon;
		
		
	}
	
	public static void menu1() {
		
		final int chocolate_price = 1;

		

//		int money = scanner.nextInt();
		
		
	}
	
	public static void menu2() {
		
		
	}

	
	public static void menu3() {

		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("출력단수 : ");
			
			int gugudanNum = scanner.nextInt();
			
			if((gugudanNum < 1) || (gugudanNum > 8)){
				System.out.println("출력 단 수 입력이 잘못되었습니다. ");
				continue; // break 차이점 잘 알기 
			}else {
				for(int j = gugudanNum; j<10; j++) {
					for(int i = 1; i<10; i++) {
						System.out.print(j + " * " + i+  " = "+ i*j +'\t');
					}				
					System.out.println();
				} 
			}
			System.out.println();
			break;

		}

		

		


	}
	

}
