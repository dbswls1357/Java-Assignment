package week03.khkim;

import java.util.Random;

public class KhkimHw01 {
	public static void main(String[] args) { 
		System.out.println("201811962 김기현");
		// sorter로 sorting 된 리스트 반환 

		sorter();
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
	public static void sorter() {
		// 선택 정렬 
	
		int[] list = makeLotto();

		int minIndex, tmp;

		
		for(int i = 0; i<list.length -1; i++) { // 인덱스 값은 -1해줘야 함, i로 마지막은 할 필요 X
			minIndex = i;
			for(int j = i+1; j<list.length; j++) {
				if (list[minIndex] > list[j] ) {
					minIndex = j;
				}
			
			}if(minIndex != i) { // 값을 변경해야 하는 경우 
				list[i]        = list[i]^list[minIndex];
				list[minIndex] = list[i]^list[minIndex];
				list[i]        = list[i]^list[minIndex];
			}
		}
		System.out.print("로또 번호 : ");

		for(int k : list) {
			System.out.print(k + " ");
		}
		
	}
	



}
