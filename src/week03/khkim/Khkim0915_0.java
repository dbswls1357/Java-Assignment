package week03.khkim;

import java.util.Random;

public class Khkim0915_0 {

	public static void main(String[] args) {
		// 예제1) 로또 번호 생성기. 1~45 사이의 로또 번호 6개를 생성. => 중복 제거 
		// 실습: 로또 번호를 생성해서 중복제거 및 선택정렬 사용한다. (오름차순으로 정렬) 연습해두라고 하심 
		lab01();
		

	}

	public static void lab01() {
		// 로또 번호 생성
		int[] lotto = makeLotto(); // 함수를 통해서 생성 
		if(lotto!=null) { // 참조변수여서 null값이 아님 
			for(int num : lotto) {
				System.out.println(num + " ");
			}
			System.out.println();
			
		}
		
		
		
	}
	// 로또 중복된 값들 버리기
	public static int[] makeLotto() { // 반환 타입은 int
		int[] lotto = new int[6]; // 배열 선언 
		Random r = new Random();
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;// 이 구문 주의하자 !! 실수
			for(int j=0; j<i; j++) {
				if(lotto[i]== lotto[j]) {
					// lotto[i] = r.nextInt(45)+1; 난수를 직접 넣으면 이전 값과 비교할 수 없음 
					i--; //i 이전값으로 되고, 브레이크가 걸려 for문에서 i++로 나간다  
					break;
					// break만 입력하면 i++ 번째에 영향을 미침 
				}
		}
			
		}
		
		return lotto;
	}


}
