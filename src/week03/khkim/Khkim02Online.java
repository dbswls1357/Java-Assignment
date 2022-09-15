	package week03.khkim;

public class Khkim02Online {


	
	public static void main(String[] args) {
		// 예제. 정렬하기(선택 정렬)
		// 선택정렬
		// 1. 주어진 리스트 중에서 최소값을 찾는다.
		// 2. 그 값을 맨 앞의 값과 교체를 한다.
		// 3. 맨 처음 위치를 뺀 나머지 리스트를 1번, 2번의 방법으로 교체한다. 
//		lab01();	// 수 정렬 
// 		lab02();	// 문자 정렬 	
 		lab03();	// 배열이 같은지 여부를 확인 

		
		
	}

	public static void lab01() {
		// 선택 정렬 
	
		int[] list = {10,50,30,60,70,20};
//		2.
//		int[] list1 = new int[] {10,50,30,60,70,20};
//		3.
//		int[] list1 = new int[6];
//		list1[0] = 10;
//		list1[1] = 50;
//		list1[2] = 30;
//		list1[3] = 60;
//		list1[4] = 70;
//		list1[5] = 20;
//		
		//for(int k : list1) {System.out.print(k);} //10 50 30 60 70 20
		//System.out.println(list1);                //[I@4c203ea1

		int minIndex, tmp;
		System.out.print("before : ");
		for(int k : list) {System.out.print(k + "\t");}
		System.out.println();

		
		for(int i = 0; i<list.length -1; i++) { // 인덱스 값은 -1해줘야 함, i로 마지막은 할 필요 X
			minIndex = i;
			for(int j = i+1; j<list.length; j++) {
				if (list[minIndex] > list[j] ) {
					minIndex = j;
					
				}
			}if(minIndex != i) { // 값을 변경해야 하는 경우 
//				// 1. swap with using temp varible
//				tmp = list[minIndex];
//				list[minIndex] = list[i];
//				list[i] = tmp;
				
				// 2. swap with using bitwise operator
				list[i]        = list[i]^list[minIndex];
				list[minIndex] = list[i]^list[minIndex];
				list[i]        = list[i]^list[minIndex];
				
			}
		}
		System.out.print("after  : ");
		for(int k : list) {System.out.print(k + "\t");}
		
	}
	


	public static void lab02() {
		// 선택 정렬 : 문자 
	
		String[] list = {"홍길동","김길동 ","이길동","고길동", "최길동"};

//		
		//for(int k : list1) {System.out.print(k);} //10 50 30 60 70 20
		//System.out.println(list1);                //[I@4c203ea1

		int minIndex, tmp;
		System.out.print("before : ");
		for(String k : list) {System.out.print(k + "\t");}
		System.out.println();

		
		for(int i = 0; i<list.length -1; i++) { // 인덱스 값은 -1해줘야 함, i로 마지막은 할 필요 X
			minIndex = i;
			for(int j = i+1; j<list.length; j++) {
				if (list[j].compareTo(list[minIndex]) < 0) { // 사전식으로 크기 비교, compareTo : 
					// compareTo : 앞의 문자열이 뒤의 인자보다 더 작다면 : - 값을 반환, 같다면 : 0, 크다면 +값  
					minIndex = j;
					
				}
			}if(minIndex != i) { // 값을 변경해야 하는 경우 
				// 1. swap with using temp varible
				String tmp1 = list[minIndex];
				list[minIndex] = list[i];
				list[i] = tmp1;
				
				
			}
		}
		System.out.print("after  : ");
		for(String k : list) {System.out.print(k + "\t");}
		
	}
	
	
	
	
	public static void lab03() {
		int[] arr1 = {1,2,3,4};		
		int[] arr2 = {1,2,3,4};
		
		
		boolean result = arrEquals(arr1, arr2);
		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
		System.out.println(result ?"같음":"같지 않음");

	}

	public static boolean arrEquals(int[] arr1, int[] arr2) {
		
//		if(arr1 == arr2) // false 
//			return true;
		
		if(arr1.length != arr2.length) 
			return false;
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] != arr2[i]) {  // arr1.equals(arr2) 는 왜 안되는가...
				return false;
			}		
		} 
		return true; // false 조건으로 필터링 한 후 마지막은 true만 남김 
	}
	



}
