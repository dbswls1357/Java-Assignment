package week03.khkim;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Khkim0915Recap {

	public static void main(String[] args) {
		//lab01Test();
		//lab02Test();
		//lab03Test();
		lab04Test();
	}
	
	
	

	public static void lab04Test() {
		// 가변배열 생성 
		int[][] arr = makeArray2D();
		
	}




	public static int[][] makeArray2D() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("층의 개수 : ");
		final int ROW = scanner.nextInt();
		int[][] array = new int[ROW][];
		
		for(int i=0; i<array.length;i++) { // 각각 ROW에 해당 
			System.out.print(i + "층의 개수 : " );
			final int COL = scanner.nextInt();
			array[i] = new int[COL]; 			// 표현을 암기하자!

		}
		
		Random r = new Random();
		
		for(int[] num : array) {
			for(int i=0; i<num.length; i++) {
				num[i] = r.nextInt(100);
			}
		}
		//print2DArray(array);
		System.out.println(Arrays.deepToString(array));

		return array;
	}




	public static void lab03Test() {
		String[] names = {"홍길동", "김길동", "고길동"};
		int[][] scores = {
				{10,20,30,0},
				{50,20,30,0},
				{40,20,30,0}
		};
//		// 나의 풀이 
//		int sum = 0;
//		for(int i = 0; i<scores[0].length-1;i++) {
//			for(int j = 0; j<scores[0].length-1;j++) {
//				sum += scores[i][j];
//				scores[i][3] = sum;
//			}
//			sum = 0;
//		}
		//System.out.println(Arrays.deepToString(scores));
		
		for(int[] arr : scores ) {
			int i = 0;
			for(int data:arr) {
				if(i != arr.length-1) {
					arr[arr.length -1] += data;

					i++; // 이게 없으면 왜 더하기 값이 두배가 되지?
				}
			}
		}
		
		print2DArray(scores);

	}

	public static void print2DArray(int[][] scores) {
		for(int[] array : scores ) {
			for(int data : array) {
				System.out.print(data + " ");
			}
			System.out.println();
		}
		
	}
	
	
	

	public static void lab02Test() {
		int[] answer = {1,2,3,3,2,1};
		int[] std1 = {1,2,3,4,1,1};
		int[] std2 = {1,2,3,4,1,1};
		
		//System.arraycopy(src, srcPos, dest, destPos, length)
		//src : 원본, srcPos : 원본을 어디서부터 읽어올지, 
		//dest : 복사할 대상, desPos : 복사본을 어디서 부터 쓸 지
		//length : 원본에서 복사본으로 데이터를 읽어서 쓸 데이터 길이 
		
		int[] std = new int[std1.length + std2.length];
		System.arraycopy(std1, 0, std, 0, std1.length);
		System.arraycopy(std2, 0, std, std1.length, std2.length);

		int[] quizResult = getQuizResult(answer, std1.clone());
		
		
		printArray(std);
		printArray(new int[] {1,2,3,4,5,6});
		printArray(quizResult);
		
		
	}

	public static int[] getQuizResult(int[] answer, int[] clone) {
		for(int i = 0; i<answer.length; i++) {
			if(answer[i]==clone[i]) {
				clone[i] = 1;
			}else{
				clone[i] = 0;
			}
		}
		
		
		return clone; // clone이 필요한거니까 리턴 꼭 해주기!!
	}

	public static void printArray(int[] array) {
		for(int s : array) {
			System.out.print(s + " ");
		}
		System.out.println();
		
	}

	
	
	
	public static void lab01Test() {
		// 로또 번호 생성
		int[] lotto = makeLotto();
		if(lotto!=null) {
			for(int num : lotto) {
				System.out.println(num);
			}
			System.out.println();
		}
	}

	public static int[] makeLotto() {
		int[] lotto = new int[6];
		Random r = new Random();
		for(int i = 0; i<lotto.length; i++) { 
			lotto[i] = r.nextInt(45) +1;
			// 중복방지
			
			for(int j = 0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--; // 중복된 i값 이전으로 넣어 break를 통해 밖으로 나가도록 함. 
					break;
				}
			}
		}
		
		
		
		
		return lotto;
	}

}
