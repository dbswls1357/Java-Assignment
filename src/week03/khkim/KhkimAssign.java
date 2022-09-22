package week03.khkim;

import java.util.Arrays;
import java.util.Scanner;

public class KhkimAssign {
	public static Scanner scanner = new Scanner(System.in);
	
	static final int ROW = 3;
	static final int COL = 3;
	
	public static void main(String[] args) {
		String[][] parkingSpace = new String[ROW][COL]; // 배열 초기화 

		while(true) {
			System.out.println("**** 주차 현황 ****");
			System.out.print(" "); // COL 출력 
			for(int i = 1; i<COL+1; i++) {
				System.out.print(" " + i);
			}		
			System.out.println();
			for(int j = 0; j<ROW; j++) {
				System.out.print(j+1 + " ");
				for(int k = 0; k<COL; k++) {
					parkingSpace[j][k] =  "♡";
					System.out.print(parkingSpace[j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();	
//			printParking(parkingSpace); // 함수로 만들면서 파라미터로 넘김
			
			while(true) {
				selectMenu(parkingSpace);
				break; // break를 걸어 주차현황을 print하도록 
			}
		}
	}


//	public static void printParking(String[][] space) {
//	
//	}


	public static void selectMenu(String[][] space) { // case1의 parking()에 파라미터로 space를 받기 위함
//	public static void selectMenu(String[][] space) { // case1의 parking()에 파라미터로 space를 받기 위함	
		System.out.println("1) 주차하기 2) 차량검색 3) 출차하기 4) 종료");
		System.out.print("메뉴를 선택하세요 : ");
		
	
		switch(scanner.nextInt()) {
			case 1:
				parking();
				break;
			case 2:
				System.out.print("case2 ");
				break;
			case 3:
				System.out.print("case3 ");
				break;
			case 4:
				System.out.print("종료합니다");
	
				System.exit(0);
				scanner.close();
				break;
			default:
				System.out.println("메뉴 번호를 확인 후 다시 입력해주세요.");
				break;
		}
		System.out.println();	
	}
		


	public static void parking() { // main 클래스의 2차원 배열을 받기 위함
		System.out.println();
		System.out.println("**** 주차 하기 ****");
		
//		KhkimAssign space = new KhkimAssign();

		
		while(true) {

			System.out.print("주차할 위치를 선택해주세요(입력예 : 2 1) : ");
			int parkingPlacRow = scanner.nextInt();
			int parkingPlaceCol = scanner.nextInt();
			if(parkingPlacRow > ROW || parkingPlaceCol > COL  ) {
				System.out.println("위치 번호를 확인해주세요. 처음부터 다시 시작해주세요.");
				continue;
				}

			scanner.nextLine();
			while(true) {
				System.out.print("차량 번호를 입력해주세요(입력예 : 20가1234) : ");
				String carNumber = scanner.nextLine();
				
				System.out.print("차량 번호 " +carNumber +" 맞습니까(y/n)");
				String correcter = scanner.nextLine();
				if(correcter.equals("n")) {
					System.out.println("처음부터 다시 진행해 주세요.");
					break;
				};			
			
				System.out.print(carNumber + " 차량의 주차를 완료하였습니다.");
//				System.out.println("===================================");
//				System.out.println(space[parkingPlacRow][parkingPlaceCol]);
//				if(space[parkingPlacRow][parkingPlaceCol].equals("♡")) {
//					space[parkingPlacRow][parkingPlaceCol] = "aa";
//				}
//				
				break;
			}
			break;
		}

		
		
		
	}

	public static void printParkingSpace() {



	}

}
