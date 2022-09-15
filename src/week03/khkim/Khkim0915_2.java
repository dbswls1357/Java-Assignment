package week03.khkim;

public class Khkim0915_2 {

	public static void main(String[] args) {
		// 다차원배열
		// array.length : 층을 반환함. 
		// array[0].length : 층의 방의 개수를 반환함.
		
		//예제. 성적의 총점 구하기
		lab03();
	}
	

	private static void lab03() {
		String[] stdnames = {"홍길동 ", "김길동", "고길동"};
		int[][] scores = { //3X4 : 행 3 열 4
				{10,20,30,0}, //국,영,수,총점
				{50,20,30,0},
				{40,20,30,0}
//				{40,20,30,0,0} // 순위도 추가 
			};
		// 총점 계산, 나의 풀이 
//		int sum = 0;
//		for(int i=0; i<scores[0].length-1;i++ ) {
//			
//			for(int j=0; j<scores[0].length-1;j++) {
//				sum += scores[i][j];
//				scores[i][scores[0].length-1]= sum;
//			}
//			sum = 0;
//		}
		
		// 교수님 풀이 
		for(int[]arr:scores) { // for-each는 인덱스 접근이 안되고, 전체 다 읽음. => 총점이 두배가 됨 
			int i = 0;
			for(int num:arr) {
				if(i!=arr.length-1) {
					System.out.print(" : ");
				arr[arr.length-1] += num; // 왜 안되지
				i++;
				}
				// 과제 : 배열에 저장해 둔 순서대로 출력 
			}
		}
		
		
		printArray(scores);
	}


	private static void printArray(int[][] scores) {
		// TODO Auto-generated method stub
		for(int[] arr:scores) { // arr 의 의미는 행단위로 끊어서 가져온다 
			for(int data : arr) { // arr로부터의 데이터를 가져옴 
				System.out.print(data + " ");
				
			}System.out.println();
		}
		
	}
	
	

	

}
