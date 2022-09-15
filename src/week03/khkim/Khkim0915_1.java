package week03.khkim;

public class Khkim0915_1 {

	public static void main(String[] args) {
		// 배열 복사, 스택과 힙  
		// 원본 데이터를 수정하면 안된다 => 배열 복사의 방법을 사용
		// => System.arraycopy(), Object.clone()
		
		// 예제) 정답 체크하기
		lab02();
		
	}

	private static void lab02() {
		int[] answer = {1,2,3,3,2,1};
		int[] std1 = {1,2,3,4,1,1};
		int[] std2 = {1,2,3,4,1,1};
		
		int[] std = new int[std1.length + std2.length];
		System.arraycopy(std1, 0, std, 0, std1.length);
		System.arraycopy(std2, 0, std, std1.length, std2.length); // 두개에 해당하는 데이터 합치기 
		printArray(std);
		
		printArray(new int[] {1,2,3,4,5}); // 익명 배열 생성 
		//printArray({1,2,3,4,5}); //new int가 빠지면 안됨.  

		
		int[] quizResult = getQuizResult(answer,std1.clone()); // std1(학생의 답)은 변경되지 않도록 함 
		
		printArray(answer);
		printArray(std1);
		printArray(quizResult);
		
		
		
	}

	private static void printArray(int[] array) {
		for(int s:array) {
			System.out.print(s + " ");
			
		}
		System.out.println();
		
	}

	private static int[] getQuizResult(int[] answer, int[] std1) {
		for(int i=0; i<answer.length; i++) {
			if(answer[i]== std1[i]) {
				std1[i] = 1;
			}else {
				std1[i] = 0;
			}
		}
			
		return std1;
	}

}
