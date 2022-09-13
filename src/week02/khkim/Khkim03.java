package week02.khkim;

import java.util.Scanner;

public class Khkim03 {

	public static void main(String[] args) {
		
//		// 예시 1 for문)
//		int i = 0;
//		int sum = 0;
//		
//		for(i = 1; i <= 10; i++) {
//			sum += i;
//			System.out.print(i);
//			
//			if(i<= 9) {
//				System.out.print("+");
//			}else {
//				System.out.print("=");
//				
//				System.out.print(sum);
//			}
//		}
		
		
//		// 예시 2 while문)
//		Scanner scanner = new Scanner(System.in);
//		
//		int count = 0, n = 0;
//		double sum = 0;
//		
//		System.out.println("0을 마지막에 입력");
//		while((n = scanner.nextInt()) != 0){
//			sum += n;
//			count++;
//		}
//		System.out.println("평균" + sum/count);
//		System.out.println("수" + count);
		
		
//		// 예시 3 do-while문)
//		char a = 'a';
//		
//		do {
//			System.out.print(a);
//			a = (char) (a+1);
//			
//		}while(a <= 'z');

		
//		// 예시 4 2중 for문)
//		for(int i = 1; i <10; i++) {
//			for (int j =1; j<10; j++) {
//				System.out.print(i + "*" + j + "=" + i*j);
//				System.out.print('\t');
//			}		
//			System.out.println();
//
//		}	
		
//		// 예시 5 continue)
		//continue : 반복 후 작업할 내용으로 이동함. {}를 빠져나가지 않음 
		
//		// 예시 6 break)
		//break :{}를 빠져나가는 반복문 + 가장 가까이에 있는 
		
//		// 예시 7 글자 수 출력하기)
//		// 조건 : 입력을 받고 공백이나 탭 등은 카운트 하지 않음
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("문장 입력해주세요 : ");
//		String input = scanner.nextLine();
//		
//		int count = 0;
//		for(int i = 0; i<input.length(); i++) {
//			char ch = input.charAt(i);
//			if ((ch != ' ')&& (ch != '\t' )) {
//				count += 1;
//				// count++
//			}
//		}
//		System.out.println("글자수 : " + count);
//		scanner.close();
			

//		// 예시 8 커피 주문하기)
		Scanner scanner = new Scanner(System.in);
		
		int americano = 0;
		int latte     = 0;
		
		final int AMERICANO = 100;
		final int LATTE     = 200;
		
		while (true) {
			System.out.println("아메리카노 1. 100원 라떼 2. 200원 3. 결제 4. 종료 ");
			
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				americano++;
				System.out.println("americano 주문완료 ");
				System.out.println();
				break;
				
			case 2:
				latte++;
				System.out.println("latte 주문완료 ");
				System.out.println();
				break;
				
			case 3:
				System.out.println("++++++++++++++ ");
				System.out.println("결제 금액 ");
				System.out.println("++++++++++++++ ");
				System.out.println("아메리카노" +americano +"잔" +( americano*AMERICANO)+"원");
				System.out.println("라떼" +latte +"잔" +( latte*LATTE)+"원");
				
				int total = (americano*AMERICANO) + (latte*LATTE);
				System.out.println("결제 금액 " + total);
				System.out.println("++++++++++++++ ");
				americano = 0; // 주문이 끝나고 초기화 
				latte     = 0; // 주문이 끝나고 초기화 
				break;
				
			case 4:
				scanner.close();
				System.out.println("시스템을 종료합니다.");
				System.exit(0); // 시스템 종료 !!!!
				break;
				
			default:
				System.out.println("메뉴를 확인해주세요");
				System.out.println();
				break;
			}
			
		
		}

		
		
		
		
	}

}
