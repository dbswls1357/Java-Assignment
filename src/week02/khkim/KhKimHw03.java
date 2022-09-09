package week02.khkim;

import java.util.Scanner;


public class KhkimHw03 {
	
		private final static int 가위 = 0;
		private final static int 바위 = 1;
		private final static int 보 = 2;


	public static void main(String[] args) {

		int randomNum = (int) (Math.random() * 3); // 0~2

		System.out.println("가위(0), 바위(1), 보(2)중에 하나를 입력해주세요.");
		System.out.print("입력 : ");

		Scanner scanner = new Scanner(System.in);
		int userNum = scanner.nextInt();
		
		// 플레이어 패 입력 시작 
		while(true) {
				
				if (userNum > 2){ // 선택지 외 숫자 입력 
					System.out.println("선택지 외의 수입니다. 0~2 사이의 수를 입력해주세요.");
					break;
				}
				else {
					System.out.println("user : " + userNum);
					System.out.println(" com : " + randomNum);
					
					if (userNum - randomNum == 1) {
						System.out.println("승");
					}
					else if (userNum - randomNum == 0) {
						System.out.println("무승부");
					}else {
						System.out.println("패");
					}break;
				}
		}
		scanner.close();
	}

}
