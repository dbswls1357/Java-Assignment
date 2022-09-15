package week03.khkim;

public class KhkimHw02 {

		public static void main(String[] args) {
			System.out.println("201811962 김기현");
			lab02();
		}
		

		public static void lab02() {
			int[][] scores = { //3X4 : 행 3 열 4
					{10,20,30,0,0}, //{국,영,수,총점,순위}
					{20,30,40,0,0},
					{10,25,30,0,0},
					{30,30,40,0,0}
				};
			int sum = 0;
			for(int i=0; i<scores[0].length-1; i++ ) {
				for(int j=0; j<scores[0].length-2; j++) {
					sum += scores[i][j];
					scores[i][scores[0].length-2] = sum;
				}
				sum = 0;

			}
			
			printArray(scores);
		}

		// 랭킹 구하기 
		private static void printArray(int[][] scores) {
			
			for(int i = 0; i<scores.length; i++) {
				int ranking = 0;
				for(int j =0; j< scores.length; j++){
					if(scores[i][scores[0].length -2] < scores[j][scores[0].length -2]) {
						ranking++;
					}
				}
				scores[i][scores.length] = ranking + 1;
			}
			
			// 이름, 점수, 합산까지 출
			for(int i = 0; i< scores.length; i++) {
				String[] stdnames = {"홍길동", "고길동", "김길동", "이길동"};
				System.out.print(stdnames[i] + " >> ");
				int k = 0;
				for(int j : scores[i]) {
					if (k == 3)
						System.out.print(": ");
					else if (k == 4)
						System.out.print(": ");
					System.out.print(j + " ");
					k++;

				}			
				System.out.println();
			}
			
		}

	}
