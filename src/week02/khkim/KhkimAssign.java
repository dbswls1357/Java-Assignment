package week02.khkim;

import java.util.Scanner;

public class KhkimAssign {

	public static void main(String[] args) {
		System.out.println("201811962 김기현");
	
		Scanner scanner = new Scanner(System.in);

//		scanner.close(); 언제 달아야 하는지?

		while(true) {
			System.out.println("1) 쿠폰으로 초콜릿 구매하기 2) 문자 산수 퍼즐 3) 구구단 출력하기 4) 종료 ");
			System.out.print("메뉴를 선택하세요 : ");
			int inputNum = scanner.nextInt();
	

			switch(inputNum) {

				case 1:
					menu1();
					break;
					
				case 2:
					menu2();
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

		}

	}

	public static void menu1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("돈을 넣어주세요 : ");

		final int chocolate_price = 1;
		int money = scanner.nextInt();

		while(money>=7) {
			int	chocolate =  money/7 + money; // 구매 가능한 초콜릿
			int coupon = chocolate + money % 7 - money;  // 초콜릿 구매하고 남은 쿠폰 
			
			//int plus_coupon = coupon + chocolate; // 초콜릿을 산 다음의 쿠폰 + 원래 쿠폰
			
			while(coupon>=7) {
				chocolate = chocolate + coupon/7; // 초콜릿 개수(money) 더함 
				coupon = coupon%7 + coupon/7;
				continue;

			}
			
//			if(plus_coupon>=7) {
//				chocolate = chocolate + plus_coupon/7 + money; // 초콜릿 개수(money) 더함 
//				coupon = plus_coupon%7 + plus_coupon/7;
//			}else {
//				chocolate = chocolate + money; 
//				coupon = plus_coupon%7 ;
//			}
			
			System.out.println("-----------------------------");

			System.out.println("초콜릿 " + chocolate + "개, " + "쿠폰 " +coupon + "개");
			break;
		}			
		System.out.println("-----------------------------");
	}
	
	public static void menu2() {
		int T = 0, O = 0, G = 0, D = 0; // 초기화
		
		for(T = 0;  T <10; T++) {
			for(O = 0; O <10; O++) {
				for(G = 0; G <10; G++) {
		            for (D = 0; D <=9; D++) {
		            	if(((T!=O)&&(T!=G)&&(T!=D)&&(O!=G)&&(O!=D)&&(G!=D)) // 서로 같으면 안됨 
		            			&&(T!=0 && G!=0) // 가장 큰 단위의 수는 0이 되면 안됨 
		            			&&(((400 *T) + (40 * O) + (4*O)) == ((1000*G) + (100*O) + (10*O) + (1*D)))) { // 계산 식 
		                    System.out.println("T = " + T + ", O = " + O + ", G = " + G + ", D = " + D);

		            	}
		            }

				}
			}
		}
		
		System.out.println();
	}

	
	public static void menu3() {
		System.out.println("============= 구구단 출력하기 ============= ");

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
