package week02.khkim;

import java.util.Scanner;

public class Khkim0123Recap {
	
	// continue : {}를 빠져나가지 않고 반복할 내용으로 이동
	// break    : {}를 빠져나감. 가장 가까이 있는 {}  
	
	public static void main(String[] args) {
		//scannerTest();
		//bitwiseTest();
		//changeBitwise();
		//changeRGB01();
		//changeRGB02(); 추가하기 
		//coffeeOrder();
		gugudanTest(); // 에러확인 
	}

	public static void gugudanTest() {
		System.out.println("=========== 구구단 출력하기 ===========  ");

		
		while(true) {
			System.out.print("출력단수 : ");
			Scanner scanner = new Scanner(System.in);
			
			int gugudanNum = scanner.nextInt();
			
			int dan = 1;           // 1단으로 초기화 
			int num = gugudanNum;  // 입력값(단 수 )
			int num2 = num;
			
			if((gugudanNum <1)||(gugudanNum >8)) {
				System.out.println("다른 단을 입력해주세요. ");
				continue;
			}		
			
			while(true) {
				if(8-num > 0) {
					for(int j = 1; j<10; j++ ) {
						for(int i = dan; i<=num2; i++) {
							System.out.print((i+1) + "*" + j +  "=" +((i+1)*j) + "\t");
						}
						System.out.println();
					}
					dan += num;  //만약 3단까지 출력이라면 다음 단은 4단 
					num2 += num; //다음 단을 출력하기 위함 
					System.out.println("hello");
					
				}else{
					for(int j = 1; j<10; j++) {
						for(int i = dan; i<9; i++) {
//							System.out.println("dan : " + dan);
//							System.out.println("num2 :" + num2);
							System.out.print((i+1) + "*" + j +  "=" +((i+1)*j) + "\t");
						}
						System.out.println();
					}
					break;

				}
			}	
			break;
		}
	}

	public static void coffeeOrder() {
		Scanner scanner = new Scanner(System.in);
		
		int americano = 0;
		int latte    = 0;
		
		final int AMERICANO = 100;
		final int LATTE     = 200;
		
		while(true) {
			System.out.println("1. americano 2. latte 3. payment 4. close");
			
			int menu = scanner.nextInt();
			
			switch(menu) {
				case 1:
					americano++;
					System.out.println("americano order complete");
					break; // break 잘 걸기!!
				
				case 2:
					latte++;
					System.out.println("lattee order complete");
					break; // break 잘 걸기!!
					
				case 3:
					System.out.print("total order : ");
					int americanoTotal = americano * AMERICANO;
					int latteeTotal = latte * LATTE;
					System.out.println(americanoTotal + latteeTotal);
					
					americano = 0;
					latte = 0;
					break;
					
				case 4:
					scanner.close();
					System.exit(0);
					break;
		
				default:
					System.out.print("check your number ");
					break;

			}
		}
			
	}
		
	public static void changeRGB02() {
		int rgb = 0x88a5ff73;
		String strRgb = Integer.toBinaryString(rgb);
		System.out.println("현재 색상 : " + strRgb);
		
		int b = rgb << 24;
		System.out.println("비의 색상 : " + Integer.toBinaryString(b));
	
		int c = rgb >>> 24;
		System.out.println("씨의 색상 : " + Integer.toBinaryString(c));		
	}

	public static void changeRGB01() {
		int rgb = 0x88a5ff73;
		String strRgb = Integer.toBinaryString(rgb);
		System.out.println("현재 색상 : " + strRgb);
		
		int rgbTarget = 0x88a50073;
		int resultRgb =  rgb & rgbTarget;
		String changedRgb = Integer.toBinaryString(resultRgb);
		System.out.println("변경 색상 : " + changedRgb);

		
		
	}

	public static void changeBitwise() {
		// tmp를 활용한 값 바꾸기
		int d = 10;
		int e = -8;
		
		int tmp = 0;
		
		tmp = d;
		d = e;
		e = tmp;
		
		System.out.println("d : " + d + ", e :" + e);
		
		// 비트연산자를 활용한 값 바꾸기 
		int f = 10;
		int g = -8;
		
		f = f^g;
		g = f^g;
		f = f^g;
		
		System.out.println("f : "+ f + ", g :" + g);		
	}

	public static void bitwiseTest() {
		// & 연산자 
		int a = 10;
		int b = -10;
		int c = a&b;
		
		System.out.println("a : " + Integer.toBinaryString(a));
		System.out.println("b : " + Integer.toBinaryString(b));
		System.out.println("c : " + Integer.toBinaryString(c));
		
	}

	public static void scannerTest() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학번 :");
		int number = scanner.nextInt();
		
		System.out.print("이름 :");
		String name = scanner.next();	

		System.out.print("나이 :");
		int age = scanner.nextInt();

		scanner.nextLine(); // 이거 붙이기
		System.out.print("주소 :");
		String addr = scanner.nextLine();
	
		System.out.println("number : " + number);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("addr : " + addr);		
	}


}
