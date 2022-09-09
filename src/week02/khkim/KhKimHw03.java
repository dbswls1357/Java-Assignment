package week02.khkim;

import java.util.Scanner;

public class KhkimHw03 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 플레이어 패 입력 시작 
		while(true) {

			System.out.println("가위(0), 바위(1), 보(2)중에 하나를 입력해주세요.");
			System.out.print("입력 : ");


			try {
				int randomNum = (int) (Math.random() * 3); // 0~2

				int userNum = scanner.nextInt();
				
				if (userNum > 2){ // 선택지 외 숫자 입력 
					System.out.println("선택지 외의 수입니다. 0~2 사이의 수를 입력해주세요.");
					break;
				}
				else {
					// 숫자 입력타입 => 해당하는 문자로 변
					if (userNum == 0) {
						String numName = Integer.toString(userNum);
						numName = numName.replace("0", "가위");
						System.out.println("user : " + numName);
					}else if(userNum == 1) {
						String numName = Integer.toString(userNum);
						numName = numName.replace("1", "바위");
						System.out.println("user : " + numName);
					}else{
						String numName = Integer.toString(userNum);
						numName = numName.replace("2", "보");
						System.out.println("user : " + numName);
					}
					
					if (randomNum == 0) {
						String numName = Integer.toString(randomNum);
						numName = numName.replace("0", "가위");
						System.out.println(" com : " + numName);
					}else if(randomNum == 1) {
						String numName = Integer.toString(randomNum);
						numName = numName.replace("1", "바위");
						System.out.println(" com : " + numName);
					}else{
						String numName = Integer.toString(randomNum);
						numName = numName.replace("2", "보");
						System.out.println(" com : " + numName);
					}

			
					// 승패 조건 
					if ((userNum - randomNum) == 1 || (userNum - randomNum) == -2 ) {
						System.out.println("승");
					}
					else if ((userNum - randomNum) == -1 || (userNum - randomNum) == 2 ) {
						System.out.println("패");
					}else {
						System.out.println("무승부");
					}
				System.out.println();

				}
				continue;
			} // 예외 처리 
			catch (Exception e) {
				scanner.nextLine();
				System.out.println("잘못된 값이 입력되었습니다. 숫자 0~2사이의 값을 입력해주세요.");

			}
			System.out.println();

		}					
		scanner.close();

	}
}
